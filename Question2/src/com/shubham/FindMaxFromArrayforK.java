package com.shubham;

public class FindMaxFromArrayforK {

	public static void main(String[] args) {
		//int arr[]= {3,2,1,5,4};
		int arr[]= {1,2,3,4,5};
		int k=2;
        printArray(arr);
        int value=findMax(arr,k);
        System.out.println( " Max value => "+value);
        
	}
	
	private static void printArray(int[] arr) {
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
	}

	private static int findMax(int[] arr, int k) {
		int min[]= new int[arr.length-k+1];
		for(int i=0; i<arr.length-k+1;i++) {
			int j=i;
			int min1=arr[i];
			while(j<k+i) {
			    if(arr[j]<min1) {
			    	min1=arr[j];
			    }
			    min[i]=min1;
			    j++;
			}
		}
		printArray(min);
		return findMaxFormArr(min);
	}

	private static int findMaxFormArr(int[] min) {
		int max=min[0];
		int i=0;
		while(i<min.length) {
			if(min[i]>max)
				max=min[i];
			i++;
		}
		return max;
	}

}
