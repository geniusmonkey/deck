# Code Test

# Requirements
- git - [Instructions](https://help.github.com/articles/set-up-git/)
- java jdk8 - [Instructions](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

## Running
The test has been bootstrapped to run JUnit for testing, the code for these test can be found `src/test/java/com/geniusmonkey/cards/DeckTest.java` or [here](https://github.com/geniusmonkey/deck/blob/master/src/test/java/com/geniusmonkey/cards/DeckTest.java). To run the code you simply need to call the gradle wrapper for your system. From the root of the project run one of the following commands from a command line.

- Mac/Linux: `./gradlew test`
- Windows: `./gradlew.bat test`


## Tasks
1. Implement the cut method `com.geniusmonkey.cards.Deck#cut` that has been stubbed out. Write a test that shows it works.
1. Create a 5 suit card deck with all the standard values from A to K, and the fifth suit will be a star and the color blue. Create a new test that deals 4 cards to 5 people like the sample standard deck, then sorts the cards and deals the remaining
1. Create a Pinochle deck of cards.
    1. The deck consists of cards Ranking highest to lowest `A, 10, K, Q, J, 9` with two of every suit for a total of 48 cards. For example ther will be two of the following `A of Spades`,  `A of Diamonds`, `A of Clubs`, `A of Hearts`
    1. Sort order should be by card value lowest to highest then by suit Diamonds, Clubs, Spades and Hearts
    1. Write a test that deals 12 cards to two players, then sort the deck and deal the remainging cards to show them sorted
