package com.edu.matrixrecognition;

public class Util {
	
	private String data;
	private int[][] matrix;
	
	public Util() {
		this.matrix = new int[3][3];
		this.matrix = new int[3][5];
	}
	
	//public float[] parseMatrixStringToFloatMatrix
	
	private boolean isPrime(int num) 
	{
		int i=2;
		boolean prime = true;
		while(i<num && prime)
		{
			if(num%i==0)
				prime = false;
			++i;
		}
		
		return prime;
	}
}
