import java.util.*;
interface Shape
{
	void calculateArea();
}
class Circle implements Shape
{float r;
	Circle(float r)
	{
		this.r=r;
	}
	public void calculateArea()
	{
		
		System.out.println("the area of a circle is "+(3.14*r*r));
	}
}

class Rectangle implements Shape
{
	int l,b;
	Rectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	public void calculateArea()
	{
		
		System.out.println("the area of a circle is "+(l*b));
	}
}

public class AreaApp
{
	public static void main(String x[])
	{
		
		Scanner xyz =new Scanner(System.in);
			System.out.println("enter the circle radius ");
			float r=xyz.nextFloat();
			
			System.out.println("enter the length of rectangle");
			int  l=xyz.nextInt();
			System.out.println("enter the breath of rectangle ");
			int  b=xyz.nextInt();
			
			Circle c=new Circle(r);
			c.calculateArea();
			
			Rectangle R=new Rectangle(l,b);
			R.calculateArea();
	}
}