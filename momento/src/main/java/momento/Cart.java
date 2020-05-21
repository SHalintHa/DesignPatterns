package momento;

import java.util.ArrayList;

public class Cart {
	ArrayList<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	
	public ArrayList<Item> getItems() {
		return (ArrayList) items.clone();
	}
	
	
	public CartMomento save() {
		return new CartMomento(getItems());
	}
	
	
	public void revert(CartMomento cartMomento) {
		items = cartMomento.getItems();
	}
	
	@Override
	public String toString() {
		return "Cart [items=" + items + "]";
	}




	static class CartMomento{
		ArrayList<Item> items;
		
		public CartMomento(ArrayList<Item> items) {
			this.items = items;
		}
		
		private ArrayList<Item> getItems(){
			return items;
		}
	}

}
