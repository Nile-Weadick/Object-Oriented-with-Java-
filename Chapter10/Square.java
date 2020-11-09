public class Square extends TwoDimensionalShape
{
    private double length;
    
	   // constructor
	public Square()
	{
		setLength(0.0);
	}
	
	public Square(double l)
	{
		setLength(l);
    }
    
        // set method
	public void setLength(double l)
	{
		length = l;
	}
    
        // get method
	public double getLength()
	{
		return length;
	}
    
        //Actions 
	@Override
	public double calculateArea() 
	{
		return Math.pow(getLength(), 2); 
	}
	
	@Override
	public String toString()
	{
		return String.format("%sLength: %.2f\n",super.toString(),getLength());
	}
}