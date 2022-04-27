/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joaop
 */
public class CadastroDeLivros {
    public static void main(String[] args){
        
    	System.out.println("Inicio do programa");
    	
    	Autor oswaldo = new Autor("Oswaldo Truzzi", "156.456.893-08","truzzi@ufscar.br");
        
    	Autor joao = new Autor();
    	joao.setNome("Joao");
    	joao.setCpf("0000000000");
    	joao.setEmail("email@email.com");
    	
        Livro meuLivro = new Livro();
        meuLivro.nome = "Italianidade";
        meuLivro.descricao = "italianos e sua formação identitária";
        meuLivro.isbn = "123THO90";
        //meuLivro.autor = "Luiz Hnerique Nunes";
      //vai referenciar o objeto "oswaldo"
        meuLivro.autor = oswaldo; 
        //meuLivro.valor = 67.89;
        meuLivro.setValor(67.89);
        
        
        //meuLivro.imprimirDetalhes();
        
        Livro meu2Livro = new Livro();
        meu2Livro.nome = "Café e Indústria";
        meu2Livro.descricao = "Histórico de formação social de São Carlos";
        meu2Livro.isbn = "123THO90";
        //meu2Livro.autor = "Oswaldo Truzzi";
        meuLivro.autor = oswaldo;
        meu2Livro.setValor(45.89);
        meu2Livro.aplicaDesconto(0.25);
        //meu2Livro.imprimirDetalhes();
        meuLivro.imprimirDetalhes();
        meu2Livro.imprimirDetalhes();
    }
}
