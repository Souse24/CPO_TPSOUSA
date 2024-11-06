/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1.exo.pkg2;

import java.util.Scanner;

/**
 *
 * @author souse
 */
public class Tp1Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          double temperature; //création d'une variable double

        Scanner sc = new Scanner(System.in);

        System.out.println("Bonjour, saisissez une valeur :");

        temperature=sc.nextDouble(); //affectation de la saisie de l'utilisateur dans la variable

       

        int valeur;

        System.out.println("Saisissez la conversion que vous souhaiter effectuer :\n1) De Celcius vers Kelvin\n2) De Kelvin vers Celcius\n3) De Farenheit vers Celcius\n4) De Celcius vers Farenheit\n5) De Kelvin vers Farenheit\n6) De Farenheit vers Kelvin");

        valeur=sc.nextInt();

       

        switch (valeur) {
            case 1 -> System.out.println(temperature + " degré Celsius est égal à " + CelciusVersKelvin(temperature) + " degrés Kelvin");
            case 2 -> System.out.println(temperature + " degré Kelvin est égal à " + KelvinVersCelcius(temperature) + " degrés Celsius");
            case 3 -> System.out.println(temperature + " degré Fahrenheit est égal à " + FarenheitVersCelcius(temperature) + " degrés Celsius");
            case 4 -> System.out.println(temperature + " degré Celsius est égal à " + CelciusVersFarenheit(temperature) + " degrés Fahrenheit");
            case 5 -> System.out.println(temperature + " degré Kelvin est égal à " + KelvinVersFarenheit(temperature) + " degrés Fahrenheit");
            case 6 -> System.out.println(temperature + " degré Fahrenheit est égal à " + FarenheitVersKelvin(temperature) + " degrés Kelvin");
            default -> System.out.println("Choix invalide !");
        }

       

    }

 

public static double CelciusVersKelvin (double tCelcius) {

    return tCelcius+273;

}

public static double KelvinVersCelcius (double tKelvin) {

    return tKelvin-273;

}

public static double FarenheitVersCelcius (double tFarenheit) {

    return tFarenheit-32;

}

public static double CelciusVersFarenheit (double tCelcius) {

    return tCelcius+32;

}

public static double KelvinVersFarenheit (double tKelvin) {

    return tKelvin-459.67;

}

public static double FarenheitVersKelvin (double tFarenheit) {

    return tFarenheit+459.67;
    }
    
}
