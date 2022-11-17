
class Shape {
	public Shape next;
	public Shape() {next = null;}
	int a = 12;
	
	public void draw() {
		
		System.out.println("Shape");
	}
	public void paint(Shape p) {
		
		p.draw();
		
	}
}

class Rect extends Shape{
	
	@Override
	public void draw() {
		
		System.out.println("Rect");
	}

}

class Line extends Shape{
	
	@Override
	public void draw() {
		
		System.out.println("Line");
	}
	
}

class Circle extends Shape{
	
	@Override
	public void draw() {
		
		System.out.println("Circle");
	}
	
}