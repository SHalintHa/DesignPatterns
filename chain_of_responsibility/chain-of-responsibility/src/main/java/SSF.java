
public class SSF extends Handler{

	@Override
	public double applyTax(Invoice invoice) {
		// TODO Auto-generated method stub
		invoice.setTax(invoice.getTax() + invoice.getAmount() * 0.04);
		System.out.println("SSF calculated");
		return invoice.getTax();
	}

}
