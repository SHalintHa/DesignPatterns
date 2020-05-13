package singleton;


public class Application {
	public static void main(String[] args) {
	
		long start, end;
		
		start=System.currentTimeMillis();
		Stock stock = Stock.getStock();
		end=System.currentTimeMillis();
		Product product = new Product();
		product.setId(1);
		product.setName("Rice");
		stock.products.add(product);
		System.out.println(stock);
		stock.products.forEach( p -> System.out.println(p.getId()+" "+ p.getName()));
		
		System.out.println(end-start);
		
		start=System.currentTimeMillis();
		Stock stock1 = Stock.getStock();
		end=System.currentTimeMillis();
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Milk");
		stock1.products.add(product2);
		System.out.println(stock1);
		stock1.products.forEach( p -> System.out.println(p.getId()+" "+ p.getName()));
		
		System.out.println(end-start);
	
	}

}
