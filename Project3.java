/**
 * Course: TCSS142 - Introduction to Object-Oriented Programming
 * File Name: Project3.java
 * Assignment: 3
 * Due Date: 2021/11/30
 * Instructor: Mr. Schuessler
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * This program reads integers from a text file and stores them into
 * four 2D arrays for processing. The results of the math operations
 * applied to the arrays are stored in an output file.
 * 
 * @author Charmaine Dacones
 * @version 2021 25 November
 */
public class Project3 {
    /**
     * The main method declares and initializes a number of
     * variables. Several methods are called from main as
     * well as methods from the ArrayMath class.
     * 
     * @param theArgs
     */
    public static void main (String[] theArgs) {
        Scanner input = null;
        PrintStream output = null;
        String inFileName = "in3.txt";
        String outFileName = "out3.txt";
        boolean fileFound = false;

        // 4 arrays are declared to store the data from the input
        // file which contains 4 sets of data.
        int[][] arrayA;
        int[][] arrayB;
        int[][] arrayC;
        int[][] arrayD;

        // 3 arrays are declared for the operations applied to
        // arrayA, arrayB, arrayC, and arrayD
        int[][] addAb;
        int[][] subtractAb;
        int[][] multiplyCd;
    
        // If the file does not exist, the program throws a
        // FileNotFoundException
        try {
            input = new Scanner(new File(inFileName));
            output = new PrintStream(new File(outFileName));
            fileFound = true;
        }
        catch (FileNotFoundException e) {
            System.out.println("Cannot open file: " + e);
        }

        if (fileFound) {
            arrayA = createArray(input);
            arrayB = createArray(input);
            arrayC = createArray(input);
            arrayD = createArray(input);
            displayArray(arrayA, "Array A:", output);
            displayArray(arrayB, "Array B:", output);
            displayArray(arrayC, "Array C:", output);
            displayArray(arrayD, "Array D:", output);

            // The line below calls the addAAnd method from
            // the ArrayMath class which performs addition
            // on arrayA and arrayB.
            addAb = ArrayMath.addAAndB(arrayA, arrayB);
            displayArray(addAb, "A + B = ", output);

            // The line below calls the subtractBFromA method from
            // the ArrayMath class which performs subtraction on
            // arrayA and arrayB.
            subtractAb = ArrayMath.subtractBFromA(arrayA, arrayB);
            displayArray(subtractAb, "A - B = ", output);

            // The line below calls the multiplyCAndD method from
            // the ArrayMath class which performs multiplication on
            // arrayC and arrayD.
            multiplyCd = ArrayMath.multiplyCAndD(arrayC, arrayD);
            displayArray(multiplyCd, "C X D = ", output);          
        }
        input.close();
        output.close();     
    }  


    /**
     * The createArray method is passed a Scanner input file,
     * reads the sets of integers, and stores them in 2D arrays.
     * @param theInFile
     * @return The value of variable array is returned to the main
     * method.
     */
    public static int[][] createArray(Scanner theInFile) {
        // The line below reads in two integers from the input file
        // to set the dimensions of the 2D arrays. 
        int[][] array = new int [theInFile.nextInt()][theInFile.nextInt()];

        // The remaining set of integers are then stored at each index
        // of each 2D array.
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = theInFile.nextInt();
            }
        }
        return array;
    }


    /**
     * The displayArray method prints the names of the 2D arrays
     * followed by the 2D arrays.
     * @param theArr
     * @param theHeader
     * @param theDisplay
     */
    public static void displayArray(int[][] theArr, String theArrName,
                                  PrintStream theDisplay) {
        theDisplay.println(theArrName);
        if (theArr != null) {
            for (int row = 0; row < theArr.length; row++) {
                for (int col = 0; col < theArr[row].length; col++) {
                    theDisplay.print(String.format("%6d",
                                               theArr[row][col]));
                }
                theDisplay.println();
            }     
        } else {
            theDisplay.println(theArr);
        }
        theDisplay.println();
    }          
}
