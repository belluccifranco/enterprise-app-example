<h2>Enterprise App Example</h2>

Very simple example that show how to deploy a EAR file containing a webapp, webservice and a library

How to run:
- Run "mvn clean install" (from POM parent)
- Move the EAR file from /ear-module/target to the deployments folder inside Wildfly/TomEE
- Start Wildfly/TomEE
- Test http://localhost:8080/webservice-module/HelloWebServiceImpl?wsdl or http://localhost:8080/webservice-module/HelloWebServiceImplService?wsdl
- Test http://localhost:8080/web-module
- Enjoy!
