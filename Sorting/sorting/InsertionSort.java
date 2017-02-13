/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author Muddassar
 */
public class InsertionSort implements ISortStrategy {

       private int[] num;

    @Override
    public int[] sort(int[] input) {
        this.num = input;
        return insSort();
    }

    public int[] insSort() {

        int j;
        int key;
        int i;

        for (j = 1; j < num.length; j++) //
        {
            key = num[j];
            for (i = j - 1; (i >= 0) && (num[i] > key); i--) // Smaller values are moving up
            {
                num[i + 1] = num[i];
            }
            num[i + 1] = key;    // Put the key in its proper location
        }
        return num;
    }
}
