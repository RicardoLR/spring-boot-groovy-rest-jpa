# project Spring boot 2 with groovy


## execution with gradle wrapper

./gradlew bootRun

HTML jacoco testing -> abuild/reports/tests/test/index.html
./gradlew clean build
./gradlew build
./gradlew sonarqube 

### If you are getting an error like this
java.lang.ClassNotFoundException: javax.xml.bind.JAXBException

That means you are using Java version > 1.8
To solve this, go to "build.gradle" and add runtime(‘javax.xml.bind:jaxb-api’) inside dependencies. 


### Calls

curl http://localhost:8001/hero

curl http://localhost:8001/errores