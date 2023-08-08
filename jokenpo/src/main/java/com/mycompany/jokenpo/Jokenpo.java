/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jokenpo;

import java.util.Scanner;

/**
 *
 * @author aluno TDS
 */
public class Jokenpo {

    public static void main(String[] args) {
        
        Scanner entradaDados = new Scanner(System.in);
        
        int player1 ;
        int player2 ;
        
        System.out.println("Escolha 0,1,2 sendo que:");
        System.out.println("Pedra = 0");
        System.out.println("Tesoura = 1");
        System.out.println("Papel = 2");
         
        
            System.out.println("Player 1: ");
            player1 = entradaDados.nextInt();
            
            System.out.println("Player 2: ");
            player2 = entradaDados.nextInt();
            
            
            
            switch(player1) {
                
                case 0:
                    
                    switch(player2){
                                
                        case 0:
                            System.out.println("Tied game");
                            
                            break;
                            
                        case 1: System.out.println("Player 1 Win");
                        
                        break;
                            
                        case 2: System.out.println("Player 2 Win");
                        
                        break;
                    }
                    
                    break;
                   
                    
                case 1:
                    switch(player2){
                        
                        case 0:System.out.println("Player 2 win");
                        
                        break;
                        
                        case 1: System.out.println(" Tied Game");
                        
                        break;
                        
                        case 2: System.out.println("Player 1 win");
                        
                        break;
                            
                        
                    }
                    
                    break;
                    
                    
                case 2:
                    switch (player2){
                        
                        case 0: System.out.println("Player 1 wins");
                            
                        break;
                        
                        case 1: System.out.println("Player 2 wins");
                        
                        break;
                        
                        case 2: System.out.println("Tied game");
                        
                        break;
                       
                    }
                    
                    break;
                    
            }
        
        
        
        
    }
    
       
    
}
