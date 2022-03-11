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

 */
public class Main {
}
