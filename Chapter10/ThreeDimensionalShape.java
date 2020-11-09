/*
 * 10.9 (Project: Shape Hierarchy) Implement the Shape hierarchy 
 * shown in Fig. 9.3. Each TwoDimensionalShape should contain method 
 * getArea to calculate the area of the two-dimensional shape. 
 * Each ThreeDimensionalShape should have methods getArea and getVolume 
 * to calculate the surface area and volume, 
 * respectively, of the three-dimensional shape. Create a program that 
 * uses an array of Shape references to objects of each concrete class 
 * in the hierarchy. The program should print a text description of the 
 * object to which each array element refers. Also, in the loop that 
 * processes all the shapes in the array, determine whether each shape 
 * is a TwoDimensionalShape or a ThreeDimensionalShape. If it's 
 * a TwoDimensionalShape, display its area. 
 * If its a ThreeDimensionalShape, display its area and volume.
 * */

public abstract class ThreeDimensionalShape extends Shape
{	
    // give 3d shapes both volume and area calculations
	public abstract double calculateVolume();
	public abstract double calculateArea();
}