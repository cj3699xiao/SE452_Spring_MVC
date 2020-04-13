package DePaul.Group_9.demo.model;

import java.io.Serializable;

public class ShoesType implements Serializable {
	private int crowd;
	private String style;
	private String color;
	
	public int getCrowd() {
		return crowd;
	}
	public void setCrowd(int crowd) {
		this.crowd = crowd;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
