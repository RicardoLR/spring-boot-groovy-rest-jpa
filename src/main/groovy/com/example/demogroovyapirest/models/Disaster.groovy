package com.example.demogroovyapirest.models

import javax.persistence.*

@Entity
class Disaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id

	String title

	String location

	Date time

	boolean isResolved = false

	@ManyToMany( // tell persistence provider 'heroes' is many-to-many relation with Disaster
	fetch = FetchType.EAGER // always fetch values when Disaster entity is loaded
	)
	@JoinTable( // tell persistence provider we need a join table with this specification
	name = 'disaster_hero', // specify table name
	joinColumns = @JoinColumn(name = 'disaster_id'), // column name for this reference
	inverseJoinColumns = @JoinColumn(name = 'hero_id') // column name for related class reference
	)
	Set<Hero> heroes


	public Disaster() {
		super();
	}

	public Disaster(Long id, String title, String location, Date time, boolean isResolved) {
		super();
		this.id = id;
		this.title = title;
		this.location = location;
		this.time = time;
		this.isResolved = isResolved;
	}

	@Override
	public String toString() {
		return "Disaster [id=" + id + ", title=" + title + ", location=" + location + ", time=" + time + ", isResolved="
		+ isResolved + "]";
	}


}
