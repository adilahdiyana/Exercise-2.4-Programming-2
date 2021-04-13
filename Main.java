package PencilSetterGetter;

public class Main {

	public static void main(String[] args) {
		Pencil p = new Pencil();
		
		p.setGrade("2B");
		p.setColor("Black");
		p.setType("Ballpoint");
		p.setBrand("Cello");
		p.setPrice(1.85);
		p.setOpacity(0.99);
		p.setHeight(1.5);
		
		
		System.out.println("Grade \t\t\t: " + p.getGrade());
		System.out.println("Color \t\t\t: " + p.getColor());
		System.out.println("Type of pencil \t\t: " + p.getType());
		System.out.println("Brand \t\t\t: " + p.getBrand());
		System.out.println("Price of \t\t: RM " + p.getPrice());
		System.out.println("Opacity \t\t: "+ p.getOpacity());
		System.out.println("Height \t\t\t: " + p.getHeight() + " cm");
		
		p.fullThrottle();	
	}
}
