package com.java.Array;

public class ArrayDemo {

	public static void main(String[] args) {

		//single-dimensional array
		int a[]= {25,30,40,50,55,65};
		for(int i=0;i<5;i++) {
		System.out.println("Elements of array a: "+a[i]);
		}


		//multidimensional array
		int[][] b = {
		            {4,6,8,10}, 
		            {2,4,6} };
		      
		      System.out.println("\nLength of row 1: " + b[0].length);
		      }

}
