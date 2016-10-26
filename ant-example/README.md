# ant example
Install Ant
==============
1. sudo apt-get install ant

Use ant
=========
1. cd to directory with "build.xml"
2. compile
    * run "ant compile"
    * see class files in "build/main"
3. clean
    * run "ant clean"
    * see that "build" directory disappears
4. test
    * run "ant test"
    * see that all tests passed
5. package
    * run "ant jar"
    * run "java -jar build/example.jar"

Read
====
1. read sources in "src/main/java"
2. read tests in "src/test/java"
3. read project file "build.xml"
