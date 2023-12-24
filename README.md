
dependencies
```groovy
compileOnly('javax:javaee-api:8.0.1')
compileOnly('javax.mvc:javax.mvc-api:1.0.0')
compileOnly('javax.xml.ws:jaxws-api:2.3.1')
compileOnly('javax.jws:javax.jws-api:1.1')

compileOnly('javax.faces:javax.faces-api:2.3')
implementation 'com.sun.faces:jsf-api:2.2.20'
implementation 'com.sun.faces:jsf-impl:2.2.20'

// https://mvnrepository.com/artifact/org.primefaces/primefaces
implementation 'org.primefaces:primefaces:13.0.4'


testImplementation("org.junit.jupiter:junit-jupiter-api:${junitVersion}")
testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:${junitVersion}")
```


- Section 03: The Basics of JavaServer Faces
    - Question 01: Writing a Simple JSF Application
    - Question 02: Writing a Controller Class
    - Question 03: Building Sophisticated JSF Views with Components
    - Question 04: Displaying Messages in JSF Pages
    - Question 05: Updating Messages Without Recompiling
    - Question 06: Navigating Based Upon Conditions











