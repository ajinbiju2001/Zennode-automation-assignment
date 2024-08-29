1: Check maven is installed in pc
	open command prompt
	Type: mvn -version

2: installing maven 
 go to "https://maven.apache.org/download.cgi?." website and download "Binary zip archive"

3: Extract files into any location
   open that folder and copy the file location

4: setting up environment variable

in search bar enter "edit the system environment variable" open it
then click environment variable (bottom).


in "user variable" click New
Variable name: M2_HOME
Variable value: file location path (in step 3)

again add one more, so in user variable click "New"
Variable name: MAVEN_HOME
Variable value: file location path (in step 3)



5: in system variables 
click edit , click new , then paste the path of bin

(open the maven folder then their is a folder named bin open it and copy its path and paste here ) click ok

then check again "step 1"


For running the project:
save the project in one folder
from that folder open command prompt

then type code : mvn clean test


Important Note: for running test

For the file upload functionality, I have specified a file path in the code based on my local system. When running the code on your machine, please ensure that you update the file path to a valid path on your system. If you do not update the path, the test will return an error.
