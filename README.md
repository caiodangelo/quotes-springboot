# quotes-springboot

## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.caio.QuotesApplication` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```
## How to use

|Info|Method|Path|Input|Output|
| --- | --- | --- | --- | ---- |
|Get all all Quotes|Get  | /quotes|| Array of Quotes|
|Get a Quote by id |Get  | /quotes/{id}|| A Quote|
|Get a random Quote|Get  | /quotes/random|| A Quote|
|Create a Quote|Post | /quotes|A quote payload||
|Delete a Quote|Delete   | /quotes/{id}||
|Delete all Quotes|Delete   | /quotes||

Example of payload

Quote
```
{
	"id": "1", 
	"author": "Charles Reade", 
	"text": "Example is contagious behavior.",
	"date": "01/02/2003",
}
```
