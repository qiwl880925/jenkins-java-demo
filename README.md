# jenkins-java-demo
jenkins-java-demo  测试用的
```
git config --global user.name "liyang.yuan"
git config --global user.email "liyang.yuan@enesource.com"
```



```
git clone http://192.168.1.157/liyang/test.git
cd test
touch README.md
git add README.md
git commit -m "add README"
git push -u origin master
```



```
cd existing_folder
git init
git remote add origin http://192.168.1.157/liyang/test.git
git add .
git commit -m "Initial commit"
git push -u origin master
```

```
cd existing_repo
git remote rename origin old-origin
git remote add origin http://192.168.1.157/liyang/test.git
git push -u origin --all
git push -u origin --tags
```
