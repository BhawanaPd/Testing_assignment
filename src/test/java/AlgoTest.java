package test.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;


public class AlgoTest {
	@Test
	/* Method to test bubbleSort and analyzing node, edge and condition coverage. */
	public void testAllCoverageBubbleSort() throws Exception {
		
		Item[] arr = new Item[5];
		Item[] arr2 = new Item[5];
		arr[0] = new Item(5);
		arr[1] = new Item(4);
		arr[2] = new Item(3);
		arr[3] = new Item(2);
		arr[4] = new Item(1);
		arr2[0] = new Item(1);
		arr2[1] = new Item(2);
		arr2[2] = new Item(3);
		arr2[3] = new Item(4);
		arr2[4] = new Item(5);
		SortAlgos.bubbleSort(arr);
		assertEquals(arr2[0].key,arr[0].key);
		assertEquals(arr2[1].key,arr[1].key);
		assertEquals(arr2[2].key,arr[2].key);
		assertEquals(arr2[3].key,arr[3].key);
		assertEquals(arr2[4].key,arr[4].key);
	}

	
	@Test
	/* Method to test bubbleSort and analyze node and edge coverage  */
	public void testCoverageBubbleSort() throws Exception {
		
		Item[] arr = new Item[5];
		Item[] arr2 = new Item[5];
		arr[0] = new Item(1);
		arr[1] = new Item(2);
		arr[2] = new Item(3);
		arr[3] = new Item(4);
		arr[4] = new Item(5);
		arr2[0] = new Item(1);
		arr2[1] = new Item(2);
		arr2[2] = new Item(3);
		arr2[3] = new Item(4);
		arr2[4] = new Item(5);
		SortAlgos.bubbleSort(arr);
		assertEquals(arr2[0].key,arr[0].key);
		assertEquals(arr2[1].key,arr[1].key);	
		assertEquals(arr2[2].key,arr[2].key);
		assertEquals(arr2[3].key,arr[3].key);
		assertEquals(arr2[4].key,arr[4].key);
	}
	
	@Test
	/* Method to test Selection sort */
	public void testSelectionSort() throws Exception {
		
		Item[] arr = new Item[5];
		Item[] arr2 = new Item[5];
		arr[0] = new Item(50);
		arr[1] = new Item(40);
		arr[2] = new Item(30);
		arr[3] = new Item(20);
		arr[4] = new Item(10);
		arr2[0] = new Item(10);
		arr2[1] = new Item(20);
		arr2[2] = new Item(30);
		arr2[3] = new Item(40);
		arr2[4] = new Item(50);
		SortAlgos.selectionSort(arr);
		assertEquals(arr2[0].key,arr[0].key);
		assertEquals(arr2[1].key,arr[1].key);
		assertEquals(arr2[2].key,arr[2].key);
		assertEquals(arr2[3].key,arr[3].key);
		assertEquals(arr2[4].key,arr[4].key);
	}
	
	@Test
	/* Method to test Insertion sort */
	public void testInsertionSort() throws Exception {
		
		Item[] arr = new Item[5];
		Item[] arr2 = new Item[5];
		arr[0] = new Item(50);
		arr[1] = new Item(40);
		arr[2] = new Item(30);
		arr[3] = new Item(20);
		arr[4] = new Item(10);
		arr2[0] = new Item(10);
		arr2[1] = new Item(20);
		arr2[2] = new Item(30);
		arr2[3] = new Item(40);
		arr2[4] = new Item(50);
		SortAlgos.insertionSort(arr);
		assertEquals(arr2[0].key,arr[0].key);
		assertEquals(arr2[1].key,arr[1].key);
		assertEquals(arr2[2].key,arr[2].key);
		assertEquals(arr2[3].key,arr[3].key);
		assertEquals(arr2[4].key,arr[4].key);
	}
	
	@Test
	/* Method to test Quick sort */
	public void testQuickSort() throws Exception {
		
		Item[] arr = new Item[5];
		Item[] arr2 = new Item[5];
		arr[0] = new Item(50);
		arr[1] = new Item(40);
		arr[2] = new Item(30);
		arr[3] = new Item(20);
		arr[4] = new Item(10);
		arr2[0] = new Item(10);
		arr2[1] = new Item(20);
		arr2[2] = new Item(30);
		arr2[3] = new Item(40);
		arr2[4] = new Item(50);
		SortAlgos.quickSort(arr);
		assertEquals(arr2[0].key,arr[0].key);
		assertEquals(arr2[1].key,arr[1].key);
		assertEquals(arr2[2].key,arr[2].key);
		assertEquals(arr2[3].key,arr[3].key);
		assertEquals(arr2[4].key,arr[4].key);
	}
	
	@Test
	/* Method to test Heap sort */
	public void testHeapSort() throws Exception {
		
		Item[] arr = new Item[6];
		Item[] arr2 = new Item[6];
		arr[0] = new Item(5);
		arr[1] = new Item(1);
		arr[2] = new Item(5);
		arr[3] = new Item(4);
		arr[4] = new Item(2);
		arr[5] = new Item(3);
		arr2[0] = new Item(1);
		arr2[1] = new Item(2);
		arr2[2] = new Item(3);
		arr2[3] = new Item(4);
		arr2[4] = new Item(5);
		arr2[5] = new Item(5);
		SortAlgos.heapSort(arr);
		assertEquals(arr2[0].key,arr[0].key);
		assertEquals(arr2[1].key,arr[1].key);
		assertEquals(arr2[2].key,arr[2].key);
		assertEquals(arr2[3].key,arr[3].key);
		assertEquals(arr2[4].key,arr[4].key);
		assertEquals(arr2[5].key,arr[5].key);
	}
	
	
	@Test
	/* Method to test Merge sort */
	public void testMergeSort() throws Exception {
		
		Item[] arr = new Item[8];
		Item[] arr2 = new Item[8];
		arr[0] = new Item(0);
		arr[1] = new Item(2);
		arr[2] = new Item(4);
		arr[3] = new Item(6);
		arr[4] = new Item(1);
		arr[5] = new Item(3);
		arr[6] = new Item(5);
		arr[7] = new Item(7);
		arr2[0] = new Item(0);
		arr2[1] = new Item(1);
		arr2[2] = new Item(2);
		arr2[3] = new Item(3);
		arr2[4] = new Item(4);
		arr2[5] = new Item(5);
		arr2[6] = new Item(6);
		arr2[7] = new Item(7);
		SortAlgos.mergeSort(arr);
		assertEquals(arr2[0].key,arr[0].key);
		assertEquals(arr2[1].key,arr[1].key);
		assertEquals(arr2[2].key,arr[2].key);
		assertEquals(arr2[3].key,arr[3].key);
		assertEquals(arr2[4].key,arr[4].key);
		assertEquals(arr2[5].key,arr[5].key);
		assertEquals(arr2[6].key,arr[6].key);
		assertEquals(arr2[7].key,arr[7].key);
	}
	
}
