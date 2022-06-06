package Interface;

public interface BRAZIL_bank extends US_bank {
	
	void car_loan();
	@Override
	default void home_loan() {
		// TODO Auto-generated method stub
		
	}
}
