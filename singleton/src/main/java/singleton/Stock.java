package singleton;

import java.util.ArrayList;

public class Stock {
	
	private static volatile Stock stock;
	ArrayList<Product> products;
	
	
	private Stock() {
		if(stock != null) {
			throw new RuntimeException("use getStock method");
		}
	}
	
	public static Stock getStock() {
		if(stock == null) {
			synchronized (Stock.class) {
				if(stock == null) {
					stock = new Stock();
					stock.products = new ArrayList<Product>();
				}
			}
		}
		return stock;
	}

}
