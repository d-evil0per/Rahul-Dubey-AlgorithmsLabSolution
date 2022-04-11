# Rahul-Dubey-AlgorithmsLabSolution
Data Structure And Algorithms Lab Assignment


## Question 1
PayMoney. processes thousands of transactions daily amounting to crores of Rupees. They 
also have a daily target that they must achieve. Given a list of transactions done by 
PayMoney and a daily target, your task is to determine at which transaction PayMoney 
achieves the same. If the target is not achievable, then display the target is not achieved.

#### TestCase 1
```cmd

Enter the size of transaction array
3
Enter the values of array
20 12 31
Enter the total no of targets that needs to be achieved
2
Enter the value of target
21
Target achieved after 2 transactions 
Enter the value of target
19
Target achieved after 1 transactions 
```

#### Explanation
```cmd
Target 1 i.e 21 is achieved after 2 transactions, (20 + 12)
Target 2 i.e 19 is achieved in the 1st transaction itself
```


## Question 2 
You are a traveler and traveling to a country where the currency denominations are 
unknown and as you travel, you get to know about the denomination in random order.
You want to make a payment of amount x, in such a way that the number of notes you give 
is minimum.

Assume that the denominations are in such a way that any amount can be paid.
```cmd
Input
Take input of all the currency denominations ( random order)
Lab 2 – Algorithms Problem Statement
Take input of the amount that you want to pay.
Output
Print the minimum no of notes that you will be using to pay the net amount.
```

#### TestCase 1
```cmd
Enter the size of currency denominations 
3
Enter the currency denominations value
51
10
Enter the amount you want to pay
12
Your payment approach in order to give min no of notes will be
10:1
1:2
```
