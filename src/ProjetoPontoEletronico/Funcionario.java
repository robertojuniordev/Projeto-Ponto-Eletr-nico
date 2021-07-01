/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoPontoEletronico;

/**
 *
 * @author Pichau
 */
public class Funcionario {
    private String nome;
    private int cpf;
    private String funcao;
    private String nascimento;
    
    public Funcionario(String nome, int cpf, String funcao, String nascimento){
        this.nome = nome;
        this.cpf = cpf;
        this.funcao = funcao;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
    
}
