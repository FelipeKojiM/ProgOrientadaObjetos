/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author HP
 */
public class retornarNome {
         
        private final String nomeCachorro;
        
        public retornarNome (String nome){
            nomeCachorro = nome; 
        }
        
        public String getNome(){   
        return "Nome do cachorro "+ nomeCachorro;
        }
}
