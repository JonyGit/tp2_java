package Ejercicio2;
import java.util.Scanner;

public class Ejer2{
	private Scanner teclado;
	private int num;

public void ingresar() {
	teclado = new Scanner(System.in);
	System.out.print("Ingrese un n�mero: ");
	num = teclado.nextInt();
}
public void calcular() {
	if (num < 10) {
		System.out.print(num);
		System.out.print(" Tiene un solo d�gito.");
	}
	else if ((num >= 10) && (num < 100))
    {
      System.out.print(num);
      System.out.print(" Tiene dos d�gitos.");
    }
    else
    {
      System.out.print(num);
      System.out.print(" Tiene tres o m�s d�gitos.");
    }
}
public static void main(String[] ar){
	Ejer2 prueba1 = new Ejer2();
	prueba1.ingresar();
	prueba1.calcular();
  }
}
