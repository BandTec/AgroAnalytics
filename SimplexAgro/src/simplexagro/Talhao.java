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
public class Talhao {
    
    private int     codTalhao;
    private String Apelido;
    private double  comprimento;
    private double  largura;

    public Talhao(int codTalhao, String Apelido, double comprimento, double largura) {
        this.codTalhao = codTalhao;
        this.Apelido = Apelido;
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public int getCodTalhao() {
        return codTalhao;
    }

    public void setCodTalhao(int codTalhao) {
        this.codTalhao = codTalhao;
    }

    public String getApelido() {
        return Apelido;
    }

    public void setApelido(String Apelido) {
        this.Apelido = Apelido;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double calculaArea(){
        
        return comprimento*largura;
    }
    
    @Override
    public String toString() {
        return "Talhao{" + "codTalhao=" + codTalhao + ", Apelido=" + Apelido + ", comprimento=" + comprimento + ", largura=" + largura +", area="+calculaArea()+ '}';
    }
    
    
    
}
