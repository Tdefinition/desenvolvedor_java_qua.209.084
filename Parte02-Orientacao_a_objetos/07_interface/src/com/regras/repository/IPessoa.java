package com.regras.repository;

public interface IPessoa {

    public String apresentar();
    public void exibirDados();
    public String cumprimentar(String nome);
    // isso fará que:
    //uma classe pessoa pode ter vários métodos mas ele só vai funcionar 
    //se tiver o método definido na interface
    // do jeito q estiver definido na interface
    //ou seja tem que ter um método exibirtDados na classe 
    //e ele deve ser void e não receber argumentos

}
//diferente da classe a interface só tem métodos 
//enquanto a classe tem atributos e métodos 
//em uma classe mnormal nós programamos o método
//na interface só definimos o nome e o retorno 
//o argumento será definido na classe 