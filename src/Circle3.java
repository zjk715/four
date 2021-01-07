
public class Circle3 {
	/**The radius of the circle*/
	double radius;
	
	/**The number of objects created*/
	static int numberOfObjects=0;
	
	/**Construct a circle with radius1*/
	Circle(){
		radius=1;
		numberOfObjects++;
	}
	
	/**Construct a circle with a specified radius*/
	Circle(double newRadius){
		radius=newRadius;
		numbersOfObjects++;
	}
	/**Return numberOfObjects*/
	static int getNumberOfObjects(){
		return numberOfObjects;
	}
	/**Return the area of this circle*/
	double getArea(){
		return radius*radius*Math.PI;
	}

}
