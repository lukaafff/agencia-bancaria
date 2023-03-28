package Programa;

import Programa.utilitarios.Utils;

public class Conta {
    private static int contadorDeContas = 1;
    
    private int numeroConta;
    private Pessoa pessoa;
    private Double saldo = 0.0;

    //construtor
    public Conta(Pessoa pessoa) {
        this.numeroConta = contadorDeContas;
        this.pessoa = pessoa;
        contadorDeContas += 1;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    public String toString() {
        return "\nNúmero da conta: " + this.getNumeroConta() +
                "\nNome: " + this.pessoa.getNome() +
                "\nCPF: " + this.pessoa.getCPF()+
                "\nE-mail: " + this.pessoa.getEmail() +
                "\nSaldo: " + Utils.doubleToString(this.getSaldo()) +
                "\n";
    }
    
    //depositar
    public void depositar(Double valor) {
        if(valor > 0) {
            setSaldo(getSaldo() + valor);
            System.out.println("Seu depósito foi realizado com sucesso!");
        } else {
            System.out.println("Não foi possível realizar o depósito!");
        }
    }
    
    //sacar
    public void sacar(Double valor) {
        if(valor > 0 && this.getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("Seu saque foi realizado com sucesso!");
        } else {
            System.out.println("Não foi possível realizar o saque!");
        }
    }    
    
    //transferir
    public void transferir(Conta contaParaDeposito, Double valor) {
        if(valor > 0 && this.getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            
            contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valor;
            System.out.println("Sua transferência foi realizada com sucesso!");
        } else {
            System.out.println("Não foi possível realizar a transferência!");
        }
    }
}
