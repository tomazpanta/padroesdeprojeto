package br.com.padroesdeprojeto.contas;
import java.net.StandardSocketOptions;
public class Conta {
    int numero;
    double saldo;

    boolean sacar(double quantidade) {
        if (this.saldo < quantidade){
            return false;
        } else{
            double saldo = this.saldo - quantidade;
            this.saldo = saldo;
            return true;
        }
    }

    boolean depositar(double quantidade) {
        if(quantidade == 0 || quantidade < 0) {
            return false;
        } else {
            this.saldo = this.saldo + quantidade;
            return true;
        }
    }

    public Conta() {
        System.out.println("Conta Vazia criada com sucesso!");

    }

    public Conta(int numero, String nome, double saldo, double limite) {
        System.out.println("Objeto Preenchido Criado!");
        this.numero = numero;
        this.saldo = saldo;

    }
}
