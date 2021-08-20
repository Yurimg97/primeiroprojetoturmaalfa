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
  
        double Salami, L, VL, conta, Vdesc;
	Scanner ler = new Scanner (System.in);
            System.out.print("Insira o salário mínimo: ");
 	Salami = ler.nextDouble();
            System.out.print("Insira consumo mensal em (L): ");
 	L = ler.nextDouble();
        VL =((L/1000)*0.02);
        conta = (Salami*VL);
            System.out.println("Valor da conta de água: "+conta+" R$");
        Vdesc = (conta-(conta*0.15));
            System.out.println("Valor c/ desconto de 15%: "+Vdesc+" R$");
    }
}   