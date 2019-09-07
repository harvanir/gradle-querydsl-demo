# Getting Started

### Libraries & Tech
* Springboot 1.5.22
* Gradle 4.8
* MapStruct 1.3.0
* QueryDsl 4.1.4
* GoogleJavaFormat 1.7.0
* Lombok
* PostgreSQL
* Git hooks: pre-commit


### Gradle command
#### Clean
```shell script
./gradlew clean
```
#### Build
```shell script
./gradlew build
```
#### Do Formatting Java Code
```shell script
./gradlew goJF
```
#### Verify Java Code Format
```shell script
./gradlew clean verifyFormat build
```

### Commit changes
```shell script
git add .
git commit -m "<<Your commit message>>"
```