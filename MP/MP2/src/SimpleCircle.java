import java.util.*;

public class SimpleCircle {
	public static void main (String [] args){
		Scanner keys = new Scanner(System.in);
		
		double radius;
		int userchoice;
		
		System.out.print("Please enter a radius: ");
		radius = keys.nextDouble();
		
		System.out.println("(1) Calculate Area");
		System.out.println("(2) Calculate Circumference");
		System.out.print("Please select an option: ");
		userchoice = keys.nextInt();
		
		if(userchoice == 1){
			double arearesult = area(radius);
			System.out.printf("The area of a circle with radius %f is %f",radius, arearesult);
			
			//double area = (Math.PI)*(radius)*(radius);
			 //System.out.printf("The area of a circle with radius %f is %f", radius, area);
		}
		else if(userchoice == 2){
			double circumresult = circumference(radius);
			System.out.printf("The circumference of a circle with radius %f is %f", radius, circumresult);
		}			
	}
	
	public static double area(double radius){
		double area = (Math.PI)*(radius)*(radius);
		return area;
	}
	
	public static double circumference(double radius){
		double circumference = (2)*(radius)*(Math.PI);
		return circumference;
	}
}
