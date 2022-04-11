/**
 * Question 1 Marks (8)
	PayMoney. processes thousands of transactions daily amounting to crores of Rupees. They 
	also have a daily target that they must achieve. Given a list of transactions done by 
	PayMoney and a daily target, your task is to determine at which transaction PayMoney 
	achieves the same. If the target is not achievable, then display the target is not achieved.
 */
package com.greatlearning.lab.question1;

import java.util.Scanner;

/**
 * @author Rahul dubey
 *
 */
public class Paymoney {

	
	private int position;
	public Paymoney() {
		/**
		 * @param None
		 * @returns None
		 */
		
		this.position=-1;
	}
	
	public void checkTarget(int arr[],int target)
	{
		/**
		 * @param int[],int
		 * @returns None
		 */
		int Sum = 0;
		boolean Flag = false;
		int i=0;
		for (i = 0; i < arr.length; i++) {
			Sum = Sum + arr[i];
			if (Sum >= target) {
				Flag = true;
				break;
			}
		}
		if (Flag) {
			this.position=i+1;
		} 
		else
		{
			this.position=-1;
		}
		
		
	}
	public static void main(String[] args) {
		/**
		 * @param args
		 * @returns None
		 */
		Paymoney pay= new Paymoney();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the size of transaction array");
			int size =sc.nextInt();
			int arr[]= new int[size];
			System.out.println("Enter the values of array");
			for (int i=0;i<size;i++)
			{
				arr[i]=sc.nextInt();
			}
			
			System.out.println("Enter the total no of targets that needs to be achieved");
			int noOfTargets =sc.nextInt();
			for (int j =0; j<noOfTargets;j++)
			{
				System.out.println("Enter the value of target");
				int target =sc.nextInt();
				
				pay.checkTarget(arr, target);
				if(pay.position>0)
				{
					System.out.println("Target achieved after "+pay.position +" transactions");
				}
				else
				{
					System.out.println("Given target is not achieved");;
				}
			}
		}

	}

}
