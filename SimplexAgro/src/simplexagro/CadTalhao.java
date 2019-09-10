/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplexagro;

import java.util.ArrayList;

/**
 *
 * @author daniel.bertucci
 */
public class CadTalhao {
    
     private ArrayList<Talhao> lista;
     
     public CadTalhao(){
         
         lista = new ArrayList<Talhao>();
     }
     
      //metodo adicion talhao
    public void adicionaTalhao(Talhao a) {

        lista.add(a);
        
        System.out.println("O talhão "+ a.getApelido()+" foi cadastrado com sucesso!");

    }
  
    public double CalculaTotalArea(){
            
            double total = 0;
            
            for (Talhao a: lista ){
                
                total += a.calculaArea();
                
                
            }                   
           
                return total;
        }
    
}
    

