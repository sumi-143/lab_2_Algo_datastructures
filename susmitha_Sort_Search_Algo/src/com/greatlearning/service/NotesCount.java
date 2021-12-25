package com.greatlearning.service;

public class NotesCount {
	//notes is already sort
	//amount --> input
	public void notesCountImplementation(int notes[],int amount) {
		int[] notesCounter = new int[notes.length];
		
		try{//across all the notes i.e loop if amount>notes[i]
			//update notesCounter
			//update amount
		for(int i=0;i<notes.length;i++) {
			if(amount>=notes[i]) {
				notesCounter[i]=amount/notes[i];
				amount=amount-notesCounter[i]*notes[i];
			}
		}
		//If amount cannot be paid
		if(amount>0) {
			System.out.println("Exact amount cannot be given with the highest denomination");
			
		}
		else {
			System.out.println("Your payment approach in order to give min no of notes will be");
			for(int i=0;i<notes.length;i++) {
				if(notesCounter[i] != 0) {
					System.out.println(notes[i]+":"+notesCounter[i]);
				}
			}
		}
		//if amount>0
			//print cannot get exact amount
		//else
			//print the denominations with the count
		}catch(ArithmeticException e) {
			System.out.println(e+"notes of denominations 0 is invalid");
		}
	}
		
}
