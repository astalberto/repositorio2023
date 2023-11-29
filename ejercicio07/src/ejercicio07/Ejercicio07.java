/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

import java.util.Locale;
import java.util.Scanner;

/**
 * Utilizando una estructura repetitiva diseñe un algoritmo para calcular e
 * imprimir los k primeros términos de la serie:
 *
 * S1 = 12−11+24−22+36−33+48−44
 */
public class Ejercicio07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese k numero");
        int n = entrada.nextInt();
        int c = 1;
        int base = 12;
        int r = 1;
        int suma = base;
        String signo = "" + base;
        String acumulador = "S1 =";
        while (c <= n) {
            acumulador = String.format("%s%s", acumulador, signo);
            if (c % 2 == 1) {
                suma = suma - r;
            } else {
                base = base + 12;
                r++;
                suma = -base;
            }
            suma = suma * -1;
            if (suma > 0) {
                signo = "+" + suma;
            } else {
                signo = "" + suma;
            }
            c++;
        }
        System.out.println(acumulador);
    }

}
