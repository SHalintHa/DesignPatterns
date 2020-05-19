
public class BTT extends Handler{

	@Override
	public double applyTax(Invoice invoice) {
		// TODO Auto-generated method stub
		invoice.setTax(invoice.getTax() + invoice.getAmount() * 0.03);
		System.out.println("BTT calculated");
		if(invoice.getAmount() > 200.0 && invoice.getAmount() <= 300.0) {
			return invoice.getTax();
		}
		else {
			return successor.applyTax(invoice);
		}
	}

}
