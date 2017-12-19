import java.util.ArrayList;


public class StudentCard {
	private static ArrayList<StudentCard> studentCardList_ = new ArrayList<StudentCard>();
	
	private int accountBalance = 0;
	
	public StudentCard() {
		studentCardList_.add(this);
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	

}
