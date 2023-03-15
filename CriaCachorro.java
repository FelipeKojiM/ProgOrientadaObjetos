//carlos.schroder@prof.unipar.br

package com.mycompany.mavenproject2;

public class CriaCachorro {
    
    public static void main(String[] args) {
        
        
        Cachorro cachorro1 =  new Cachorro();
             cachorro1.raca = "pastor alemao";
             cachorro1.cor = "preto";
             cachorro1.idade =  40; 
             cachorro1.sexo = "macho";
             cachorro1.peso = 10;
             cachorro1.tamanho = 66;
         
             Cachorro cachorro2 =  new Cachorro();
             cachorro2.raca = "pinscher";
             cachorro2.cor =  "preto";
             cachorro2.idade = 10;
             cachorro2.sexo = "femea";
             cachorro2.peso = 7;
             cachorro2.tamanho = 2;
             
             
             Cachorro cachorro3 =  new Cachorro();
             cachorro3.raca = "akita inu";
             cachorro3.cor =  "marrom";
             cachorro3.idade = 4;
             cachorro3.sexo = "macho";
             cachorro3.peso = 42;
             cachorro3.tamanho = 75;
             
             
             Cachorro cachorro4 =  new Cachorro();
             cachorro4.raca = "spitz alemao";
             cachorro4.cor =  "cinza";
             cachorro4.idade = 1;
             cachorro4.sexo = "macho";
             cachorro4.peso =  10;
             cachorro4.tamanho = 25;
             
               
             Cachorro cachorro5 =  new Cachorro();
             cachorro5.raca = "shih tzu";
             cachorro5.cor =  "branco";
             cachorro5.idade = 7;
             cachorro5.sexo = "femea";
             cachorro5.peso = 12;
             cachorro5.tamanho = 7;
    
             cachorro1.Latir();
                    
             
             retornarNome dog = new retornarNome("Pluto");
             System.out.println(dog.getNome());
    }
   
    
}
