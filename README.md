# spring-mvc-demo

To run the server in dev mode:
1. Download Apache tomcat server
2. Create a new project in Eclipse of type "Web:Dynamic Web Project"
3. Copy the src and WEB_INF content into this project
4. Add Spring Framework JAR files into the WebContent/WEB-INF/lib folder and add it to the project build path
5. Download and copy these 2 files in WebContent/WEB-INF/lib folder: javax.servlet.jsp.jstl-1.2.1, javax.servlet.jsp.jstl-api-1.2.1
6. In project properties -> Java Build Path -> Libraries -> Add Library -> Web App Libraries: add the above JAR files from step 4 and 5
7. Add the tomcat server to the project
8. Right click on the project name, spring-demo-mvc, and run as: "Run on Server" 

To run for production (Deploy to tomcat):
1. Right click on the project name, spring-demo-mvc, and export it as a WAR file into: /Apache Software Foundation/Tomcat 9.0/webapps/ 
2. Wait 10 seconds to make the deployment, you'll know the deployment is over when a new folder with your WAR file name is created in webapps.
