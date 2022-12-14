package configApp;

import org.springframework.stereotype.Component;

@Component
public class Bicycle implements Vehicle
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
		System.out.println("Hi I am riding bicycle!!!");
	}
	@Override
	public String toString() {
		return "Bicycle [brand=" + brand + "]";
	}
	
}
