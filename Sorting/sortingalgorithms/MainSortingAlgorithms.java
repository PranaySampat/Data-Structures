/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Queue;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import sorting.ISortStrategy;
import sorting.InsertionSort;
import sorting.QuickSort;

/**
 *
 * @author Muddassar
 */
public class MainSortingAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        IScanner scanner = ScannerFactory.getScanner(EnumInputType.Console);
        Solution sol = new Solution();
        System.out.println("Please enter choice of input/n"
                + "1. Console"
                + "2.File(Your data has to be present in data.txt file in user directory");
        while (scanner.hasNext()) {
            int choice = Integer.parseInt(scanner.next());
            if (choice == 2) {
                sol.solve();
            } else {
               sol.solveFromConsole(scanner);
            }
        }
    }
}

