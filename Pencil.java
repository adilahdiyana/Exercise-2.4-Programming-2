package PencilSetterGetter;

public class Pencil {
	
	String grade;
	String color;
	String type;
	String brand;
	double price;
	double opacity;
	double height;
	
	// Create Setter Method
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setOpacity(double opacity) {
		this.opacity = opacity;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	// Create Getter Method
	public String getGrade() {
		return this.grade;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String getType() {
		return this.type;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public double getOpacity() {
		return this.opacity;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	// Create a fullThrottle() method
	public void fullThrottle() {
		System.out.println("The pencil is suitable not only for adults, but for kids too!");
	}
}
