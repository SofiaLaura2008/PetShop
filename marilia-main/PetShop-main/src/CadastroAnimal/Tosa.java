package CadastroAnimal;
import java.time.LocalDate;
// Classe 'Tosa' que representa um tipo específico de serviço realizado para um animal
public class Tosa extends Servico {
    
    public Tosa(String nome, String telefone, String endereco, LocalDate dataServico) {
        // Chamando o construtor da classe mãe (Servico) com os parâmetros necessários
        super("Tosa", dataServico, 0, dataServico, nome, telefone, endereco);
    }

    @Override
    public void realizarServico() {
        System.out.println("Tosa realizada com sucesso!");
    }
}
