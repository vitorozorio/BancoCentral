package br.com.Bancocentral.colaboradores;

public class Funcionario {
    protected String nome;
    protected int idade;
    protected String cpf;


    public Funcionario(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;

    }

    //msm coisa de cima
    public Funcionario(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //protected somente a classe e os filhos delas vao ter acesso, se eu criar outra classe e herdar de funcionario
    //eles vao ver os atributos e tall pq tá protected, somente passa de mae e filhos

    //gerar get e set automatico
        //botao direito
        //generate
        //get e set
        //seleciona quantos atributos quer e gera.

    //dica aprenda a fazer na mao 1°
}
