package Ejercicio6;
import java.util.Scanner;

public class Ejer6 {
	private Scanner teclado;
    private String nombre;
    private int sueldo;
    
    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese Nombre del Empleado : ");
        nombre = teclado.next();
        System.out.print("Ingrese Sueldo del Empleado : ");
        sueldo = teclado.nextInt();
    }
    public void imprimeDatos(){
        System.out.println("El Nombre del Empleado es : " +nombre);
        System.out.println("El Sueldo del Empleado es : " +sueldo);
    }
    public void imprimeImpuesto(){
        if(sueldo>3000)
            System.out.println("El Empleado debe pagar impuesto");
        else
            System.out.println("El Empleado no debe pagar impuesto");
    }
    public static void main (String args[]){     
        Ejer6 empleado1 = new Ejer6();
        empleado1.inicializar();
        empleado1.imprimeDatos();
        empleado1.imprimeImpuesto();
    }  
}
