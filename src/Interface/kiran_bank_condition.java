package Interface;

public class kiran_bank_condition {
	
	public static void main (String[]args) {
		
		
		System.out.println(RBI_BANK.MIN_BALANCE);
		System.out.println(RBI_BANK.name);
		
		
		kiran_bank kb=new kiran_bank();
		kb.RBI_creadit_card();
		kb.RBI_debit_card();
		kb.RBI_money_transfer();
		kb.car_loan();
		kb.home_loan();
		System.out.println("************************");
		
		RBI_BANK rb=new kiran_bank();
		rb.RBI_creadit_card();
	}

}
