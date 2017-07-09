package com.db.practice;

public class CyclicRotation {

	public static int[] solution(int[] inputArray, int rotateIndex) {
		if(inputArray.length==1){
			return inputArray;
		}else{
			if(rotateIndex == 0){
				return inputArray;
			}else{
				int[] invertedArray = new int[inputArray.length];
				for(int index = rotateIndex; index<inputArray.length;index++){
					invertedArray[index] = inputArray[index-rotateIndex];
				}
				for(int index=rotateIndex-1;index>=0;index--){
					invertedArray[rotateIndex-index-1] = inputArray[inputArray.length-index-1];  
				}
				return invertedArray;
			}
		}
	}
	
	

}
