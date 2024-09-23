/*
 * Sousa lucas, TD1, 23 septembre 2024
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author souse
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("add");
        System.out.println("substract");
        System.out.println("multiply");
        System.out.println("divide");
        System.out.println("modulo");
        Scanner sc = new Scanner (System.in);
        int operateur = sc.nextInt();
        if (operateur<1|| operateur>5){
            System.out.println("choisissez une valeur entre 1 et 5");
        }
        int operande1;
        System.out.println("\n saisir une premiere valeur");
        operande1=sc.nextInt();
        int operande2;
        System.out.println("\n saisir une deuxieme valeur");
        operande2=sc.nextInt();
        if (operateur==1){
            System.out.println(operande1+operande2);
        }
        if (operateur==2){
            System.out.println(operande1-operande2);
        }
        if (operateur==3){
            System.out.println(operande1*operande2);
        }
        if (operateur==4){
            System.out.println(operande1/operande2);
        }
        if (operateur==5){
            System.out.println(operande1%operande2);
        }
        System.exit(0);
          
            }
               
        
    }
        // TODO code application logic here
    
    

