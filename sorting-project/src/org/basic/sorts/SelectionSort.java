package org.basic.sorts;

/**
 * Selection Sort is a simple sorting technique just like Bubble Sort but it requires comparatively less swapping.
 * The sorting takes quadratic time and it is an in-place sorting algorithm. It is unstable sorting technique although as 
 * the relative position of equal elements may get changed. 
 *  
 * Time Complexity - O(n^2)
 * 
 * @author abheek
 *
 */
public class SelectionSort {

	public static void main(String[] args) {
		
		// unsorted array
		int array[] = {20, 35, -15, 7, 55, 1, -22};		
		
		for(int unsortedPartitionIndex = array.length -1; unsortedPartitionIndex> 0; unsortedPartitionIndex--) {
			int largeElementIndex = 0;
			
			for(int j = 1; j <= unsortedPartitionIndex; j++) {
				
				if(array[largeElementIndex] < array[j]) {
					largeElementIndex =j;
				}
			}
			
			// swapping large element in array with the last element of unsorted partition
			int temp = array[largeElementIndex];
			array[largeElementIndex] = array[unsortedPartitionIndex];
			array[unsortedPartitionIndex] = temp;
		}
		
		// displaying the array element
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		

	}

}
