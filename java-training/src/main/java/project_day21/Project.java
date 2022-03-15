package project_day21;
/*
<div>
    {{#users}}
        <h3>{{email}}</h3>
    {{/users}}
</div>

users = [{"email":"a@gmail.com"},{"email":"b@gmail.com"},{"email":"c@gmail.com"}]

Template and data are merged or combined to finally produce and html
After processing of this template and data we will have the following HTML
<div>

        <h3>a@gmail.com</h3>
        <h3>b@gmail.com</h3>
        <h3>c@gmail.com</h3>

</div>
 */
/*
User login, making tweets.
Reference:
(i) Form Tag in HTML (for making http request from web page)
https://www.w3schools.com/tags/tag_form.asp

(ii) Tag to be used when making a tweet
 https://www.w3docs.com/snippets/html/how-to-create-a-multi-line-text-input-field-in-html.html

(iii) Manual for Mustache. This explains all the different kind of keyword available in mustache.
Like {{}}, {{#}},...
https://mustache.github.io/mustache.5.html


Ex:
(1) Make an API that list down all the tweets of a user.
You can pass email or id in the query params

(2) Make a separate HTML page having a button. Which when clicked
takes to the (i) API so that it automatically lists down the tweets of the user.

(3) Make a simple login page with two fields for entering username and password
and a button. When button is clicked there is either an error in case of invalid password
or it takes to the list of all tweets that the user has made.

(4) Provide a field on tweets page to create a new tweet.
This will need a field and a button to create which will link
to the already written api for creating a tweet

(5) Provide a button to create a new user on the login page which when clicked
takes to another page where user can enter name and password

(6) Provide functionality to add followers

(7) Make sure you are using Database here with hibernate

(8) Use interceptors to validate requests

(9) Use Streams whereever possible in your code.

(10) All Pages should have a minimal GUI

(11) Follow Good design principles

(12) Good variable naming conventions

13) Use a Separate controller for dealing with API that has a follow in the path of the url

14) Handle exception using @ExceptionHandler annotation one locally and other globally using the @ControllerAdvice
annotation

15) Add a property followers.allowed:true in application.properties.
This could be set to follower.allowed:false   (False or true)
If its false. You should hide the presence of any follower buttons in the GUI
and non of the followers API should work.
Think of it as like a property using which we can modify our application with just a single switch
IF we want to deploy the application without the followers functionality then we can
simply use follower.allowed:false in the application.properties.
If this property is not present in the application.properties then by default assume the value is true.

 */
public class Project {
}
