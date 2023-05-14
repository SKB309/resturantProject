package RestuPackage;

import java.util.List;

public class Order {
	
	
	private List<Integer> quantities;
    private double totalPrice;
	
	    private List<MenuItem> items;
	    public List<MenuItem> getItems() {
			return items;
		}
		public void setItems(List<MenuItem> items) {
			this.items = items;
		}
		public List<Integer> getQuantities() {
			return quantities;
		}
		public void setQuantities(List<Integer> quantities) {
			this.quantities = quantities;
		}
		public double getTotalPrice() {
			return totalPrice;
		}
		public void setTotalPrice(double totalPrice) {
			this.totalPrice = totalPrice;
		}
		public void addItem(Object itemByName, int i) {
			// TODO Auto-generated method stub
			
		}
		

}
