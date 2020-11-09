
public class ShapeTest 
{
	public static void main(String[] args)
	{   
        // Create new array of shape objects
		Shape[] shapes = new Shape[6];
        
        // populate indexs with objects
		shapes[0] = new Square(1.0);
		shapes[1] = new Triangle(1.0, 1.0);
		shapes[2] = new Circle(1.0);
		shapes[3] = new Sphere(1.0);
		shapes[4] = new Cube(1.0);
		shapes[5] = new Tetrahedron(1.0);
        
        // iterate throygh objects in array and preform calcualtiosn and print result
		for(Shape s : shapes)
		{
			if(s instanceof TwoDimensionalShape)
				System.out.printf("%sArea: %.2f\n\n", s.toString(),((TwoDimensionalShape) s).calculateArea() );
			else if(s instanceof ThreeDimensionalShape)
				System.out.printf("%sSurface Area: %.2f\nVolume: %.2f\n\n", s.toString(),
						((ThreeDimensionalShape) s).calculateArea(),
						((ThreeDimensionalShape) s).calculateVolume());
		}
	}

}