package br.com.padroesdeprojeto.contas;

public class App {
    public static void main(String[] args) {
        //Criação do Objeto
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        ContaEspecial contaE1 = new ContaEspecial("Tomaz", 100, 1000);
        ContaInvestimento contaI1 = new ContaInvestimento();

        //Utilização dos estados
        conta1.saldo = 5000;
        conta1.numero = 01;

        //Utilização do comportamento
        conta1.sacar(650);
        conta2.sacar(100);

    }
}