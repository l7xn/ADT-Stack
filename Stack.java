package com.mycompany.adt; 

public class Stack {
    private Node Top;

public Stack() {
		Top=null;
	}
public void push(int e) {

		Node n = new Node();
		n.item = e;
		n.next = Top;
		Top = n;
	}

public void display() {
	System.out.print("The list contains the following elements [");

		Node current = Top;
		while ( current != null ) {
			System.out.print(" "+ current.item);
			current =current.next;
		}
		System.out.println(" ]");
	}
public int pop() {
        if (Top == null) {
            return -1;
        } else {
            int popValue = Top.item;
            Top = Top.next;
            return popValue;
        }
}
 public int peek() {
         if (Top == null) {
            return -1; 
        } else {
             return Top.item;

        }
    
 }
 public boolean isEmpty(){
         if(Top==null)
             return true;
         else
             return false;
 }
 public int size(){
    int NodeCounter=0;
     for(Node current=Top;current!=null;NodeCounter++){
         
    current=current.next;
     }
     return NodeCounter;
                  
  }
 


}
