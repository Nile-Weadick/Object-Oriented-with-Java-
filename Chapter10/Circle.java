
public class Circle extends TwoDimensionalShape
{
	private double radius;
	
	public Circle()
	{
		setRadius(0.0);
	}
    
    // constructor
	public Circle(double r)
	{
		setRadius(r);
	}
    
    // set methods
	public void setRadius(double r)
	{
		radius = r;
	}
    
    // get method
	public double getRadius()
	{
		return radius;
	}
    
    //Actions 
	public double calculateArea()
	{
		return Math.PI * (Math.pow(radius, 2));
	}
	
	@Override
	public String toString()
	{
		return String.format("%sRadius: %.2f\n",super.toString(),getRadius());
	}
	
}