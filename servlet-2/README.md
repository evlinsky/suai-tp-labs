# servlet-2
Prerequirements
===============
Tomcat is installed. See servlet-1 for details.

Configure Tomcat
=================
1. copy files from this repository to /home/user/apache-tomcat-6.0.47/webapps/
2. copy /home/user/apache-tomcat-6.0.47/webapps/servlet-2/tomcat-users.xml to /home/user/apache-tomcat-6.0.47/conf (overwrite existing file)
3. run Tomcat (See servlet-1 for details)
4. go to http://localhost:8080/manager/html/  (login:tomcat password:tomcat)
5. manage your servlets (stop, start, reload etc)

Create second servlet
====================
1. copy files from this repository to /home/user/apache-tomcat-6.0.47/webapps/
2. cd /home/user/apache-tomcat-6.0.47/webapps/servlet-2
3. comile servlet: javac -cp ../../lib/servlet-api.jar:src/ src/*.java -d WEB-INF/classes
4. reload your servlet using manager (see "Configure Tomcat")
5. go to: http://localhost:8080/servlet-2/servlet/Testing

Read
====
1. src/TestingServlet.java and src/Names.java (put attention on synchronized)
2. WEB-INF/web.xml (put attention on * in <url-pattern>)
