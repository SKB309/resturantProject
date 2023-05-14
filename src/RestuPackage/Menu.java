package RestuPackage;

import java.util.List;

public class Menu {
	
	 private List<MenuItem> items;
	    
	    public void addItem(MenuItem item) {
	        // add the item to the list
	    }
	    
	    public void removeItem(MenuItem item) {
	        // remove the item from the list
	    }
	    
	    public void updateItem(MenuItem item) {
	        // update the item in the list
	    }

		public List<MenuItem> getItems() {
			return items;
		}

		public void setItems(List<MenuItem> items) {
			this.items = items;
		}

		public Object getItemByName(String string) {
			// TODO Auto-generated method stub
			return null;
		}
		
		
		
		public void laizar() {
			
			// create a menu
			Menu menu = new Menu();
			menu.addItem(new MenuItem("Pizza Margherita", "Tomato sauce, mozzarella, and basil", 10.99));
			menu.addItem(new MenuItem("Pasta Carbonara", "Spaghetti with bacon, egg, and Parmesan cheese", 12.99));
			menu.addItem(new MenuItem("Tiramisu", "Classic Italian dessert with ladyfingers, mascarpone, and espresso", 6.99));

			// display the menu
			System.out.println("Welcome to our restaurant!");
			System.out.println("Here is our menu:");
			for (MenuItem item : menu.getItems()) {
			    System.out.println(item.getName() + " - " + item.getDescription() + " - $" + item.getPrice());
			}
		} 

}
