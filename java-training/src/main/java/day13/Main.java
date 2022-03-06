package day13;

/*
(i)write a class Database with a constructor taking in appropriate
parameters. Include appropriate fields of this class like
mysql url, username, password, database.

(ii) Make this class Singleton

(iii) Make it Lazy loaded


------------------------------------------
(iv) Achieve the same thing using Java based Configuration ( The @Bean annotation)

(v) Achieve the same thing using the xml based configuration

Bean scope in xml can be specified like this -
<bean scope="singleton"/>
<bean scope="prototype"/>

(vi) After configuring the beans with xml. Do test whether you are getting
the same object or different object by comparing the hashcode.


 */
public class Main {

}
/*
HTTP requests - GET, POST, PUT
https://www.hostname.com <- url of the HTTP request
https://www.hostname.com?name=value&name1=value1&name2=value2
name=value&name1=value1&name2=value2 -> Query parameters, they are key value pairs
https://icicibank.com/balance?accountNumber=1023  GET Request
returns in response your balance and that balance is shown on the browser GUI

JSON -> {"name" : "youname", "dob":"10-10-1990", "gender":"male"}
https://jsonlint.com/

{
	"name": "jim",
	"dob": "10-10-1985",
	"age": 25,
	"favbooks": ["book-1", "book-2", "book-3"],
	"houseDetails": {
		"address": "delhi",
		"pincode": 120312
	}
}

Ex: Construct a Json object representing A Employee,
This will
name, address, company, yearOfExperience, Manager, languages

JSON Object starts and ends ith {}
JSON array looks like []
Nested Json
Each element in JSON is a key value pair.

HTTP response status codes
1xx -> Informational responses
2xx -> Successful responses
3xx -> Redirection messages
4xx -> client error responses
5xx -> Server error responses

GET, <-- When you want to fetch some information from the server
POST, <-- When you create some new data at server side
PUT, <-- Is used to update an existing data at server side
DELETE <-- When you are deleting a data

Twitter

https://www.twitter.com

1) User can create an account
https://www.twitter.com/create  POST
{"name":"","email":""}

2) User can fetch account details
https://www.twitter.com/fetch?email=tim@gmail.com  GET

3) User can update account details
https://www.twitter.com/update PUT
{"name":"","email":}

4) User can delete account
https://www.twitter.com/delete?email=tim@gmail.com DELETE

Ex:
  Write API for following
(i) When the user click on a follow button
    https://www.twitter.com/follow   PUT/POST
    {
    "userID" : "" // the userID of the requester
    "followUserID" : ""
    }
    Database : userID and a list of it's followers
    So here I am creating a new follower, or
    I am adding one more follower to the list


(ii) A new tweet is posted
https://www.twitter.com/tweet/new   POST
{
"userID":"",
"tweet":"content of tweet"
}

(iii) Return all tweets
https://www.twitter.com/tweet?userId=123   GET
{"tweets":["tweet1","tweet2","tweet2"]}

Designing HTTP API
(i) The URL (ii) HTTP Method (iii) Request Body (iv) Response Body (v) Query Parameters
Ex :
Think of designing API's for facebook.
5 API's
1) User account creationg
2) Follow another user
3) Friend another user
4) unfriend another user
5) post
6) likes
 */