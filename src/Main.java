
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //se utiliza la clase Scanner, usando su metodo escanner, dopnde se captura con System.in
    Scanner scanner = new Scanner (System.in);
    // se crea la variable del tipo String "entrada" y se le asigna valor ""
    String entrada ="";
    // Mientras que el usuario no escriba el comando Salir, le seguirá pidiendo escribir un comando

        while (!entrada.equals("salir")) {
        //loop de ingresa comando
        System.out.println("Ingresa el comando: ");
        //se captura lo ingresado por el usuario, se reemplaza el valor de "entrada" que era "" por lo capturado por el metodo scanner
        //se ultiliza un metodo para cambiar toda letra a minúscula
        entrada = scanner.next().toLowerCase();}

    //si el usuario escribe "salir" se rompe el loop y escribre en pantalla
        System.out.println("Felicidades, has logrado salir del Loopsad" );
    }


        /*
        //se utiliza la clase Scanner, usando su metodo escanner, dopnde se captura con System.in
        Scanner scanner = new Scanner(System.in);
        // se pide al usuario ingresar un número
        System.out.println("Ingrese un número: ");
        //se define la variable "numero" del tipo int y se le asigna lo ingresado por el usuario en System.in
        int numero = scanner.nextInt();

        //se compara si el numero es par o impar, usando el operaodr modulo
        if (numero % 2 ==0) {
            System.out.println("El Número es Par");
            } else {System.out.println("El Número es Impar");}

        //se comparan las condiciones para saber si es divisible por 3, por 4 o por ambos.
        if (numero % 3 == 0 && numero % 4 ==0){
            System.out.println("El número es divisible por 4 y por 3");}
                else if (numero %4 ==0) {
                System.out.println("El número es divisible por 4");}
                     else if (numero % 3 == 0 ) {
                     System.out.println("El número es divisible por 3");}}*/
}


