package CadastroAnimal;

import java.util.ArrayList;
import java.util.List;

/**
 * A classe 'Cliente' representa um cliente do pet shop, com seus dados de contato e lista de animais associados.
 * 
 * Relações:
 * - **Associação**: A relação entre 'Cliente' e 'Animal' é uma **agregação**. Isso ocorre porque o cliente pode ter vários animais, mas um animal pode existir independentemente de um cliente.
 */
public class Cliente extends Cadastro {
    private List<Animal> animais; // Lista de animais associados ao cliente

    public Cliente(String nome, String telefone, String endereco, List<Animal> animais) {
        super(0, null, nome, telefone, endereco); // Id e dataCadastro podem ser gerados automaticamente
        this.animais = animais != null ? animais : new ArrayList<>();
    }

    // GETTERS E SETTERS
    public List<Animal> getAnimais() {
        return this.animais;
    }

    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
    }

    public void adicionarAnimal(Animal animal) {
        this.animais.add(animal);
    }

    @Override
    public void imprimirCadastro() {
        // Imprime as informações básicas do cliente
        System.out.println("Cliente:");
        System.out.println("Nome: " + getNome());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Endereço: " + getEndereco());

        // Imprime os animais associados
        System.out.println("Animais do cliente:");
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
        } else {
            for (Animal animal : animais) {
                System.out.println("- " + animal.getNome() + " (" + animal.getTipo() + ")");
                animal.imprimirCadastro(); // Chama o método de impressão do animal
            }
        }
    }
}
