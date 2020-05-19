
public class NBT extends Handler{

	@Override
	public double applyTax(Invoice invoice) {
		// TODO Auto-generated method stub
		invoice.setTax(invoice.getTax() + invoice.getAmount() * 0.02);
		System.out.println("NBT calculated");
		if(invoice.getAmount() > 100.0 && invoice.getAmount() <= 200.0) {
			return invoice.getTax();
		}
		else {
			return successor.applyTax(invoice);
		}
	}

}
