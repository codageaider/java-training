package day19;
/*
In a directory there will be many files.
There are states of a file :
(i) untracked
(ii) Staged
(iii) committed  (previous version of the file is commited)
(iv) modified


Git Reference Manual
https://manpages.ubuntu.com/manpages/xenial/man1/git.1.html
https://git-scm.com/doc


Ex:
(i) create a new folder
(ii) run git init command
(iii) create a file a1.txt and a2.txt
(iv) move a1 to staging area commit this file
(v) check git log and see the commit details
(vi) do rm * inside the folder to delete all the files
(vii) git checkout master
See which files get restored. Do a1.txt and a2.txt both appeaer or only one of them?
(viii) create a new file a3.txt and add some text to it
(ix) git add a3.txt , git commit -m "some message"
(x) make some changes to a3.txt file and check git status
(xi) do rm * , git checkout master, check the contents of a1.txt and a3.txt
     post your observations

1) git <-- some git commands add, diff, commit
 Version control System
2) github.com -> GUI for git repositories or cloud hosting of code etc.
     (i) Access files remotely
     (ii) Access files on different devices
 github.com is one of the online repository services based on git
 gitlab, bitbucket

 3) git and github are two different things
 -) git diff
 shows the difference between the modified and last committed file
 -) git diff --staged
 shows the differences between the files in staging area
 4) git push
 Push the local changes to remote github.com cloud repository
 -) git pull
 pull the changes from the remote github.com to local
 5) Create a new branch : checkout -b branchname
 6) git branch
 Displays the list of all branches on your local git repository

 -) Merge -> Merge two branches -> Combine the contents of the files
 in two branches.
 Merge add-followers files to the master branch
 Command:
 git merge branchname
 merges the contents of branchname into current branch


 Ex:
 1) create a new branch from master
 2) on the new branch make some changes to an existing files.
    and add some words in between lines of an existing files
 3) merge this new branch into master

 Ex:
 1) create a new repository on github.com and add files from the GUI
 2) use the commadn git clone httpurlofrepo
 to clone the remote repository to your local machine


 test.txt [master]  -> test.txt [add-followers] -> modify line 1 of test.txt [add-followers]
           |
          \/
 modify line 1 of test.txt [master]

 test.txt file is modified at line 1 in master as well as add-followers

 Suppose I want to merge add-followers into test.txt
 what should line 1 contain after we merge the changes from add-followers branch to test.txt ?
 Should it contain the content of master only or should it contain the content of add-followers branch?
 Or should it contain some mixture of both?
 line-1 : This is a sample sentence -> This was a sample sentence [author-1] <-- this change
  |
 \/
 line-1 : This is the sample sentence [author-2] <--
 merge these two -> print ??

 This was a sample sentence ?
 This is the sample sentence?
 This was the sample sentence?

Merge conflict occurs when two people modify a file at the same line in two different branches.
The only way to resolve it is to resolve it manually.

<<<<<<<<< HEAD

=======

>>>>>>>>

This line ==== is the center of conflict. The linest between <<<<< HEAD and ==== is the content that
exists in the curren branch master. And the part below the ===== and >>>>> is the content in the other branch
that we want to merge into our current branch

Ex: Create a merge conflict and resolve it.

 */
public class Main {
}
