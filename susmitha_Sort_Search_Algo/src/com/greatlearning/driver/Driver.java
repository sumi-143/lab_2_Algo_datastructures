package com.greatlearning.driver;

import java.util.Arrays;
import java.util.Scanner;

import com.greatlearning.service.MergeSort;
import com.greatlearning.service.NotesCount;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner  = new Scanner(System.in);
		
		MergeSort mergeSort =new MergeSort();
		NotesCount notesCount =new NotesCount();
		System.out.println("Enter the total no of denominations");
		int totalNoOfDenominations =scanner.nextInt();
		//intialize notes array
		int[] notes =new int[totalNoOfDenominations];
		
		//Get currency denominations value
		System.out.println("Enter the Currencty denomination value");
		for(int i=0;i<totalNoOfDenominations;i++) {
			notes[i]=scanner.nextInt();
		}
		//Get the amount to pay
		System.out.println("Enter the amount you want to pay");
		int amount =scanner.nextInt();
		//Merge Sort
		mergeSort.sort(notes,0,notes.length-1);
		//count notes
		System.out.println(Arrays.toString(notes));	
		notesCount.notesCountImplementation(notes, amount);
		
		

	}

}
