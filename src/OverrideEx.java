
public class OverrideEx {
	
	/*static void paint(Shape paint)
	{
		paint.draw();
		
	}*/ // 스태틱을 메소드를 사용 안하고 작성해보았다.
	
	public static void main(String[] args) {
		int a =0;
		
		Shape x = new Shape();
		
		x.paint(new Shape());
		x.paint(new Line());
		x.paint(new Rect());
		x.paint(new Circle());
	
		
		System.out.println(x.a);
		
	}
	

	
}
