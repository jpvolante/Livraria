/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joaop
 */
public class Autor {
    String nome;
    String cpf;
    String email;
    
    public void imprimirDados(){
        System.out.println("Nome do autor: " + this.nome);
        System.out.println("CPF do autor: " + this.cpf);
        System.out.println("E-mail do autor: " + this.email);
    }
}
