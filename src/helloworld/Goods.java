package helloworld;

public class Goods {
	private String name;
	private int price;
	
	public Goods() {
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if( price < 0 ) {
			price = 0;
		}
		this.price = price;
	}

	public int calcDiscountPrice(double rate) {
		//int i = 10;
		//double d = i;
		return (int)(price * rate);
	}

	public int calcDiscountPrice(int rate) {
		return price * rate;
	}
	
}
