package kfc_app;

import java.util.*;

public class KFC {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		OrderService s1=new OrderService();
		int ch;
		do {
			System.out.println("\n1.Place order\n2.Show orders\n3.Remove order\n4.Show Next Order\n5.Exit");
			System.out.println("\nEnter your choice: ");
			ch=sc.nextInt();
			
			switch(ch) {
			
			case 1:
				System.out.println("Enter order ID: ");
				int id=sc.nextInt();
				System.out.println("Enter phone number: ");
				long phone=sc.nextLong();
				sc.nextLine();
				System.out.println("Enter your orders: ");
				String orders=sc.nextLine();
				
				Order o=new Order(id,phone,orders);
				s1.placeOrder(o);
				break;
			
			case 2: 
				s1.showAllOrder();
				break;
			
			case 3: 
				s1.removeOrder();
				
				break;
				
			case 4: 
				System.out.println("Next Order: "+s1.nextOrder());
				break;
				
			case 5:
				System.out.println("Thanks for using KFC!");
			}
		}while(ch!=5);

	}

}
