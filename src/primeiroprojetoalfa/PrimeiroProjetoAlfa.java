/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiroprojetoalfa;

import java.util.Scanner;

/**
 *
 * @author ユーリ ガルボン
 */
public class PrimeiroProjetoAlfa {
   
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {  
       /* String minhaString;
        minhaString = "Eu sou Yuri, tenho ";
        int x;
        x = 24;
        System.out.println(minhaString + x + " anos.");
        System.out.println("Prazer em conhecê-los.");*/
        // TODO code application logic here
        /*int n1, n2, n3, n4, media;
        n1 = 8;
        n2 = 5;
        n3 = 9;
        n4 = 10;
                media = (n1+n2+n3+n4)/4;
                System.out.println("Média = "+ media);
        
                int n1, n2, resultado;
        n1 = 8;
        n2 = 2;
//Soma
        resultado = n1 + n2;
        System.out.println("Soma: " + resultado);
 //Subtração
        resultado = n1 - n2;
        System.out.println("Subtração: " + resultado);
 //Divisão
        resultado = n1 / n2;
        System.out.println("Divisão: " + resultado);
 //Multiplicação
        resultado = n1 * n2;
       Scanner ler = new Scanner (System.in);*/
        
        double vendas, salárioFinal;

        System.out.print ("Total de vendas mensal:  ");
        vendas = ler.nextDouble ();

        salárioFinal = (3000+((3000*0.02)*vendas));
 
        System.out.println ("salário no fim do mês é " + salárioFinal);
         
    }
}   