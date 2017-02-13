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
public class SelectionSort implements ISortStrategy {

      private int[] input;

    @Override
    public int[] sort(int[] input) {
        this.input = input;
        return selectionSort();
    }

    public int[] selectionSort() {

        int i, j, pos, temp;
        for (i = 0; i < input.length - 1; i++) {
            pos = i;
            for (j = i + 1; j < input.length; j++) {
                if (input[j] < input[pos]) {
                    pos = j;
                }
            }
            temp = input[i];
            input[i] = input[pos];
            input[pos] = temp;
        }

        return input;
    }
}
