
public class Dollar20Dispense extends Handler {

	@Override
	public void applyDispense(Currency currency) {
		
		if(currency.getAmount() >= 20) {
			int num = currency.getAmount()/20;
			int remainder = currency.getAmount() % 20;
			System.out.println(num + " 20$ note(s)");
			if(remainder != 0) {
				successor.applyDispense(new Currency(remainder));
			}
		}
		else {
			successor.applyDispense(currency);
		}
		
	}

}
