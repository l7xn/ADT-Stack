package com.mycompany.adt;

public class Adt {

     public static void main(String[] args) {
		Stack list1 = new Stack();
                Stack list2 = new Stack();
		
		list1.push(5);
		list1.push(8);
		list1.push(7);
		list1.push(9);
		list1.display();
		list1.pop();
                list1.display();
                
                
                
                list2.push(9);
                list2.push(5);
                list2.push(3);
                list2.push(6);
                list2.display();
                list2.pop();
                list2.display();
                
                
             System.out.println("the element peek: "+list1.peek());		
             System.out.println("Are there items stored? :" + list1.isEmpty());
             System.out.println("number of elements stored list 2 : "+list2.size());
		
		
	}
}