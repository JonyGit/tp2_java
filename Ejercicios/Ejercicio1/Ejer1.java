package Ejercicio1;
import java.util.Scanner;

public class Ejer1{
    private Scanner teclado;
    private int cantidad;
    private float precio;
    private float resultado;

public void ingresar() {
    teclado = new Scanner(System.in);
    System.out.print("Ingrese la cantidad del producto: ");
    cantidad = teclado.nextInt();
    System.out.print("Ingrese el precio del producto: ");
    precio = teclado.nextFloat();
    }
public void calcular() {
    resultado = cantidad * precio;
    System.out.print("El comprador debe abonar: $" +resultado);
    }
public static void main(String[] ar){
    Ejer1 prueba1 = new Ejer1();
    prueba1.ingresar();
    prueba1.calcular();
      }
}