package com.codility.lessons;

public class Lesson2Solution {

	public static int[] solution(int[] A, int K) {
		
		if(A.length == 0){
			return A;
		}
		
		int temp = 0;
		while(K>0){
			temp = A[A.length-1];
			
			for(int i = A.length-2; i >= 0; i--){
				A[i+1] = A[i];
			}

			A[0] = temp;
			K--;
		}
	
		return A;
    }
	
	
	public static void main(String[] args) {
		int[] A = {1,2,3,4};
		int[] solArray = solution(A, 4);
		for(int i: solArray){
			System.out.println(i);
		}
	}
}
