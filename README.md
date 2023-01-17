# install_java 
In this tutorial, we will install java and try our first program :
1) Verify that you have not already installed Java
2) Install Ubuntu’s default JDK
3) Test Java on the command line
4) Set JAVA_HOME globally for all Ubuntu users
5) Write your first program 
6) Compile the program 
7) Run the program
# Verify that you have not already installed Java
      $java -version
# Install Ubuntu’s default JDK
      $sudo apt-get update
      $sudo apt install default-jdk

# Test Java on the command line
      $java -version
# Set JAVA_HOME globally for all Ubuntu users
      $update-alternatives --config java
      $sudo nano /etc/environment
      $JAVA_HOME="/lib/jvm/java-11-openjdk-amd64/bin/java"
      ctrl+o
      enter
      ctrl+x
      $source /etc/environment
      $echo $JAVA_HOME
# Write your first program 
      $ gedit Hello_World.java
      ![image](https://user-images.githubusercontent.com/88199830/212864722-baa40039-4b86-4b6a-87a8-3485a6b561af.png)

# Compile the program 
      $javac Hello_World.java
# Run the program 
     $java Hello_World 
     
