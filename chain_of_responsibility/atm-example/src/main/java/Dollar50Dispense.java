
public class Dollar50Dispense extends Handler{

	@Override
	public void applyDispense(Currency currency) {
		
		if(currency.getAmount() >= 50){
			int num = currency.getAmount()/50;
			int remainder = currency.getAmount() % 50;
			System.out.println(num + " 50$ note(s)");
			if(remainder != 0) {
				successor.applyDispense(new Currency(remainder));
			}
		}
		else {
			successor.applyDispense(currency);
		}
	}

}
