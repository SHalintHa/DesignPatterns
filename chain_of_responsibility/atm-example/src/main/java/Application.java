
public class Application {
	
	public static void main(String[] args) {
		
		Handler handler = new Handler() {
			@Override
			public void applyDispense(Currency currency) {
				// TODO Auto-generated method stub
				successor.applyDispense(currency);
				
			}
		};
		Dollar10Dispense dollar10Dispense = new Dollar10Dispense();
		Dollar20Dispense dollar20Dispense = new Dollar20Dispense();
		Dollar50Dispense dollar50Dispense = new Dollar50Dispense();
		
		handler.setSuccessor(dollar50Dispense);
		dollar50Dispense.setSuccessor(dollar20Dispense);
		dollar20Dispense.setSuccessor(dollar10Dispense);
		
		Currency currency = new Currency(680);
		
		if(currency.getAmount() % 10 != 0) {
			System.out.println("Please enter the amount that multiple by 10");
			return;
		}
		handler.applyDispense(new Currency(currency.getAmount()));

		
	
	}

}
