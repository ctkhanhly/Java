/**
 * This class implements a vendor that sells one kind
 * of items. A vendor carries out sales transactions.
 */
public class Vendor
{
  // Fields:
  private int priceAnItem, deposit;
  private int N0ofItems;
  //private static double totalSales;
  private int change;
  private Bookeeper bookeeper;
 private static double totalSales;

  /**
   * Constructs a Vendor
   * @param price the price of a single item in cents (int)
   * @param stock number of items to place in stock (int)
   */
  public Vendor(int c, int n, Bookeeper b)
  {
   priceAnItem = c;
   N0ofItems = n;
   bookeeper = b;
  }

  /**
   * Sets the quantity of items in stock.
   * @param qty number of items to place in stock (int)
   */
 public void setStock(int n)
  {
    N0ofItems = n;
  }

  /**
   * Returns the number of items currently in stock.
   * @return number of items currently in stock (int)
   */
  public int getStock()
  {
    return N0ofItems;
  }

  /**
   * Adds a specified amount (in cents) to the
   * deposited amount.
   * @param number of cents to add to the deposit (int)
   */
  public void addMoney(int a)
  {
	  deposit += a;
  }

  /**
   * Returns the currently deposited amount (in cents).
   * @return number of cents in the current deposit (int)
   */
  public int getDeposit()
  {
    return deposit;
  }

  /**
   * Implements a sale.  If there are items in stock and
   * the deposited amount is greater than or equal to
   * the single item price, then adjusts the stock and
   * calculates and sets change, sets deposit to 0 and
   * returns true; otherwise refunds the whole deposit
   * (moves it into change) and returns false.
   * @return true for a successful sale, false otherwise (boolean)
   */
  public boolean makeSale()
  {
    if(N0ofItems >0 && deposit >= priceAnItem){
    	N0ofItems = deposit/priceAnItem;
    	change = deposit - N0ofItems*priceAnItem;
    	deposit = 0;
    	bookeeper.sale(priceAnItem/100);//price/100
    	totalSales+= priceAnItem/100;
    	return true;
    }
    else{
    	change = deposit;
    	return false;
    }
  }

  /**
   * Returns and zeroes out the amount of change (from
   * the last sale or refund).
   * @return number of cents in the current change (int)
   */
  public int getChange()
  {
	  change = 0;
	  makeSale();
	  return change;
  }
 public Bookeeper getBooks(){
	 return bookeeper;
 }
}
