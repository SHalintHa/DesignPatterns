
public class Dollar10Dispense extends Handler {
	

	@Override
	public void applyDispense(Currency currency) {
		if(currency.getAmount() >= 10) {
			int amount = currency.getAmount();
			int num = amount / 10;
			int remainder = currency.getAmount() % 10;
			System.out.println(num + " 10$ note(s)");
			if(remainder != 0) {
				successor.applyDispense(new Currency(remainder));
			}
		}
		else {
			successor.applyDispense(currency);
		}
	}

}
