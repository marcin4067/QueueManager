/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuemanager;

import java.util.LinkedList;

/**
 *
 * @author hp marcin
 */
class UnSortedLinkedPriorityQueue {
    
 public Node head;
    public int listCount;
    String item = null;
        
   
    public UnSortedLinkedPriorityQueue() 
    {
        LinkedList L = new LinkedList();
        head = new Node(0, item);
	listCount = -1;
    }

    
    public boolean add(String item, int priority) throws QueueOverflowException {
        Node end = new Node(priority,item);
        Node current = head;
        while(current.next != null){
    		current = current.next;
    	}
    	current.next = end;
    	listCount++;
        System.out.println(priority+" appended to tail!" + item);        
        return true;
    }
    
     public int sort() 
    {
      //  System.out.println("a");
        Node current = head;
        int maxTemp = current.priority;
        while(current!=null)
        {
          //  System.out.println("b");
            int temp = current.priority;
          //  System.out.println(temp);
            if(temp > maxTemp)
                {
                     maxTemp = temp;
                }
            
            current = current.next;
        }
        System.out.println(maxTemp); 
        return maxTemp;
    }
     
     public void show(){
        Node current = head;
	while(current.next!=null){
            System.out.print("name: "+current.name+", priority: "+current.priority);
            current = current.next;
            }
	System.out.print("name: "+current.name+", priority: "+current.priority);
         
	}
     public void displayHead(){
		Node current = head;
                
                if(current.next == null)
                {
                    System.out.print("the cueue is empty");
                }
                else
                {
                System.out.print(current.next.name);
                }
	}
     
     public boolean isEmpty()
     {
		
                return listCount == 0;
	}
     
public boolean deleteNodeAtIndex(int index){
    	Node current = head;
    	int jump;
        index=1;//check how work with the index =1 did is remove a max or min element
    	if(index>listCount || index<1){
    		System.out.println("Delete Failed: index out of bounds of size of linked list!!");
    		return false;
    	}    	
    	else{
    		jump=0;
    		while(jump<index-1){
    			current = current.next;
    			jump++;
    		}
    		current.next = current.next.next;
    		System.out.println("Success! Node at index "+index+" deleted.");
    		listCount--;
    		return true;
    	}
    }

}

