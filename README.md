#Spring Boot Book Seller

##End-Points

###Sign-Up

````
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 78

{
"name" : "user5",
"username": "user5",
"password": "user5"
}
````

###Sign-In

````
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 55

{
    "username": "user5",
    "password": "user5"
}
````

