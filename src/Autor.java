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
	
    private String nome;
    private String cpf;
    private String email;
    
    public Autor() {}

	public Autor(String nome, String cpf, String email) {
    	System.out.println("Chamando construtor");
    	this.email = email;
		this.cpf = cpf;
		this.nome = nome;
    }
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
    public void imprimirDados(){
        System.out.println("Nome do autor: " + this.nome);
        System.out.println("CPF do autor: " + this.cpf);
        System.out.println("E-mail do autor: " + this.email);
    }
}
