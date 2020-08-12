# Roman Numerals Converter

## Challenge

[Challenge Description](http://codingdojo.org/kata/RomanNumerals/)

## About it

#### Structure
In this project, I choose to do both conversions inside the same Converter class.
There's one public method for each conversion. The Menu class operate a Converter instance
and is responsible to show interact messages to be used in command line.     

#### Some tech explanations
Today this converter uses both a HashMap and a few Lists to do its conversions.
Initially I tried to use the same HashMap to all operations but this approach turned the code
a little hard to read then I choose to have both HashMap and Lists in favor of a code
easier to understand. If I could do something to improve this code, I would change this 
approach and find a way to use the same variable without decreasing the code readability.

## Getting Started

To run this application you will need [Java 8](https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html).

- Clone this repo:
```
git clone https://github.com/DaniiNyan/roman-numerals-converter.git
```

- Navigate to its folder and build the project:  
```
./gradlew build  
```

- Run the application: 
```
java -jar build/libs/converter-1.0-SNAPSHOT.jar
```

**Done!**  
You can now convert numbers interacting with the menu.  
