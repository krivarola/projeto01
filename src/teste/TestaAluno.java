/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import aula_01.Aluno;
import javax.swing.JOptionPane;

/**
 *
 * @author karen.rivarola
 */
public class TestaAluno {
 
    public static void main(String[] args) {
       Aluno aluno = new Aluno();
       String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
       aluno.carregarNome(nome);
       
       System.out.println("Nome: " + aluno.getNome());
       
       String sobrenome = JOptionPane.
                                showInputDialog("Digite o sobrenome do aluno");
       aluno.carregarSobrenome(sobrenome);
       System.out.println("Sobrenome: " + aluno.getSobrenome());
       
       String idade = JOptionPane.
                                showInputDialog("Digite a idade do aluno");
       aluno.carregarIdade(idade);
       System.out.println("Idade: " + aluno.getIdade());
       
       String telefone = JOptionPane.
                                showInputDialog("Digite o telefone do aluno");
       aluno.carregarTelefone(telefone);
       System.out.println("Telefone: " + aluno.getTelefone());
       
       
       
       
       
     //  aluno.nome = JOptionPane.showInputDialog("Digite o nome do aluno");
    //   aluno.sobrenome = JOptionPane.showInputDialog("Digite o sobrenome do aluno");
   //    aluno.idade = JOptionPane.showInputDialog("Digite a idade do aluno"); 
        
   //  String salario = JOptionPane.showInputDialog("Digite o salário");
   //  aluno.salario = Float.parseFloat(salario);
     
     aluno.salario = Float.parseFloat(JOptionPane.
                                           showInputDialog("Digite o salário"));
           
     aluno.cpf = Long.parseLong(JOptionPane.
                                            showInputDialog("Digite o cpf"));
        
       JOptionPane.showMessageDialog(null, "Nome: " + aluno.nome 
               + " " + aluno.sobrenome + "\nIdade: " + aluno.idade 
               + "\nSalario: " + aluno.salario);

    }   
    
    }
