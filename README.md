# spring-boot-oauth2-sso
A sample project showing how to implement Oauth2 in Spring Boot

It demonstrates how to get the basic interaction between:

* An authorization server: is the responsible to grant access tokens to trusted clients.
* A resource server: is a REST API server which is protected and verifies that only authorized clients can access to its content.
* A client app: is a web page that first request authorization on the authserver and then uses the data exposed by resource server.

It demo also shows a way to implement the **logout (single sign off)** functionality that is not covered in the official Spring Boot Oauth2 tutorials.
