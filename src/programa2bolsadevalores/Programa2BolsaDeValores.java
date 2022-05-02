
package programa2bolsadevalores;

import java.util.Scanner;

/**
 *
 * @author Fabino F Silva
 */
public class Programa2BolsaDeValores {

    
    public static void main(String[] args) {

        /*
        2. Faça um programa que receba o tipo de ação, ou seja, uma letra 
        qualquer a ser comercializada na bolsa de valores, o preço de compra
        e o preço de venda de cada ação e que calcule e mostre:
 a quantidade de ações com lucro superior a R$ 1.000,00;
 a quantidade de ações com lucro inferior a R$ 200,00.
        Finalize com o tipo de ação ‘F’.
        */
        
        /*
Obtenha um caractere a partir da entrada utilizando Scanner.next().charAt(0) em Java
Obter um char a partir da entrada utilizando System.in.read() em Java
Obter um gráfico a partir da entrada utilizando InputStreamReader() em Java
        */
         
        int acaolucromil = 0,acaolucromenor200 = 0;
        double valorCompraAcao, valorVendaAcao, valorLucroPrejuizo;
        char nomeacao;
        
        
        System.out.println("===> Bolsa de Valores <===");
        System.out.println("Baseado na Letra de sua AÇÃO, defina o valor \n"
                         + "de venda de Compra e Venda da mesma!\n");
        

         
         do{
         Scanner valorinicial = new Scanner(System.in);
           
             System.out.println("Digite sua a Letra da sua Ação: ");
             nomeacao = valorinicial.next().charAt(0);
           
             if(nomeacao != 'f'){
                 
             System.out.println("\nDigite o Valor de compra desta Ação: ");
             valorCompraAcao = valorinicial.nextDouble();
             
             System.out.println("\nDigite o valor de Venda da sua Ação: ");
             valorVendaAcao = valorinicial.nextDouble();
             
             System.out.println("Ação : "+ nomeacao+" valor de Compra: R$ "+valorCompraAcao+"  Valor"
             + "de Venda: R$ "+valorVendaAcao);
             valorLucroPrejuizo = valorVendaAcao - valorCompraAcao;
                if(valorLucroPrejuizo > 1000){
                     acaolucromil = acaolucromil + 1;
                    }else if(valorLucroPrejuizo < 200){
                    acaolucromenor200 = acaolucromenor200 + 1;
                 }             
             }
         }while(nomeacao!='f');
         
         System.out.println("Total de Ações\n Valor Lucro Acima de R$ 1 mil reais: "+acaolucromil+"\n"
                 + "Valor Lucro Abaixo de 200 reais : "+acaolucromenor200);
         
         
    }
    
}
