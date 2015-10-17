 to work with tests

 - put files junit-4.12.jar and hamcrest-core-1.3.jar
   in your source directory
   (of cause it is not a good desicion, but now it is convenient)

 - to compile type
   ```
   $ javac -classpath .:junit-4.12.jar:hamcrest-core-1.3.jar *.java

   ``` 

 - to run your tests
   ```
   $ java -classpath .:junit-4.12.jar:hamcrest-core-1.3.jar \->
          org.junit.runner.JUnitCore TestClass 

   ```

   

