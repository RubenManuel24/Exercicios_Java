/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Scanner;

/**
 *
 * @author FATIMA30
 */
public class EXERCÍCIO_DE_AGENDA {
    public static void main(String[]args){
    Scanner escreva =new Scanner(System.in);
    String[][] compromisso = new String[31][24];
    
     
    boolean sair = false;
    byte op;
    while(!sair){
    
        System.out.println("DIGITE 1 PARA ADICIONAR COMPROMISSO.");
        System.out.println("DIGITE 2 PARA VERIFICAR COMPROMISSO.");
        System.out.println("DIGITE 0 PARA SAIR.");
        
        op = escreva.nextByte();
        
        if(op==1){//add compomisso
           int dia=0;
           boolean diaValido=false;
           while(!diaValido){
               
               System.out.println("ENTRE COM O DIA DO MÊS");
               dia = escreva.nextInt();
               if(dia > 0 && dia<=31){
               
                   diaValido=true;
               }
               
               else{
               
               System.out.println("DIA INVÁLIDO DIGITE NOVAMENTE");
               dia = escreva.nextInt();
               
               }
           }
           
           int hora=0; 
           boolean horaValido=false;
           while(!horaValido){
               
               System.out.println("ENTRE COM A HORA DO DIA");
               hora = escreva.nextInt();
               if(hora >= 0 && hora<=24){
               
                   horaValido=true;
               }
               
               else{
               
               System.out.println("HORA INVÁLIDA DIGITE NOVAMENTE");
               hora = escreva.nextInt();
               
               }
           }
           
           dia--;
            System.out.println("ESCREVE O COMPROMISSO");
            compromisso[dia][hora]= escreva.next();
        
        }
        
        else if(op == 2){//verificar compromisso
                
            int dia=0;
           boolean diaValido=false;
           while(!diaValido){
               
               System.out.println("ENTRE COM O DIA DO MÊS");
               dia = escreva.nextInt();
               if(dia > 0 && dia<=31){
               
                   diaValido=true;
               }
               
               else{
               
               System.out.println("DIA INVÁLIDO DIGITE NOVAMENTE");
               dia = escreva.nextInt();
               
               }
           }
           
           int hora=0; 
           boolean horaValido=false;
           while(!horaValido){
               
               System.out.println("ENTRE COM A HORA DO DIA");
               hora = escreva.nextInt();
               if(hora >= 0 && hora<=24){
               
                   horaValido=true;
               }
               
               else{
               
               System.out.println("HORA INVÁLIDA DIGITE NOVAMENTE");
               hora = escreva.nextInt();
               
               }
           }
             dia--;
            System.out.println("O COMPROMISSO É:");
            System.out.println(compromisso[dia][hora]);
        }
        
            
      
        
            else  if(op==0){
        
           sair=true;
           
        }
        
        else{
        
            System.out.println("OPÇÃO INVÁLIDA");
            
        }
        
          }
        
    }
 }
















 