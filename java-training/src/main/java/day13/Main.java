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
Each element in JSON is a key value pair.
 */