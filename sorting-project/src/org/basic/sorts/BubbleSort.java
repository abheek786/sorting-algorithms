package org.basic.sorts;

/**
 * Bubble Sort is a very basic sorting algorithm. The performance degrade quickly as number of element grows.
 * The sorting happens from left to right. The larger elements are pushed at the end of array during every iteration. 
 * At the final iteration, the array has sorted elements. It is in-place algorithm because the swapping of element happens in the same array. 
 * The array is partitioned logically. It is a stable algorithm because the relative position of same element will not get changed during 
 * iteration because we are swapping only when the adjacent element is greater.
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

		
		for(int unsortedPartitionIndex = array.length-1; unsortedPartitionIndex > 0; unsortedPartitionIndex--) {
			
			for(int j = 0; j < unsortedPartitionIndex; j++) {
				
				if(array[j] > array[j+1]) {
					int temp;
					
					// swapping elements
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		// logic for displaying array elements
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

}
