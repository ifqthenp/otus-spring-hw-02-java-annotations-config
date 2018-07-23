# Otus Spring Framework Developer

- Student: Andrei Bogomja
- Course: Jun-2018

## Homework 2. Java and Annotations based Spring configuration

- Rewrite [Homework 1](https://github.com/ifqthenp/otus-spring-hw-01-ioc-xml)
using Java- & Annotation-based configuration
- Add properties file for the application
- Internationalize (i18n) output messages and questions from testing applications

## How to get the project running

Clone repository from GitHub:

```shell
git clone git@github.com:ifqthenp/otus-spring-hw-02-java-annotations-config.git
```

Change into the cloned folder:

```shell
cd otus-spring-hw-02-java-annotations-config
```

Make `gradlew` script executable (or use `gradlew.bat` if running on Windows):

```shell
chmod +x gradlew 
```

Build executable `jar`:

```shell
./gradlew clean fatJar
```

Run the program:

```shell
java -jar build/libs/otus-spring-hw-02-java-annotations-config.jar
```

Application's default locale is `en-GB`. To change locale to `ru-RU` or `lv-LV`
change locale in `application.properties` file and re-build the project using
`./gradlew clean fatJar` command. Another option is to pass environment variable
to the JVM:

```shell
java -jar -Dapplication.locale=lv-LV build/libs/otus-spring-hw-02-fatjar.jar
```

