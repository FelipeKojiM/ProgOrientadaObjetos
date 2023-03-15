/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

//class cachorro
public class Cachorro {
         public String raca; 
         public String cor;
         public int  idade; 
         public String sexo;
         public int peso; 
         public int tamanho;
        
        
         //retorna tipo de latido
         public void Latir(){
             if ( tamanho > 7)
                 System.out.println("wooof, wooof");
             else if( tamanho > 10)
                 System.out.println("Ruff! Ruff!");
             else 
                 System.out.println("Não late!");  
         
         }
}

       
