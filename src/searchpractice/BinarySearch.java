package searchpractice;

import static java.util.Arrays.sort;
import utils.In;
import utils.Stopwatch;

/**
 * The class BinarySearch provides a framework for implementing a binary 
 search algorithm.
 * 
 * Searching in collections is done to answer the following questions: 
 * - Does the element exists in a collection? -> method contains()
 * - How to get the element from a collection? - > method indexOf()
 *
 * @author Computer Power Plus
 */
public class BinarySearch {
    //
    // YOUR TASK: refactor the class name to BinarySearch, using the IDE
    //
    
    private static int stepCounter=0;
    
     /**
    * Checks if collection contains an item.
    * @param term the search term, in this case an int
    * @param collection the collection to be searched, in this case an array of int
    * @return the boolean
    * 
    */    
    public static boolean contains(int term, int[] collection){     
        // This simply uses the algorithm you will implement in indexOf()
        return (indexOf(term, collection) != -1);
     }
     
     
 /**
 * Finds the index of an item in a collection if it contains an item.
 * 
 * @param term the search term, in this case an int
 * @param collection the collection to be searched, in this case an array of int
 * @return the int
 * 
 */    
    public static int indexOf(int term, int[] collection){
        
        int min = 0;
        int max = collection.length-1;
        int guess = (min + max) / 2;

        
        while( min <= max ){
            
            stepCounter++;
            
            if (collection[guess] < term ){
                min = guess + 1;
            } else if (collection[guess] == term){
                return guess;
            } else {
                max = guess - 1;
            }
            guess = (min + max) / 2;
        }
        
        if ( min > max ){
            return -1;
        }

        return -1;
        
        
    }
     /**
     * Reads in 
     * - a search term (integer)
     * - a sequence of integers from a file (.txt file)
     * both specified as a command-line argument;
     * searches for the term in the collection of integers
     * prints the result of the search and the time in seconds
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args)  { 
        
        //Read the search term
        int term = Integer.parseInt("790810");
        
        // Read the input data stream (the collection)
        In in;
        int[] collection;
        try{ 
            in = new In("C:\\Users\\92020362\\Documents\\NetBeansProjects\\practice-activity-searching-PeterStanger92020362\\data\\1Mints.txt");
            collection = in.readAllInts();
            sort(collection);
            
            // State intention
            System.out.print("Searching for " + term);

            // Start timer
            Stopwatch timer = new Stopwatch();
            
            // Search for item
            int itemIndex = indexOf(term, collection);

            // Stop timer
            System.out.println("\nElapsed time = " + timer.elapsedTime() + " seconds\n");

            // Print result
            if(itemIndex!=-1){
                System.out.println("The term was found at index: " + itemIndex);
            } else {
                System.out.println("The term could not be found...");
            }
            System.out.println("It took " + stepCounter + " steps to confirm.");

            
        } catch (java.lang.IllegalArgumentException e) {
            // Error with input data file
            System.out.println(e+ ": Incorrect data file as argument: " + args[1]);
        }
     
    } 
    
}
