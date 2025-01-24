public class CalculateProfitLoss{
	public static void main(String[]args){
		int costPrice = 129;
		int sellingPrice = 91;
		int profit = costPrice - sellingPrice;
		float profitPercent = (float)((profit / costPrice ) * 100);
		System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
	}
}
