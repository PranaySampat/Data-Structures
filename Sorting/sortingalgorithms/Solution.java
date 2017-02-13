/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

import java.util.Random;
import sorting.ISortStrategy;
import sorting.InsertionSort;
import sorting.QuickSort;
import sorting.SelectionSort;

/**
 *
 * @author Muddassar
 */
public class Solution {
    
   static int[] inputArray;
    

    public void solve() {
        IScanner scanner;

        scanner = ScannerFactory.getScanner(EnumInputType.File);

        while (scanner.hasNext()) {
            //Read inputs && Write logic to convert input to required format
            //Input format : input array of integers|output array of integers
            String st = scanner.next();
            String[] dataLine = st.split("\\|");
            String[] input = dataLine[0].split(",");
            String[] output = dataLine[1].split(",");

            int[] inputData = convertStringArraytoIntArray(input);
            int[] outputData = convertStringArraytoIntArray(output);
            inputArray = new int[inputData.length];
            
            //Call sorting algorithms
            ISortStrategy[] arr = new ISortStrategy[3];
            arr[0] = new QuickSort();
            arr[1] = new InsertionSort();
            arr[2] = new SelectionSort();
            for (ISortStrategy t : arr) {
                for (int i = 0; i < inputData.length; i++) {
                inputArray[i] = inputData[i];
            }
                if (t instanceof QuickSort) {
                    System.out.println("");
                    System.out.println("Performing Quick Sort");
                } else if (t instanceof InsertionSort) {
                    System.out.println("Performing Insertion Sort");
                } else if (t instanceof SelectionSort) {
                    System.out.println("Performing Selection Sort");
                }
                long startTime = System.currentTimeMillis();
                int[] result = t.sort(inputArray);
                System.out.println("Sorting Time  taken:" + (System.currentTimeMillis() - startTime));

                //Test output
                if (inputData != null) {
                    for (int i = 0; i < input.length; i++) {
                        if (result == null || outputData[i] != result[i]) {
                            System.out.println("Sorting failed");
                            break;
                        }
                    }
                }
                System.out.println("Output:");
                for (int i : result) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    private int[] convertStringArraytoIntArray(String[] stringData) {
        int[] integerData = new int[stringData.length];
        for (int i = 0; i < stringData.length; i++) {
            integerData[i] = Integer.parseInt(stringData[i]);
        }
        return integerData;
    }

    public void solveFromConsole(IScanner scanner) {
        int count = 0;
        int[] numbers;
        System.out.println("Please enter the lenth of input");
        if (scanner.hasNext()) {
            count = Integer.valueOf(scanner.next());

        }
        if (count != 0) {
            if (count < 5) {
                scanner.next(); // throw away the newline.

                numbers = new int[count];
                inputArray = new int[count];
                for (int i = 0; i < count; i++) {
                    System.out.println("please enter the elemnt at position " + i);
                    if (scanner.hasNext()) {
                        numbers[i] = Integer.valueOf(scanner.next());
                        //inputArray[i] = numbers[i];
                    } else {
                        System.out.println("You didn't provide enough numbers");
                        break;

                    }
                }

            } else {
                System.out.println("Since size of input is grater than 5 . System will randomize the values between 0-10000");
                numbers = new int[count];
                inputArray = new int[count];
               for (int i = 0; i < count; i++) {
                    Random r = new Random();
                    numbers[i] = r.nextInt(10001) + 1;
                    
                }
            }

            ISortStrategy[] arr = new ISortStrategy[3];
            arr[0] = new QuickSort();
            arr[1] = new InsertionSort();
            arr[2] = new SelectionSort();
            for (ISortStrategy t : arr) {
                for (int i = 0; i < numbers.length; i++) {
                inputArray[i] = numbers[i];
            }
                if (t instanceof QuickSort) {
                    System.out.println("");
                    System.out.println("Performing Quick Sort");
                } else if (t instanceof InsertionSort) {
                    System.out.println("Performing Insertion Sort");
                } else if (t instanceof SelectionSort) {
                    System.out.println("Performing Selection Sort");
                }
                long startTime = System.currentTimeMillis();
                int[] result = t.sort(inputArray);
                System.out.println("Sorting Time  taken:" + (System.currentTimeMillis() - startTime));
                System.out.println("Output:");
                for (int i : result) {
                    System.out.print(i + " ");
                }
            }
        }

    } 
}
