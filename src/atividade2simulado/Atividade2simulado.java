/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2simulado;

import java.util.Scanner;

/**
 *
 * @author s.lucas
 */
public class Atividade2simulado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int termo, cont=1, acu=-1;
        
            System.out.println("Insira o termo da ordem que deseja descobrir.");
            termo = ler.nextInt();
                    if(termo<0){
                        System.out.println("O número digitado tem que ser maior que zero");
                    }
            while(cont!=termo && termo>0){
                   if(acu<0 && cont!=termo){
                       acu+=2;
                    cont+=1;
                       
                   }
                if(cont%2==0 && cont!=termo){
                    acu+=5;
                    cont+=1;
                    
                }
                if(cont%2!=0 && cont!=termo){
                    acu+=1;//2
                cont+=1;//cont=1, 2
               
                 
                
                }else{
                    System.out.println("O termo referente ao número que você digitou é "+acu);
                    termo = 1;
                    cont = 1;
                }
                
                
            }         
    }
}



