/**

**/
import java.net.URL; //all so I can use the URL to access Yahoo Finance information 
import java.net.URLConnection;
import java.util.*;

public class StockDownloader {
	//symbol is column 1 of file, price is column 2, date is column 3, etc. 
	public static final int SYMBOL = 0; //stock ticker: AAPL for Apple, EA for Electronic Arts, etc
	public static final int PRICE = 1; //current price of stock 
	public static final int DATE = 2; //date 
	public static final int TIME = 3; //time 
	public static final int CHANGE = 4; //change since last refresh 
	public static final int OPEN = 5; //opening price that day 
	public static final int HIGH = 6; //high 
	public static final int LOW = 7; //low 
	public static final int VOLUME = 8; //volume of stocks traded 

	//declare variables for storing data from Yahoo Finance file 
	private String line;
	private String[] infoArray;
	private String symbol; //symbol, date, and time are strings 
	private double price; //price, change, open, high, and low are doubles bc they need to be numbers with decimals 
	private String date;
	private String time;
	private double change;
	private double open;
	private double high;
	private double low;
	private int volume; //volume is int because its unit of measurement is shares of stock - volume can only equal 7 shares of stock as opposed to 7.2 shares 

	//constructor opens Yahoo Finance information on a stock symbol that is inputted by the user 
	public StockDownloader(String symbol) {
		//URL for downloading data on specified stock 
		String url = "http://download.finance.yahoo.com/d/quotes.csv?s=" + symbol +"&f=sl1d1t1c1ohgv&e=.csv&columns='symbol,price,date,time,change,col1,high,low,col2";

		//open the URL 
		try { 
			//get information from URL 
			URL yahoofin = new URL(url);
			URLConnection data = yahoofin.openConnection(); //open URL 
			Scanner input = new Scanner(data.getInputStream());
			
			while(input.hasNextLine()) {
				line = input.nextLine(); //read information into a string 
				infoArray = line.split(","); //split the information at the commas into an array 
			}
		}
		
		catch (Exception e) { //error clause 
			System.err.println(e);
		}
	}
  
	public String getSymbol() {
		symbol = infoArray[SYMBOL]; //assign symbol variable 
		symbol = symbol.replaceAll("\"", ""); //remove quotes 
		return symbol.toUpperCase(); //if user inputs "aapl", the output information is shown as "AAPL" ... this is important because stock tickers are displayed in uppercase 
    
	}
	
	public double getPrice() {
		price = Double.parseDouble(infoArray[PRICE]); //assign info variable, convert fron string to double 
    return price;
    
	}
	
	public String getDate() {
		date = infoArray[DATE]; //assign date variable 
		date = date.replaceAll("\"", ""); //get rid of quotes 
		return date;
    
	}
	
	public String getTime() {
		time = infoArray[TIME]; //assign time variable 
		time = time.replaceAll("\"", "");
		return time;
    
	}
	
	public double getChange() {
		change = Double.parseDouble(infoArray[CHANGE]); //assign change variable, convert to double 
		return change;
    
	}
	
	public double getOpen() {
		open = Double.parseDouble(infoArray[OPEN]); //assign open variable, convert to double 
		return open;
    
	}
	
	public double getHigh() {
		high = Double.parseDouble(infoArray[HIGH]); //assign high variable, convert to double 
		return high;
    
	}
	
	public double getLow() {
		low = Double.parseDouble(infoArray[LOW]); //assign low variable, convert to double 
		return low;
    
	}
	
	public int getVolume() {
		volume = Integer.parseInt(infoArray[VOLUME]); //assign volume variable, convert to integer 
		return volume;
    
	}
}