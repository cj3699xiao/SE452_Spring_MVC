package DePaul.Group_9.demo.model;

public class Specified_Shoes extends Shoes {
	private int productID;
	private float extraPrice;
	private String description;
	
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public float getExtraPrice() {
		return extraPrice;
	}
	public void setExtraPrice(float extraPrice) {
		this.extraPrice = extraPrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
