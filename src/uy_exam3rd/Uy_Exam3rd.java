/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uy_exam3rd;
import java.util.Scanner;
import java.util.PriorityQueue;


       

public class Uy_Exam3rd {
    
    private class PriorityQueue {
        int priority;
        int data;
        PriorityQueue next;

   
    }
    private PriorityQueue front;
    public Uy_Exam3rd() {
        int printCount =0;
        front = null;
        

}
    private void insertion(int item, int priority) {
        PriorityQueue node = new PriorityQueue();
        node.data = item;
        node.priority = priority;
        node.next = null;
        
        if (front == null || priority <= front.priority) {
            node.next = front;
            front = node;
        }else {
            PriorityQueue temporary = front;
            while (temporary.next.priority <= priority) {
                temporary = temporary.next;
            }
            node.next = temporary.next;
            temporary.next = node;
        }
    } 
        
    public int deletion () throws Exception {
        
        int temporary = front.data;
        front = front.next;
        return temporary;
    }
    public void display() throws Exception {
        
        PriorityQueue temporary = front;
        
        System.out.println("Priority \t\t Value");
        
        while(temporary != null) {
            System.out.println(temporary.priority + "\t\t\t");
            temporary = temporary.next;
        }
        System.out.println("\n");
             
    }
    
    public static void main(String[] args) throws Exception {
        Uy_Exam3rd queue = new Uy_Exam3rd();
        Scanner scn = new Scanner (System.in);
        
        while(true){
            System.out.println("1. Insert");
            System.out.println("2. Display");
            System.out.println("3. Delete");
            int choice = scn.nextInt();
            int item, priority = 0;
            
            switch (choice) {
                case 1:
                    System.out.println("Enter Your Name: ");
                    item = scn.nextInt();
                    System.out.println("Enter Your Position: ");
                    queue.insertion(item, priority);
                    break;
                case 2:
                    System.out.println("Your PrintCount: ");
                    queue.display();
                    break;
                case 3:
                    System.out.println("deleted ");
                    
                    
            }
        }
        
    }
}

    

