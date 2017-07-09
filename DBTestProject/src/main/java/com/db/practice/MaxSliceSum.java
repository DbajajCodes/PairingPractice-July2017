package com.db.practice;

import java.util.List;

public class MaxSliceSum {

	public static int solution(List<Integer> inputList) {
		int valToReturn = 0;
		if(inputList.size()==1){
			valToReturn = inputList.get(0);
		}else{
			for(int entry:inputList){
				if(entry>0){
				valToReturn += entry;
				}
			}
		}
		return valToReturn;
	}

}
