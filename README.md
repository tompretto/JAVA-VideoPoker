# JAVA-VideoPoker
Video Poker for JAVA

Steps to create a jar file: 

1. create a file mainClass with one line:  

    Main-class: play-poker 


2. create jar file:
   jar cmf mainClass play-poker.jar Card.class Deck.class play-poker.class  VideoPoker.class

3. Now, you can run program by typing:
java -jar play-poker.jar    OR 

java -jar play-poker.jar 500      // 500 is a starting balance 
