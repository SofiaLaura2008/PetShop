package CadastroAnimal;

import java.time.LocalDate;

public abstract class Cadastro {
    private int id;
    private LocalDate dataCadastro;
    private String nome;
    private String telefone;
    private String endereco;

    // Construtor da classe Cadastro
    public Cadastro(int id, LocalDate dataCadastro, String nome, String telefone, String endereco) {
        this.id = id;
        this.dataCadastro = dataCadastro != null ? dataCadastro : LocalDate.now();  // Se dataCadastro for nula, usa a data atual
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    // GETTERS E SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
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

    // Método abstrato para imprimir cadastro
    public abstract void imprimirCadastro();
}
