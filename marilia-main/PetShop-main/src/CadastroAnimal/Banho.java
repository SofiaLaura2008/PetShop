package CadastroAnimal;
import java.time.LocalDate;

// Classe 'Banho' que representa um tipo específico de serviço realizado para um animal
public class Banho extends Servico {

    public Banho(String nome, String telefone, String endereco, LocalDate dataServico) {
        // Chamando o construtor da classe mãe (Servico) com os parâmetros necessários
        super("Banho", dataServico, 0, dataServico, nome, telefone, endereco);
    }

    @Override
    public void realizarServico() {
        System.out.println("Banho realizado com sucesso!");
    }
}
