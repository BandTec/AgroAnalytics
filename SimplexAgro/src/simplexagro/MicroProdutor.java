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
public class MicroProdutor extends Cliente {
    
    private String Cooperativa;
    

    public MicroProdutor(String Cooperativa, String nome, String cpf, String rg, String endereco, String bairro, String cidade, String estado, String telefone, String celular, String email) {
        super(nome, cpf, rg, endereco, bairro, cidade, estado, telefone, celular, email);
        this.Cooperativa = Cooperativa;
    
    }

    public String getCooperativa() {
        return Cooperativa;
    }

    public void setCooperativa(String Cooperativa) {
        this.Cooperativa = Cooperativa;
    }


    @Override
    public String toString() {
        return "MicroProdutor{"+super.toString() + "Cooperativa=" + Cooperativa + '}';
    }

    
    
    
    
    
}
