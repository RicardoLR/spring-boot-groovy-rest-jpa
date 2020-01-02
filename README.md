# Project Spring boot 2 with groovy, sonar y jacoco


## execution with gradle wrapper

`./gradlew bootRun`

HTML jacoco testing -> build/reports/tests/test/index.html
HTML jacoco report -> build/jacocoHtml/index.html
```
./gradlew clean build
./gradlew build
./gradlew sonarqube
./gradlew build jacocoTestReport
```

```
./gradlew sonarqube -Dsonar.host.url=http://192.168.100.5:9000 -Dsonar.login=0c908612622d30f92c28daeb41ba60be9cead15b -Dsonar.projectKey=name-proyect
```


## execution sonar docker

"Versiones compatibles entre plugins": https://docs.sonarqube.org/display/PLUG/Plugin+Version+Matrix
"Dowload http://www.sonarplugins.com/groovy"
```
docker run -d -p 9000:9000 sonarqube:6.7-community
docker run -d --name sonarqube6-7 -p 9000:9000 sonarqube:6.7-community
```

"Copy plugin to docker container": 

`docker cp sonar-groovy-plugin-1.5.jar 1ef62da098a0:/opt/sonarqube/extensions/plugins/`


### If you are getting an error like this
java.lang.ClassNotFoundException: javax.xml.bind.JAXBException

That means you are using Java version > 1.8
To solve this, go to "build.gradle" and add runtime(‘javax.xml.bind:jaxb-api’) inside dependencies. 


### Calls

```
curl http://localhost:8001/hero
curl http://localhost:8001/errores
```
