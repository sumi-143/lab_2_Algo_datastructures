package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.service.TransactionTargetAlgo;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		TransactionTargetAlgo transactionTargetAlgo =new TransactionTargetAlgo();
		System.out.println("Enter the totalTransactions of transaction array");
		//Got totalNoofTransactions of the transactions array
		
		int totalNoOfTransactions =scanner.nextInt();
		
		int[] transactions =new int[totalNoOfTransactions];
		//Get the transactions
		
		System.out.println("Enter the value of transactions");
		for(int i =0;i< totalNoOfTransactions;i++)
			transactions[i]=scanner.nextInt();
		System.out.println("Enter the total no of targets that needs to be achived");
		int targetCount =scanner.nextInt();
		System.out.println("Enter the value of targets");
		int target;
		//calculate the min and overAllSum in advanced and check
		//Input :arr[] ={10,20,10,5,15}
		//OutPut : prefixSum[] ={10,30,40,45,60}
		
		int prefixSum[]=new int[totalNoOfTransactions];
		prefixSum[0]=transactions[0];
		for(int i=1;i<totalNoOfTransactions;i++) {
			prefixSum[i]=prefixSum[i-1]+transactions[i];
		}
		System.out.println(prefixSum);
		for(int i=0;i<targetCount;i++) {
			target =scanner.nextInt();
			transactionTargetAlgo.processTransactions(prefixSum, target);
		}

	}

}
