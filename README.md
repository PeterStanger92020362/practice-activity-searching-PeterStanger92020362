### PeterStanger ###

# IT6033 Practice Activity: Searching
This practice repository contains starter files for a searching algorithms learning activity  
### THIS IS NOT AN ASSESSMENT!

## Framework

You are provided with a framework for programming your algorithms.  
Classes provided, in the classroom repository _Search Practice Activity_:
* in folder `src/searchpractice`  
  - a starter class `SequentialSearch.java`, with methods 
    * `indexOf(int term, int[] collection)` - searches for a term in a collection and returns its index position
    * `contains(int term, int[] collection)` - searches for a term in a collection and returns a boolean found/not found
    * `main (args)` - allows to run the search using files containing the data sets to be searched

  - a starter class `BinarySearch,java`, with the same methods 
    * `indexOf(int term, int[] collection)`
    * `contains(int term, int[] collection)`
    * `main (args)`

* in folder `data/searchpractice`
  - test data files of different sizes, from small to very large, files called `8ints.txt` to `1Mints.txt`
    * sequences of integers

Additionally corresponding JUnit test classes with test data and expected outputs:
* in folder `test/searchpractice` 
  - `SequentialSearchTest.java`
  - `BinarySearchTest.java`
  - `SearchPracticeTestSuite.java` - that allows to run both test classes in one go
  - instructions on how to run test cases in NetBeans found below

  
## Student Practice Tasks
You will program:  
1. a sequential search on an arrays of integers, read from an input file.
2. a binary search on an arrays of integers, read from an input file.

You will measure and compare running time and number of steps 
for algorithms a and b, on input data files of various sizes.


### Part 1: Implement a sequential search on an array of ints

* Implement the searching in `SequentialSearch.indexOf()`

* Test your implementation using JUnit test `SequentialSearchTest.java`
  - select `SequentialSearchTest.java`
  - right click
  - select __Run File__
  - look at results in test results panel
  - (you may add other tests of your choice in that class)
    
* Implement the file input reading and measurements in SequentialSearch.main()
    - reading from an input file containing a list of ints separated by spaces
    - you can use `utils.In.java` to help
    - input files are provided in folder `data`
    - implement a timer, optionally using `utils.Stopwatch.java`
    - test with small file first
    - NetBeans > Project > Properties > Run > create new configuration __Sequential Search__  with 
      - main class: `SequentialSearch.java`
      - arguments: `40 8ints.txt`
      - directory: `..\data`
     - Manu __Run__ > select __Run Project__ - this will run whichever configuration is selected in the dropdown box visible on the toolbar
    
* Perform time measurements with files of different sizes
    - run with provided files from `8ints.txt` to `1Mints.txt` (or create your own)
    - record measurements in a document
    
* Perform step counting
    - implement step counter in your algorithm (comment it out when doing time measurements as this may affect the time)
    - run with provided files from `8int.txt` to `1Mint.txt` (or create your own)
    - record measurements in a document


### Part 2: Implement a binary search on an array of ints

Similar to above, with classes
- `BinarySearch.java`
- `BinarySearchTest.java`

Run with a new configuration __Binary Search__

Note: input files must be __sorted__ lists for a binary search.

