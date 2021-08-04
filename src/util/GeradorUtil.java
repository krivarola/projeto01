/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author karen.rivarola
 */
public class GeradorUtil {

    /**
     *
     * @Retorna um valor String conforme a quantidade de número solicitado
     *
     * @param qtde
     *
     *
     */
    public String gerarNumero(int qtde) {
        String senha = "";
        int numero;
        for (int i = 0; i < qtde; i++) {
            numero = (int) (Math.random() * 10);
            senha = senha + numero;
        }
        return senha;

    }

    public String gerarCpf() {
        return gerarNumero(3) + "." + gerarNumero(3) + "." + gerarNumero(3) + "-"
                + gerarNumero(2);

    }

    public double gerarSalario() {
        int numero = (int) (Math.random() * 100000);
        return numero;
    }

    /**
     *
     * @return 
     */
        public String gerarCnpj() {
        return gerarNumero(2) + "." + gerarNumero(3) + "." + gerarNumero(3) 
                + "/0001-" + gerarNumero(2);

    }
    public String gerarCelular() {
        return "(48) 9" + gerarNumero (4) + "-" + gerarNumero (4);
    }    
        
    public String gerarTelefone() {
        return "(48)" + gerarNumero (4) + "-" + gerarNumero(4);
    }
                  
    public String gerarCep() {
        return gerarNumero(5) + "-" + gerarNumero(3);
    }
    
    public String gerarNome() {
        String[] nomes = {"Silvio", "João", "Maria", "Pedro", "Lucas", "Bruno", 
            "Karen", "Charlott", "Bianca", "Brayan", "Sueli", "Luciana", "Kamila",
            "Mariele", "Wilian", "Fatima", "Maximus", "Mateus", "Morgana", 
            "Karina", "Katherine", "Mayra", "Estela"};
        int tamanhoLista = nomes.length;
        int indice = (int) (Math.random() * tamanhoLista);
                 
        return nomes [indice] + " " + gerarSobrenome();
    }
    
    private String gerarSobrenome() {
       String[] sobrenomes = {"Silva", "Gomes", "Oliveira", "Cabrera", "Rivarola", 
        "Waltrick", "Souza", "Montania", "Santos", "Riera", "Pereira", "Marques", 
        "Carvalho", "Domingues", "Kegler", "Arruda", "Gamboa", "Ramirez", "Larrea", 
        "Borel", "Pires", "Abravanel", "Almneida"};
        int tamanhoLista = sobrenomes.length;
        int indice = (int) (Math.random() * tamanhoLista);
                 
        return sobrenomes [indice];
        
    }
      
    public static void main(String[] args) {
        GeradorUtil util = new GeradorUtil();
        String cpf = util.gerarCpf();
        System.out.println("CPF: " + cpf);

        String nome = util.gerarNome();
        System.out.println("Nome: " + nome);
    }
}
