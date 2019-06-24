package com.mutations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Bank mut = new Bank();
		mut.setStart("AACCGGTT");
		System.out.println("Beginning Mutation: "+mut.getStart());
		mut.setEnd("AACCGGTA");
		System.out.println("Ending Mutation: "+mut.getEnd());
		*/
		randomStringBank();
	}

	public static int randomStringBank() {
		//Beginning and Ending mutation from the Bank Class
		Bank mutation = new Bank();
		mutation.setStart("AACCGGTT");
		System.out.println("Beginning Mutation: "+mutation.getStart());
		mutation.setEnd("AACCGGTA");
		System.out.println("Ending Mutation: "+mutation.getEnd());
		
		Scanner chr = new Scanner(System.in); //scanner object 
		System.out.println("Enter a 8 char String using only A, C, G, T charStrings: ");
		String mut1 = chr.nextLine();//user input for the first mutation
		String mut2 = chr.nextLine();//user input for the second mutation
		String mut3 = chr.nextLine();//user input for the third mutation
		System.out.print("String mutation input: "+mut1+", "+mut2+" ,"+mut3);
		System.out.println(" ");
		
		/*
		char[] stringToCharArray = mut.toCharArray();
		char[] stringToCharArray2 = mut2.toCharArray();
		char[] stringToCharArray3 = mut3.toCharArray();
		for(char genebank : stringToCharArray ) {
			System.out.print(" "+genebank+" ");
			
		}
		for(char genebank2 : stringToCharArray2) {
			System.out.print(" "+genebank2+" ");
			
		}
		for (char genebank3 : stringToCharArray3) {
			System.out.print(" "+genebank3+" ");
		}
		*/
		
		//creating a new stack for the Bank
		//This bank holds the mutations that was entered from the user 
		Stack bank = new Stack();
		bank.push(mut1);
		bank.push(mut2);
		bank.push(mut3);
		System.out.println("Bank: "+bank.toString());
		
		//iterating through the Bank 
		Iterator<String> iter = bank.iterator();
		while(iter.hasNext()) {
			Object nextMut = iter.next();	
		}
		//loop statements, determining if the Mutations entered from the user,
		//returns either a beginning mutation or and ending mutation.
		//this is accomplished through the index of the Bank. [ 0, 1, 2]
		if(mutation.getStart().contains(mut1)) {
			System.out.println(+bank.indexOf(mut1, 0)); //if the mutation entered equals the Start or the End, then it will return a 0
		}else if(mutation.getEnd().contains(mut1)) {
			System.out.println(+bank.indexOf(mut1, 0));
		}else if(mutation.getStart().contains(mut2)) {
			System.out.println(+bank.indexOf(mut2, 1));//if the mutuation entered equals the Start or the End, then it will return a 1
		}else if(mutation.getEnd().contains(mut2)) {
			System.out.println(+bank.indexOf(mut2, 1));
		}else if(mutation.getStart().contains(mut3)) {
			System.out.println(+bank.indexOf(mut3, 2));//if the mutation entered equals the Start or the End, then it will return a 2
		}else if(mutation.getEnd().contains(mut3)) {
			System.out.println(+bank.indexOf(mut3, 2));
		}else {
			System.out.println(+bank.indexOf(null));
		}
		return -1;// will return a -1, if there is no such mutation exist. 
	}
}




