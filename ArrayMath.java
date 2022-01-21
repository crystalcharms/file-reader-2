/**
 * Course: TCSS142 - Introduction to Object-Oriented Programming
 * File Name: ArrayMath.java
 * Assignment: 3
 * Due Date: 2021/11/30
 * Instructor: Mr. Schuessler
 */

/**
 * The ArrayMath class contains static methods that are used
 * to perform operations on the given 2D arrays from the Project3
 * program.
 * @author Charmaine Dacones
 * @version 2021 25 November
 */
public class ArrayMath {
    /**
     * The addAAndB method performs addition on arrayA and arrayB
     * from the Project3 program.
     * @param theArrA
     * @param theArrB
     * @return The return variable arraySum returns a new 2D array
     * as the sums of arrayA and arrayB from the Project3 program.
     */
    public static int[][] addAAndB (int[][] theArrA, int[][] theArrB) {
        int[][] arraySum = new int[theArrA.length][theArrA.length];
        for (int row = 0; row < theArrA.length; row++) {
            for (int col = 0; col < theArrA[row].length; col++) {
                arraySum[row][col] = theArrA[row][col] + theArrB[row][col];
            }
        }
        return arraySum;       
    }


    /**
     * The subtractBFromA methods performs subtraction on arrayA and
     * arrayB from the Project3 program.
     * @param theArrA
     * @param theArrB
     * @return The return variable arraySub returns a new 2D array
     * as the new totals of the subtraction operation between arrayA
     * and arrayB.
     */
    public static int[][] subtractBFromA(int[][] theArrA, int[][] theArrB) {
        int[][] arraySub = new int[theArrA.length][theArrB.length];
        for (int row = 0; row < theArrA.length; row++) {
            for (int col = 0; col < theArrA[row].length; col++) {
                arraySub[row][col] = theArrA[row][col] - theArrB[row][col];
            }
        }
        return arraySub;
    }

    
    /**
     * The multiplyCAndD method performs multiplication on arrayA and
     * arrayB from the Project3 program.
     * @param theArrC
     * @param theArrD
     * @return The return variable arrayMul returns a new 2D array
     * as the products of arrayC and arrayD from the Project3 program.
     */
    public static int[][] multiplyCAndD(int[][] theArrC, int[][] theArrD) {
        // The dimensions of the new array is equal to the number of
        // rows of arrayC and equal to the number of columns of
        // arrayD.
        int[][] arrayMul = new int[theArrC.length][theArrD[0].length];
        for (int row = 0; row < theArrC.length; row++) {    
            for (int col = 0; col < theArrD[0].length; col++) {
                for (int index = 0; index < theArrC[0].length; index++) {
                    arrayMul[row][col] += theArrC[row][index] * theArrD[index][col];
                }        
            }
        }
        return arrayMul;
    }
}

    
    

