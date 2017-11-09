package moveMethod;

public class Account {
	
   private AccountType _type;
   private int _daysOverdrawn;
	
   double bankCharge() {
       double result = 4.5;
       return result = (_daysOverdrawn > 0) ? result += _type.overdraftCharge(_daysOverdrawn) : result;
       
   }

}
