/**
 * Question 2 Marks (12 ) 
	You are a traveler and traveling to a country where the currency denominations are 
	unknown and as you travel, you get to know about the denomination in random order.
	You want to make a payment of amount x, in such a way that the number of notes you give 
	is minimum.
Assume that the denominations are in such a way that any amount can be paid.
 */
package com.greatlearning.lab.question2;
import java.util.HashMap;
import java.util.Scanner;


/**
 * @author Rahul dubey
 *
 */
public class CurrencyDenomination {

	
	
	
	public static void countCurrency(int sortedNotes[],int amount)
	{

		int noteArraySize=sortedNotes.length;
		// To Store the Notes as Key and quantity as Value
        HashMap<Integer,Integer> noteCounter = new HashMap<>();
      
        // counting notes 
        for (int i = 0; i < noteArraySize; i++) {
            if (amount >= sortedNotes[i]) {
            	// putting Notes as key and Quotient as value in HashMap  	
                noteCounter.put(sortedNotes[i], amount / sortedNotes[i]) ;
                // Calculating the remainder
                amount = amount % sortedNotes[i];
            }
        }
      
        // Print notes
        System.out.println("Your payment approach in order to give min no of notes will be");
        // It will a sorted dictionary as key is always in ascending order   
        noteCounter.forEach((key,value)->System.out.println(key+" : "+value));
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MergeSort sort =new MergeSort();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the size of currency denominations");
			int size =sc.nextInt();
			int notes[]= new int[size];
			System.out.println("Enter the currency denominations value");
			for (int i=0;i<size;i++)
			{
				notes[i]=sc.nextInt();
			}
			//sorting array using merge sort in descending order
			sort.mergeSort(notes);
			int [] sortedNotes=sort.getSortedArray();
			
			
			System.out.println("Enter the amount you want to pay");
			int amount =sc.nextInt();
			countCurrency(sortedNotes, amount);
			
		}
	}

}
