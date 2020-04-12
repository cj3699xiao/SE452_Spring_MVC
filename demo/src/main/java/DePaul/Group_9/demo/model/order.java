package DePaul.Group_9.demo.model;

import java.util.Date;
import java.util.Map;

public class order {
	int orderID;
	Map<Shoes,Store> orderedShoes;
	Date order_time;
	int customerID;
	int storeID;
	Address Customer_adrs;
	Address Merchant_adrs;
	float order_price;
	String payment_method;
	
}
