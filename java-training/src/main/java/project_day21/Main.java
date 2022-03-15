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
(i) Make an API that list down all the tweets of a user.
You can pass email or id in the query params

(ii) Make a separate HTML page having a button. Which when clicked
takes to the (i) API so that it automatically lists down the tweets of the user.

(iii) Make a simple login page with two fields for entering username and password
and a button. When button is clicked there is either an error in case of invalid password
or it takes to the list of all tweets that the user has made.

(iv) Provide a field on tweets page to create a new tweet.
This will need a field and a button to create which will link
to the already written api for creating a tweet

(v) Provide a button to create a new user on the login page which when clicked
takes to another page where user can enter name and password

(vi) Provide functionality to add followers

(vii) Make sure you are using Database here with hibernate

(viii) Use interceptors to validate requests

(ix)


 */
public class Main {
}
