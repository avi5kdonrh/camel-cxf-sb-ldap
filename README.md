# Camel-CXF LDAP authentication on Spring Boot

### Prerequisites
- Make sure that an ldap server is running and configure the src/main/resources/login.config file to target that server.
- As this example uses JDK's LDAPLoginModule, the location of login.config has to be specified as a value of `java.security.auth.login.config` system property.
  So either run the jvm with `-Djava.security.auth.login.config=src/main/resources/login.config` or add this to the start of the run method:
 `System.setProperty("java.security.auth.login.config", "src/main/resources/login.config");`

### Building

The example can be built with

    mvn clean install

### Running

    mvn spring-boot:run
### Usage
- Get the wsdl from http://localhost:8082/get?wsdl
- Now make a request with basic authentication.
