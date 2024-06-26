# Instructions created by Wei Jun Shi for INFO 4190
     The purpose of the exercise is to come up with a small Java programing associated with using the GitHub platform for implementing   array sorting function
     
### Setup GitHub Account
     Set up Git on your machine, create a GitHub account, and create a new repo for this exercise.
     Creating a GitHub account as williamshi5358@gmail.com or weijunshi to practice the GitHub exercise

### Implement 3 Features with 3 Branches
    Creating three features: 
      - VaildIntegerArray
      - IntegerArraySort
      - StringArraySort
    Accordance with three branches:
     - master
     - iteration0_IntegerArraySort
     - iteration1_StringArraySort
     
### 1. Initializing Java project at GitHub
      Git init .
      Or Git clone https://github.com/WeijunShi/INFO4190_ArraySort_JavaProject.git

      Git remote add origin https://github.com/WeijunShi/INFO4190_ArraySort_JavaProject.git
      Git add .gitignore
      Echo  Instruction of GitHub practice   >> README.md
      Git add README.md
      Git commit  first commit to add README and gitignore 
      Git push -u origin master
         
### 2. Implementing the first feature at master branch
      Git pull origin master
      Git add  src\GitHubArraySortExercise.java
      Git add src\ValidIntegerArray.java
      Git commit -m  added two files of GitHubArrayExercise.java and ValidIntegerArray.java 
      Git push origin master
      Git status
      Git add README.md
      Git commit -m  modified README for the first feature of integer array validation  
      Git push origin master
      
      
### 3. Set up a new branch named named iteration0_IntegerArraySort to implement a new feature of IntegerArraySort  
      Building one new branch named iteration0_IntegerArraySort 
          Git branch iteration0_IntegerArraySort
          Git checkout iteration0_IntegerArraySort
          
      Creating integreArraySort function    
          Git add src\IntegerArraySort.java
          Git commit -m  created a new branch of iteration0, and added IntegerArraySort.java  
          Git push origin iteration0_IntegerArraySort
          Git branch  (show list of branch)
          
      Implementing JUnit test for current feature
          Git add Test_IntegerArraySorting.java
          Git commit -m  added JUnit test file as Test_IntegerArraySorting.java  
          Git push origin iteration0_IntegerArraySort
          Git checkout master
          Git add README.md
          Git commit -m  modified README for the second feature of Integer array sorting  
          Git push origin master
          
### 4. Creating another new branch named iteration1_StringArraySort for a new feature of string array sort.
       Building new branch of iteration1_StringArraySort
          Git branch iteration1_StringArraySort
          Git checkout iteration1_StringArraySort
          
       Creating sttinhArraySort function 
          Git add src\StringArraySort.java
          Git commit -m  created a new branch of iteration1, and added StringArraySort.java  
          Git push origin iteration1_IntegerArraySort
          Git add Test_StringArraySorting.java
          Git commit -m  added JUnit test file as Test_StringArraySorting.java  
          Git push origin iteration1_StringArraySort
          Git branch  (show list of branch)
          
       Update instructions on README file   
          Git checkout master
          Git add README.md
          Git commit -m  modified README for the third feature of String array sorting  
          Git push origin master
          
### 5. Merge branches to master 
       a. Create a pull request in GitHub from the feature branch to the master branch, and merge it.
          Git checkout iteration0_IntegerArraySort
          Git pull origin iteration0_IntegerArraySort
          Git checkout master
          Git merge iteration0_IntegerArraySort

          Git checkout iteration1_StringArraySort
          Git pull origin iteration1_StringArraySort
          Git checkout master
          Git merge iteration1_StringArraySort
          Git commit -m �merge branches to master� 
          Git push origin master

          
       b. Pull the updated master branch on your local machine and make sure it updates with the code from GitHub. 
         If another member joins to develop the project, the project can be cloned to local. 
           Git clone https://github.com/WeijunShi/INFO4190_ArraySort_JavaProject.git
           cd WeijunShi-INFO4190_ArraySort_JavaProject
           Git pull origin master
           Git add README.md
           Git commit -m "modified README by another member"