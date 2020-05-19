
public class TAX extends Handler{

	@Override
	public double applyTax(Invoice invoice) {
		// TODO Auto-generated method stub
		return successor.applyTax(invoice);
	}

}
