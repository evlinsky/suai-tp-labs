# maven example
Install Maven
==============
1. sudo apt-get install maven

Use maven
=========
1. cd to directory with "pom.xml"
2. compile
    * run "mvn compile"
    * see class files in "target/classes"
3. clean
    * run "mvn clean"
    * see that "target" directory disappears
4. test
    * run "mvn test"
    * see that all tests passed
5. package
    * run "mvn package"
    * run "java -jar target/example-1.0.jar"

Read
====
1. read sources in "src/main/java"
2. read tests in "src/test/java"
3. read project file "pox.xml"
