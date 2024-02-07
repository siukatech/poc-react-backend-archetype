# React-Backend-Archetype
This is the archetype-project to generate maven ms-project with importing the OAuth2, end-to-end-encryption and others are taking care by the `react-backend-parent` library.  



# Reference
**Apache official document and guideline**  
https://maven.apache.org/guides/mini/guide-creating-archetypes.html  

**Baeldung tutorial**  
I think apache official document is much better.  
This can only take as reference.  
https://www.baeldung.com/maven-archetype  



# Maven
## Setup
### pom.xml  
This `artifactId` MUST be same as `archetype-metadata.xml`'s attribute `name` value.
```xml
...
	<groupId>com.siukatech.poc</groupId>
	<artifactId>maven-archetype-generator</artifactId>  <--- 
	<version>0.0.1-SNAPSHOT</version>
	<packaging>maven-archetype</packaging>
...
```

### archetype-metadata.xml
The attribute `name` MUST be same as `pom.xml`'s `artifactId`.  
```xml
<archetype-descriptor
...
        name="maven-archetype-generator"  <---
>
...
```



### Code gen command
**Template**  
```shell
mvn archetype:generate \
  -DarchetypeGroupId=<archetype-groupId> \
  -DarchetypeArtifactId=<archetype-artifactId> \
  -DarchetypeVersion=<archetype-version> \
  -DgroupId=<my.groupid> \
  -DartifactId=<my-artifactId> \
  -Dversion=<my-version> \
  -Dpackage=com.siukatech.poc.test.artifact
```

**Example**
```shell
mvn archetype:generate \
  -DarchetypeGroupId=com.siukatech.poc \
  -DarchetypeArtifactId=maven-archetype-generator \
  -DarchetypeVersion=0.0.1-SNAPSHOT \
  -DgroupId=com.siukatech.poc \
  -DartifactId=test-artifact \
  -Dversion=0.0.1-SNAPSHOT \
  -Dpackage=com.siukatech.poc.test.artifact
```

**Example (one line version)**  
```shell
cd ../../ && mvn clean install && cd target && mkdir codegen && cd codegen && mvn archetype:generate -DarchetypeGroupId=com.siukatech.poc -DarchetypeArtifactId=maven-archetype-generator -DarchetypeVersion=0.0.1-SNAPSHOT -DgroupId=com.siukatech.poc -DartifactId=test-artifact -Dversion=0.0.1-SNAPSHOT -Dpackage=com.siukatech.poc.test.artifact
```



# Git
## Script
**Template**  
```shell
git init
git branch -m main
git remote add origin <your github home page url>/<your project name>.git
git add .
git commit -m "initial commit"
git push origin main
```

**Example**
```shell
git init
git branch -m main
git remote add origin https://github.com/siukatech/poc-react-backend-archetype.git
git add .
git commit -m "initial commit"
git push origin main
```



