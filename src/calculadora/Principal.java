package calculadora;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2,menu;
		Scanner sc = new Scanner (System.in);
		
		do {
			menu();
			menu = Integer.parseInt(sc.nextLine());
			switch(menu){
				
			case 1:
				num1 = Integer.parseInt(sc.nextLine());
				num2 = Integer.parseInt(sc.nextLine());
				System.out.println(num1+num2);
				
				break;
			case 2:
				num1 = Integer.parseInt(sc.nextLine());
				num2 = Integer.parseInt(sc.nextLine());
				System.out.println(num1-num2);
				break;
			case 3:
				
				break;
			case 4:
				
				break;
				
				
			
			}
			
			
			
		}while(menu!=0);
		
	}
	public static void menu() {
		
		System.out.println("1.-Sumar");
		System.out.println("2.-Restar");
		System.out.println("3.-Multiplicar");
		System.out.println("4.-Dividir");
		
	}

}
