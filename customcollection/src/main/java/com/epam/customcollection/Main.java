package com.epam.customcollection;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {
        DataList<Integer> list = new DataList<>();
 
        //Add elements
        Scanner sc=new Scanner(System.in);
        int flag=1;
        while(flag!=0) {
        System.out.println("Enter choice : 1 to add , 2 to remove ,3 to get element,4 to display ");
        int choice=sc.nextInt();
        if(choice==1) {
        	 System.out.println("Enter element");
        	 int x=sc.nextInt();
        	 list.add(x);
        }
        else if(choice==2) {
        	System.out.println("Enter index of element to remove");
       	    int x=sc.nextInt();
       	    list.remove(x);
        }
        else if(choice==3) {
        	System.out.println("Enter index of element to display");
       	    int x=sc.nextInt();
       	 System.out.println(list.get(x));
        }
        
        else
        System.out.println(list);
         
        System.out.println("Enter 0 to exit");
        flag=sc.nextInt();
        }
        sc.close();
    }
}
