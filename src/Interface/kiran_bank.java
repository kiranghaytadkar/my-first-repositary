package Interface;

public class kiran_bank implements BRAZIL_bank,RBI_BANK,US_bank {
	
	
	@Override
	public void home_loan() {
		// TODO Auto-generated method stub
		System.out.println("kiran bank accepted your condition for giving home loan");
	}

	@Override
	public void car_loan() {
		// TODO Auto-generated method stub
		System.out.println("kiran bank accepted your condition for giving car loan");

	}

	@Override
	public void RBI_creadit_card() {
		// TODO Auto-generated method stub
		System.out.println("kiran bank accepted your condition for giving  RBI_creadit_card");
	
	}

	@Override
	public void RBI_debit_card() {
		// TODO Auto-generated method stub
		System.out.println("kiran bank accepted your condition for giving  RBI_debit_card");

	}

	@Override
	public void RBI_money_transfer() {
		// TODO Auto-generated method stub
		System.out.println("kiran bank accepted your condition for giving  RBI_money_transfer");

	}

}
