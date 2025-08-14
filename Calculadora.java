import java.util.Scanner;

public class Calculadora {
    
     public static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);

        System.out.println("Ingrese primer numero:");
        double numero1 = escaner.nextDouble();
        escaner.nextLine();

        System.out.println("Ingrese segundo numero:");
        double numero2 = escaner.nextDouble();
        escaner.nextLine();
        double suma, resta, multiplicacion, resModulo, division;
        suma = sumar(numero1, numero2); // Invocar un metodo
        resta = restar(numero1, numero2);
        multiplicacion = producto(numero1, numero2);
        resModulo = modulo(numero1, numero2);
        division = dividir(numero1, numero2);
        System.out.println("El resultado de la suma fue: " + suma);
        System.out.println("El resultado de la resta fue: " + resta);
        System.out.println("El resultado de la multiplicacion fue: " + multiplicacion);
        System.out.println("El resultado del modulo fue: " + resModulo);
        System.out.println("El resultado de la division fue: " + division);
     }
    // Declarar un metodo
    public static double sumar(double a, double b) {
        return a + b;
        
    }
    
    public static double restar(double a, double b) {
        return a - b;
        
    }

    public static double producto(double a, double b) {
        return a * b;
        
    }
    
    public static double dividir(double a, double b) {
        return a / b;
        
    }

    public static double modulo(double a, double b) {
        return a % b;
        
    }
    

}