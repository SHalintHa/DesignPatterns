
public class VAT extends Handler {

	@Override
	public double applyTax(Invoice invoice) {
		// TODO Auto-generated method stub
		invoice.setTax(invoice.getTax() + invoice.getAmount() * 0.01);
		System.out.println("VAT calculated");
		if(invoice.getAmount() <= 100) {
			return invoice.getTax();
		}
		else {
			return successor.applyTax(invoice);
		}
	}

	
}
