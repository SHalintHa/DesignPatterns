package momento;

import java.util.Stack;

public class CareTaker {
	
	Stack<Cart.CartMomento> history = new Stack<Cart.CartMomento>();

	
	public void save(Cart cart) {
		history.push(cart.save());
	}
	
	public void revert(Cart cart) {
		if(!history.isEmpty()){
			cart.revert(history.pop());
		}
		else {
			System.out.println("Cannot undo");
		}
	}
}
