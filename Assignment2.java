import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three points for a triangle: "); 
		
		Double x1 = input.nextDouble();
		Double y1 = input.nextDouble();
		Double x2 = input.nextDouble();
		Double y2 = input.nextDouble();
		Double x3 = input.nextDouble();
		Double y3 = input.nextDouble();

		Double side1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		Double side2 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
		Double side3 = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));		
		Double s = (side1 + side2 + side3)/2;
		Double area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));

		System.out.print("The area of the triangle is " + area);
	
		}
} 
