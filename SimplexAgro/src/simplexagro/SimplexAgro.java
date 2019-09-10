/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplexagro;

import java.util.Scanner;

/**
 *
 * @author daniel.bertucci
 */
public class SimplexAgro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
         
        
        
        
         String nome;
         String cpf,  rg,  endereco,bairro,cidade,estado, telefone,celular, email, cooperativa;
      
         System.out.println("Digite seu nome: ");
         Scanner nom = new Scanner(System.in);
         nome = nom.nextLine();
         
        System.out.println("Digite seu CPF: ");
        Scanner Cpf = new Scanner(System.in);
        cpf = Cpf.nextLine();
                
        System.out.println("Digite o seu RG: ");
        Scanner erg = new Scanner(System.in);
        rg = erg.nextLine();
        
        System.out.println("Digite seu endereço: ");
        Scanner end = new Scanner(System.in);
        endereco = end.nextLine();
        
        System.out.println("Digite seu bairro: ");
        Scanner bair = new Scanner(System.in);
        bairro = bair.nextLine();
        
        System.out.println("Digite sua cidade: ");
        Scanner cid = new Scanner(System.in);
        cidade = cid.nextLine();
        
        System.out.println("Digite seu estado: ");
        Scanner est = new Scanner(System.in);
        estado = est.nextLine();
        
        System.out.println("Digite seu Telefone: ");
        Scanner tel = new Scanner(System.in);
        telefone = tel.nextLine();
        
        System.out.println("Digite o seu celular: ");
        Scanner cel = new Scanner(System.in);
        celular = cel.nextLine();
        
        System.out.println("digite o seu e-mail:");
        Scanner emai = new Scanner(System.in);
        email = emai.nextLine();
        
        System.out.println("informe sua cooperativa: ");
        Scanner coop = new Scanner(System.in);
        cooperativa = coop.nextLine();
        
        
        MicroProdutor microProdutor = new MicroProdutor(nome,cpf,  rg,  endereco,bairro,cidade,estado, telefone,celular, email, cooperativa);
        cadastroLogin cadlog = new cadastroLogin();
        
        cadlog.adicionaCliente(microProdutor);
        
        
        cadlog.login(email, cpf);
        
        int codTalhao;
        String ApelidoTalhao;
        double comprimento;
        double largura;
        
        System.out.println("Digite o id do talhão: ");
        Scanner id = new Scanner(System.in);
        codTalhao = id.nextInt();
        
        System.out.println("Digite o apelido do talhão: ");
        Scanner ape = new Scanner(System.in);
        ApelidoTalhao = ape.nextLine();
        
        System.out.println("Digite o comprimento do Talhão: ");
        Scanner compr = new Scanner(System.in);
        comprimento = compr.nextDouble();
        
        System.out.println("Digite a Largura do Talhão: ");
        Scanner larg = new Scanner(System.in);
        largura = larg.nextDouble();
        
        Talhao talho = new Talhao(codTalhao,ApelidoTalhao,comprimento,largura);
        CadTalhao catalho = new CadTalhao();
        
        catalho.adicionaTalhao(talho);
        
        System.out.println(catalho.CalculaTotalArea()); 
        
        
    }
    
}
