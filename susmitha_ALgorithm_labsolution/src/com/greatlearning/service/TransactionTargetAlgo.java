package com.greatlearning.service;

public class TransactionTargetAlgo {
	public void processTransactions(int[] prefixSum,int target) {
		int sum=0, flag=0;
		for(int i=0;i<prefixSum.length;i++) {
			//sum +=transactions[i]//extra variable
			//check if target is achieved
			if(prefixSum[i]>=target) {
			System.out.println("Target achived after"+(i+1)+"transactions");
			flag=1;
			break;
		}
	}
	//check if looped across all the transactions
	if(flag ==0) {
		System.out.println("Given target is not achived");
	}
	}
}
