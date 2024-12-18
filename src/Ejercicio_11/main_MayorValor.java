package Ejercicio_11;

import java.util.Scanner;

public class main_MayorValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();

        System.out.print("Ingrese el tercer numero: ");
        int numero3 = scanner.nextInt();

        MayorValor mayorValor = new MayorValor(numero1, numero2, numero3);

        int mayor = mayorValor.encontrarMayor();

        System.out.println("\nEl valor mayor entre " + numero1 + ", " + numero2 + " y " + numero3 + " es: " + mayor);
    }
}
