package br.com.padroesdeprojeto.contas;

public class ContaEspecial extends Conta {
    double limite;

    public ContaEspecial(String numeroConta, double saldoInicial, double limite) {
        super(numeroConta, saldoInicial);
        this.limite = limite;
    }

    boolean sacar(double quantidade) {
        if (this.saldo < quantidade) {
            return false;
        } else {
            this.saldo = this.saldo - (quantidade * 0.99);
            return true;
        }
    }
}