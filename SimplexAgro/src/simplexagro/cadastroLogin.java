/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplexagro;

/**
 *
 * @author daniel.bertucci
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author daniel.bertucci
 */
public class cadastroLogin {

    //atributo
    private ArrayList<Cliente> lista;
    

    //construtor e dentro dele já está estanciado o objeto ArrayList
    public cadastroLogin() {

        lista = new ArrayList<Cliente>();
                
    }

    //metodo adiciona cliente
    public void adicionaCliente(Cliente a) {

        lista.add(a);
        
        System.out.println("Cliente "+ a.getNome()+" cadastrado com sucesso!");

    }

   

// metódo de login do cliente
public void login(String email,String cPf){
            
            for (Cliente a: lista ){
                
                if(a.getEmail().equals(email) && a.getCpf().equals(cPf)){
                    
                    System.out.println("Seja bem vindo " + a.getNome()+"!");
                
                
            }
                else{
                    System.out.println("não foi encontrado seu cadastro");
                }
            }
            
}
            
                
              
        }

    
    


