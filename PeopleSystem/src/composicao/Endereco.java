package composicao;

import java.util.Scanner;

public class Endereco {
    private String rua;
    private String numero;
    private String cep;
    private String cidade;
    private String estado;
    private String pais;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }


   Scanner sc = new Scanner(System.in);
    public void cadastrar() {
        System.out.println("Digite o Rua: ");
        this.rua = sc.nextLine();
        System.out.println("Informe o numero: ");
        this.numero = sc.nextLine();
        System.out.println("Informe o cep: ");
        this.cep = sc.nextLine();
        System.out.println("Informe o cidade: ");
        this.cidade = sc.nextLine();
        System.out.println("Informe o estado: ");
        this.estado = sc.nextLine();
        System.out.println("Informe o país: ");
        this.pais = sc.nextLine();



    }
}
