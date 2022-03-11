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
 4) git push
 Push the local changes to remote github.com cloud repository
 -) git pull
 pull the changes from the remote github.com to local
 5) Create a new branch : checkout -b branchname
 6) git branch
 Displays the list of all branches on your local git repository
 */
public class Main {
}
