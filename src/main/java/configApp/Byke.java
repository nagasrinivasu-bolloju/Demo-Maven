package configApp;

import org.springframework.stereotype.Component;

@Component
public class Byke implements Vehicle
{
	private String brand;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void drive()
	{
		System.out.println("Hi I am riding a byke!!!");
	}
}
