package org.basic.sorts;

/**
 * Bubble Sort is a very basic sorting algorithm. The performance degrade quickly as number of element grows.
 * The sorting happens from left to right. The larger elements are pushed at the end of array during every iteration. 
 * At the final iteration, the array has sorted elements. It is in-place algorithm because the swapping of element happens in the same array. 
 * The array is partitioned logically. It is unstable algorithm because the position of same element may get changed during iteration.
 *  
 * Time Complexity - O(n^2) 
 * 
 * @author abheek
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		
		// unsorted array
		int array[] = {20, 35, -15, 7, 55, 1, -22};
		
		int unsortedPartitionIndex = array.length-1;
		
		for(int i = unsortedPartitionIndex; i > 0; i--) {
			
			for(int j = 0; j < unsortedPartitionIndex; j++) {
				
				if(array[j] > array[j+1]) {
					int temp;
					
					// swapping elements
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		// logic for displaying array elements
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

}
