package Programa;

public class Pessoa {
    //contador (id)
    private static int counter = 1;
    
    private String nome;
    private String cpf;
    private String email;

    //constrtutor
    public Pessoa(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        
        //somar contador para cada cadastro
        counter += 1;
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void CPF(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //apresentar dados
    public String toString() {
        return "\nNome: " + this.getNome() +
                "\nCPF: " + this.getCPF() +
                "\nE-mail: " + this.getEmail();
    }
    
}
