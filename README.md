# Assignments.


WEEK 1

add.java------Build a simple calculator that takes 2 numbers as input and calculated the sum of 2 numbers.

reverseString.java----I have a string "I am learning Java". Reverse the string without using any system provided functions.

WEEK 2

ExersisS.java ----There is an online Exercise system
 - It has 3 types of exercises
 - Walking, Cycling, Running
System should be flexible to enhance to accommodate any type of exercise in the future.
Given an exercise for a user, System should print the calories burned for that exercise.
For e.g.
Input :
User - Philip
Exercise Type - Walking
Duration - 30 min
Date : (If not provided, default to current date else date in mm-dd-yyyy format)
Output :
n calories

Use any formula to calculate the calories.

System also should support aggregated mode as well as detailed mode.

For e.g. If there are multiple exercises for the same user on same day, system should
print the sum of calories burned in aggregated mode. In detail mode, it should print all
the exercise details



WEEK 3

Assignment 1:---- Create a simple table to store id, name, email, contact for a given
user. We should not allow adding multiple users with same email to the table. Ability to write data to the table using insert queries


Assignment 2:---–Create a database scheme that captures all the below requirements.
        We have multiple students learning at an academy.
        Each student should be uniquely identifiable
        The academy offers multiple courses.
        A student can take any number of courses
        A student obtains a score for each subject when finishes the course.
        This is captured along with the date and time he completed the course.
        A student can repeat the same course multiple number of times and thus earns multiple scores for the same course as well.

        We should be able to write queries to fetch the following details
              Average of all the scores obtained by all the students for any single given course
              Scorecard for any given student that shows all his scores for all of the courses
              Scorecard for any given student that shows only his best score per course.
              Scorecard for any given student that shows only his latest score per course.
              The best score obtained (by any students) per course along with the name of the student. Kind of the like topper of each course.
        
        
WEEK 4

Day 1 – Hello world spring boot app

Day 5
– Create a spring boot application. The application should have following
3 REST Endpoints (GET, POST, DELETE)
          
          GET Endpoint should take 2 query parameters (one required and one
       non required, validate them and return a dummy response)

     POST Endpoint should take an object of User class as request body,
     validate it and return a dummy response

     DELETE Endpoint should take in a single required query parameter and
     return a dummy response.

    All the 3 endpoints should have some specific hardcoded cases where
    they return different HTTP Errors.


WEEK 5

Day 5

     Create a spring boot application. The application should have following
          -Connect to the DB that was created during MySQL assignment from
          spring application
          -Create entities that map to DB Tables
          -Create 5 API Endpoints
              -A POST API – Takes in the details required for Student table as request
              body, validates it and the student is then saved in DB
              -A PUT API – Takes the details required for Student table as request
              body, validate it and update the existing student in DB.
              -A GET API – Takes the id as path parameter and return the Student
              details based on id
              -A GET API – Takes a string as request parameter and returns the list of
              students whose name matches the request parameter
              -A DELETE API – Takes the id as parameter and deletes the record from
              database
