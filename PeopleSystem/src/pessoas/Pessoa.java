package pessoas;

import composicao.Endereco;
import composicao.Telefone;

import java.time.LocalDate;
import java.util.Scanner;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private Endereco endereco;
    private Telefone telsContato;
    private Scanner leitor = new Scanner(System.in);

    public void cadastrar(){
        System.out.println("Informe o nome: ");
        this.nome = leitor.nextLine();
        System.out.println("Informe a data de nascimento : ");
        this.dataNascimento = leitor.nextLine();
        this.endereco = new Endereco();
        this.endereco.cadastrar();

    }

    public String obterIdade(){
        return "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelsContato() {
        return telsContato;
    }

    public void setTelsContato(Telefone telsContato) {
        this.telsContato = telsContato;
    }
}
