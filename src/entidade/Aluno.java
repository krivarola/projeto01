/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author karen.rivarola
 */
public class Aluno {
    private String nome; 
    private String sobrenome; 
    private String idade;
    private String telefone;
    private Float salario;
    private String logradouro;
    private String numero;
    private String bairro;
    private boolean trabalho;
    private long cpf = 99999999999L;
    
    public void carregarNome(String nome){
        this.nome = nome;
      
    }
    public String getNome(){
        return nome;
    }
    public void carregarSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }    
    public String getSobrenome(){
        return sobrenome;
         }
    public void carregarIdade(String idade){
        this.idade = idade;
    }    
    public String getIdade(){
        return idade;
    
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public boolean isTrabalho() {
        return trabalho;
    }

    public void setTrabalho(boolean trabalho) {
        this.trabalho = trabalho;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

}