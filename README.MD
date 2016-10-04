#Setup

##Logon github create repository helloworld

##Create local repo
```
cd C:/Users/foo/Documents/GitHub/
mkdir helloworld
cd helloworld
#config user(optional)
$ git config --local  user.name "sunmeng90"
$ git config --local user.email sunmeng90@126.com

#clone repo from github
git clone https://github.com/sunmeng90/helloworld.git

#create repo on command line
#init
$ git init
#coding
$ echo "# helloworld" >> README.md
#add file to index/stage
$ git add README.md
#commit change to local repo
#Stores the current contents of the index in a new commit along with a log message from the user describing the changes.
$ git commit -m "first commit"

```

##push local repository to remote repo
```
#
$ git remote add origin https://github.com/sunmeng90/helloworld.git
#push branch to remote repo
$ git push -u origin master
```
