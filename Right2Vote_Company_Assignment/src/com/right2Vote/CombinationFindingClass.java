package com.right2Vote;

public class CombinationFindingClass {
	public static void main(String[] args) {
//		GIVEN:
        double amount = 600.00;
        double priceOfTShirt = 50.00;
        double priceOfJeans = 80.00;
        double priceOfJacket = 100.00;
        
//      INVOKING A FUNCTION OF VOID TYPE FOR PRINTING THE COMBINATIONS:
        combinations(amount, priceOfTShirt, priceOfJeans, priceOfJacket);
	}

//  DEFINING THE FUNCTION BELOW:
	public static void combinations(double amount, double priceOfTShirt, double priceOfJeans, double priceOfJacket) {
        int count=0; //TAKING THE COUNT VARIABLE FOR JUST COUNTING COMBINATIONS IN PRINT STATEMENT...
		for (int tShirts=1; tShirts*priceOfTShirt<=amount; ++tShirts) {
			double remainingAmountAfterTShirt=amount-(tShirts*priceOfTShirt);
            for (int jeans=1; jeans*priceOfJeans<=remainingAmountAfterTShirt; ++jeans) {
                int jackets=(int) ((amount-(tShirts*priceOfTShirt)-(jeans*priceOfJeans))/priceOfJacket);
                double totalCost=(tShirts*priceOfTShirt)+(jeans*priceOfJeans)+(jackets*priceOfJacket);
                if (totalCost<=amount  && jackets>=1 && jeans>=1 && tShirts>=1) {
                	++count;
                	System.out.println(count+" ->  "+tShirts+" T-shirts, "+jeans+" Jeans, "+jackets+" Jackets");
                }
            }
        }
        if(count==0){
            System.out.println("Can't find any combination with given amount and conditions....");
        }
    }
}
