/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joaop
 */
public class Livro {
    String nome;
    String descricao;
    private double valor;
    String isbn;
    Autor autor; //interação entre objetos
    double desconto;
    public void setValor(double v){
        this.valor = v;
    }
    
    public double getValor(){
        return this.valor;
    }
    
    public void imprimirDetalhes(){
        System.out.println("");
        System.out.println("Título: " + this.nome);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("ISBN: " + this.isbn);
        //System.out.println("Autor: " + this.autor);
        this.autor.imprimirDados();
        System.out.println("Valor: R$" + this.valor);
        System.out.println("Valor com desconto: R$" + this.desconto);
    }
    
    public void aplicaDesconto(double porcentagem){
        this.desconto = this.valor - (this.valor * porcentagem);
    }
}
