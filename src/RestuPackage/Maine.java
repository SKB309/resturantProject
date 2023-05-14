package RestuPackage;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Maine {

	MenuItem menuItem;
	Customer customer;
	Reservation reservation;
	Menu menu;
	static Order order;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		laizar();

		// create a menu
//		Menu menu = new Menu();
//		menu.addItem(new MenuItem());
//		menu.addItem(new MenuItem());
//		menu.addItem(new MenuItem());

		// create an order manager
		OrderManager orderManager = new OrderManager();

		// create a reservation manager
		Reservation reservationManager = new Reservation();

		// create a customer manager
		Customer customerManager = new Customer();

		// display the menu
		System.out.println("Welcome to our restaurant!");
		System.out.println("Here is our menu:");
//		        for (MenuItem item : menu.getItems()) {
//		            System.out.println(item.getName() + " - " + item.getDescription() + " - $" + item.getPrice());
//		        }

		// take orders
		System.out.println("What would you like to order?");
		String nameOfOrder = sc.next();

//		order.addItem(menu.getItemByName("Pizza Margherita"), 1);
//		order.addItem(menu.getItemByName("Tiramisu"), 2);
		orderManager.addOrder(order);
		System.out.println("Your order has been placed!");

		// manage reservations
		System.out.println("Would you like to make a reservation?");
		String reservationMake = sc.next();

		Reservation reservation = new Reservation();
		reservation.setName("John Doe");
		reservation.setPhoneNumber("555-1234");
		reservation.setDate(LocalDate.of(2023, 4, 10));
		reservation.setTime(LocalTime.of(19, 30));
		reservation.setNumGuests(4);
		reservationManager.addReservation(reservation);
		System.out.println("Your reservation has been made!");

		// manage customers
		System.out.println("Would you like to create a customer account?");
		String customerAccount = sc.next();

		Customer customer = new Customer();
		customer.setName("Jane Doe");
		customer.setPhoneNumber("555-5678");
		customer.setAddress("123 Main St");
		customer.setEmail("jane@example.com");
		customerManager.addCustomer(customer);
		System.out.println("Your customer account has been created!");

	}

		
	

}
