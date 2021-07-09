/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoPontoEletronico;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Pichau
 */
public class Funcionario {
    private String nome;
    private String cpf;
    private String funcao;
    private String nascimento;
    private String dataHora;


    
    public Funcionario(String nome, String cpf, String funcao, String nascimento){
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

    public String getCpf() {
        return verificarCpf(cpf);
    }

    public void setCpf(String cpf) {
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
    
    public String getDataHora() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return dtf.format(LocalDateTime.now());
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }
    
    public String verificarCpf(String cpf){
        String s[] = new String[9], confere = "";
        int n[] = new int[9], verificador1 = 0, verificador2, con = 0;
        
        for(int i = 0; i<9; i++){
            s[i] = cpf.substring(i, i+1); n[i] = Integer.parseInt(s[i]);
        }
        for(int i = 10; i>=2; i--){
            verificador1 += (n[con] * i);
            con++;
        }
        con = 0;
        if((verificador1 % 11) < 2){
            verificador1 = 0;
        }else{
            verificador1 = 11 - (verificador1 % 11);
        }
        verificador2 = verificador1 * 2;
        for(int i = 11; i>=3; i--){
            verificador2 += (n[con] * i);
            con++;
        }
        if((verificador2 % 11) < 2){
            verificador2 = 0;
        }else{
            verificador2 = 11 - (verificador2 % 11);
        }
       confere = (s[0]+ s[1] + s[2] + s[3] + s[4] + s[5] + s[6] + s[7] + s[8] + verificador1 + "" + verificador2);
        if(!confere.equals(cpf)){
            JOptionPane.showMessageDialog(null, "CPF INVALIDO e CORRIGIDO: " + confere);
        }
        return confere;
    }
    
}
