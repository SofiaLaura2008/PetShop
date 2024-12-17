package CadastroAnimal;

import java.time.LocalDate;

public class Servico {
    private String tipo;
    private LocalDate dataCadastro;
    private int id;
    private LocalDate dataServico;
    private String nome;
    private String telefone;
    private String endereco;

    // Construtor da classe Servico
    public Servico(String tipo, LocalDate dataCadastro, int id, LocalDate dataServico, 
                   String nome, String telefone, String endereco) {
        this.tipo = tipo;
        this.dataCadastro = dataCadastro;
        this.id = id;
        this.dataServico = dataServico;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    // Método realizarServico corretamente definido para ser sobrescrito
    public void realizarServico() {
        System.out.println("Serviço realizado!");
    }

    // Getters e setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataServico() {
        return dataServico;
    }

    public void setDataServico(LocalDate dataServico) {
        this.dataServico = dataServico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Método para imprimir os dados do serviço
    public void imprimirCadastro() {
        System.out.println("Tipo de serviço: " + tipo);
        System.out.println("Data de cadastro: " + dataCadastro);
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereço: " + endereco);
        System.out.println("Data do serviço: " + dataServico);
    }
}
