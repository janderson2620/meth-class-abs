package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		List<Shape> list = new ArrayList<>();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Shape#" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			sc.nextLine();
			String cor = sc.nextLine();
			
			if(ch == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Heigth: ");
				double heigth = sc.nextDouble();
				list.add(new Rectangle(Color.valueOf(cor), width, heigth));
			}
			else if (ch == 'c') {
				System.out.print("Radius: ");
				double radius  = sc.nextDouble();
				list.add(new Circle(Color.valueOf(cor), radius));
			}
			else {
				System.out.println("Formato não encontrato!");
			}
		}
		
		System.out.println("ASHAPE AREAS");
		
		for(Shape shape : list) {
			System.out.println(shape.area());
		}
		
		sc.close();
	}

}
