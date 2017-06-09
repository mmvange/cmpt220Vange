import java.util.*;

public class Stocks {
	public static void main(String[] args) {
    char a;
    do{
      //ask user for stock to analyze
      System.out.print("Enter a stock symbol: "); //prompt user 
      Scanner input = new Scanner(System.in);
      String symbol = input.next(); 
		
      StockDownloader stock = new StockDownloader(symbol);
      System.out.println(); //style 
		
      //print stats on stock 
      System.out.println("Symbol: " + stock.getSymbol()); //symbol 
      System.out.println("Price: " + stock.getPrice()); //current price 
      System.out.println("Date: " + stock.getDate()); //date 
      System.out.println("Time: " + stock.getTime()); //time 
      System.out.println("Change: " + stock.getChange() + "%"); //change with percentage 
      System.out.println("Open: " + stock.getOpen()); //open price 
      System.out.println("High: " + stock.getHigh()); //high price 
      System.out.println("Low: " + stock.getLow()); //low price 
      System.out.println("Volume: " + stock.getVolume()); //volume 
    
    
      if(stock.getChange() < (-15)){ //alert if stock price has decreased by 15%, an indicator that a trader should buy now and then sell shortly thereafter when it makes a small rebound 
        System.out.println("**Gap down: Buy " + stock.getSymbol() + " now.**"); //this strategy is called a Gap Down, also added the asterisks to get the attention of the user 
      
      }
      else if(stock.getChange() > (10)){
        System.out.println("**Price increase by 10%: Sell current positions in " + stock.getSymbol() + "**");
        //if the stock increases by 10%, the user that owns this stock should sell it, the user can also edit the code to their likeness- if they want to sell it when it raises by 15% instead (for example) 
        //if the user does not own this stock, as a financial trader, they should know not to buy a stock when it just raised 10% --> that defeats the buy low, sell high strategy 
        }
      else{
        System.out.println("No significant change, hold " + stock.getSymbol()); //else: hold stock (do not buy or sell) 
      
      }
      
      System.out.println(); //style 
      System.out.print("Analyze another stock? (Y/N): ");
      a = input.next().charAt(0);
      System.out.println();
      
    } while (a == 'y' || a == 'Y'); //reiterate until the user does not want to analyze any more stocks
    
	}
}