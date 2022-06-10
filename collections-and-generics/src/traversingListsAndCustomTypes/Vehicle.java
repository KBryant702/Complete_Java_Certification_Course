package traversingListsAndCustomTypes;

public class Vehicle {
	String make;
	String model;
	int price;
	boolean ForWDrive;
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isForWDrive() {
		return ForWDrive;
	}
	public void setForWDrive(boolean forWDrive) {
		ForWDrive = forWDrive;
	}
	public Vehicle(String make, String model, int price, boolean forWDrive) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
		ForWDrive = forWDrive;
	}
	@Override
	public String toString() {
		return "Vehicle [make = " + make + ", model = " + model + ", price = " + price + ", ForWDrive = " + ForWDrive + "]";
	}
	

}
