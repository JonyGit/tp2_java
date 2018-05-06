package Ejercicio3;
import java.util.Scanner;

public class Ejer3{
	private Scanner teclado;
	private int f = 0; 
	private int p = 0;
	private int i = 0;
	private int num;
	
public void ingresarycontar() {
	for (f = 0; f < 10; f++)
    {
    teclado = new Scanner(System.in);  
	System.out.print("Ingrese un número entero: ");
    num = teclado.nextInt();
		if (num % 2 == 0) {
			p++;
		} else {
			i++;
		}
    }
}

public void mostrar() {
	System.out.print("La cantidad de pares es: " +p);
	System.out.print("\nLa cantidad de impares es: " +i);
}

public static void main(String[] ar){
	Ejer3 prueba1 = new Ejer3();
	prueba1.ingresarycontar();
	prueba1.mostrar();
  }
}
