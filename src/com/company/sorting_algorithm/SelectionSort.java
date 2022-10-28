package com.company.sorting_algorithm;

import java.util.Scanner;

public class SelectionSort {
    public static int[] selectionSort(int [] arr) {
        int minEl, index, temp;
        for(int i = 0; i < arr.length; i++) {
            minEl = arr[i];
            index = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < minEl) {
                    minEl = arr[j];
                    index = j;
                }
            }
            if(arr[i] > minEl) {
                temp = arr[i];
                arr[i] = minEl;
                arr[index] = temp;
            }
        }
        return arr;
    }
    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter of array size: ");
        n = scanner.nextInt();
        int [] array = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.println(i+1 + " enter element of array");
            array[i] = scanner.nextInt();
        }
        int[] sortedArray = selectionSort(array);
        printArray(sortedArray);
    }
}
