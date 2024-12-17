import CadastroAnimal.Animal;
import CadastroAnimal.Servico;
import CadastroAnimal.Cliente;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

// Classe principal responsável por cadastrar clientes, animais e associar serviços
public class PetShopCadastro {
    public static void main(String[] args) {
        // Configura o locale para usar o formato padrão dos EUA
        Locale.setDefault(new Locale("en", "US"));
        Scanner scanner = new Scanner(System.in);

        // Cadastro de clientes
        ArrayList<Cliente> clientes = new ArrayList<>();
        System.out.print("Digite o número de clientes a cadastrar: ");
        int numeroClientes = scanner.nextInt();
        scanner.nextLine(); // Consumir a linha extra após nextInt()

        for (int i = 0; i < numeroClientes; i++) {
            System.out.println("\nCadastro do Cliente " + (i + 1));

            // Coleta de dados do cliente
            System.out.print("Digite o nome do cliente: ");
            String nomeCliente = scanner.nextLine();

            System.out.print("Digite o telefone do cliente: ");
            String telefoneCliente = scanner.nextLine();

            System.out.print("Digite o endereço do cliente: ");
            String enderecoCliente = scanner.nextLine();

            // Criação do objeto Cliente
            // Associação Cliente -> Animal: Agregação
            // Um cliente pode possuir vários animais, mas os animais não dependem exclusivamente do cliente para existir no sistema.
            Cliente cliente = new Cliente(nomeCliente, telefoneCliente, enderecoCliente, new ArrayList<Animal>());

            // Cadastro de animais para o cliente
            System.out.print("Quantos animais o cliente possui? ");
            int numeroAnimais = scanner.nextInt();
            scanner.nextLine(); // Consumir a linha extra após nextInt()

            for (int j = 0; j < numeroAnimais; j++) {
                System.out.println("\nCadastro do Animal " + (j + 1) + " para o cliente " + nomeCliente);

                // Coleta de dados do animal
                System.out.print("Digite o nome do animal: ");
                String nomeAnimal = scanner.nextLine();

                System.out.print("Digite o telefone do responsável: ");
                String telefoneResponsavel = scanner.nextLine();

                System.out.print("Digite o endereço do responsável: ");
                String enderecoResponsavel = scanner.nextLine();

                System.out.print("Digite o tipo do animal: ");
                String tipoAnimal = scanner.nextLine();

                System.out.print("Digite a raça do animal: ");
                String racaAnimal = scanner.nextLine();

                // Coleta de dados adicionais
                System.out.print("Digite a altura do animal: ");
                double altura = scanner.nextDouble();
                scanner.nextLine();  // Consumir a linha extra após nextDouble()

                System.out.print("Digite o peso do animal: ");
                double peso = scanner.nextDouble();
                scanner.nextLine();  // Consumir a linha extra após nextDouble()

                System.out.print("Digite a idade do animal: ");
                int idadeAnimal = scanner.nextInt();
                scanner.nextLine();  // Consumir a linha extra após nextInt()

                // A data de cadastro do animal é a data atual
                LocalDate dataCadastro = LocalDate.now();

                // Criação do objeto Animal
                // Associação Animal -> Servico: Composição
                // O ciclo de vida de um serviço está diretamente ligado ao animal. Um serviço como "banho" ou "tosa" só faz sentido no contexto de um animal específico. Se o animal for removido, os serviços associados também serão.
                Animal animal = new Animal(j + 1, dataCadastro, nomeAnimal, telefoneResponsavel, enderecoResponsavel, tipoAnimal, racaAnimal, altura, peso, idadeAnimal, new ArrayList<Servico>());

                // Associar serviços ao animal
                for (int k = 0; k < 2; k++) {
                    System.out.println("\nEscolha o tipo de serviço para o animal " + nomeAnimal + ": ");
                    System.out.println("1 - Banho");
                    System.out.println("2 - Tosa");
                    int escolhaServico = scanner.nextInt();
                    scanner.nextLine(); // Consumir a linha extra do buffer

                    String tipoServico;
                    switch (escolhaServico) {
                        case 1:
                            tipoServico = "Banho";
                            break;
                        case 2:
                            tipoServico = "Tosa";
                            break;
                        default:
                            System.out.println("Opção de serviço inválida!");
                            continue;
                    }

                    // Criação de um objeto Servico
                    Servico servico = new Servico(tipoServico, LocalDate.now(), 1, dataCadastro, nomeAnimal, telefoneResponsavel, enderecoResponsavel);

                    // Configurações do serviço
                    servico.setNome("Serviço para " + animal.getNome());
                    servico.setTelefone(animal.getTelefone());

                    // Associar o serviço ao animal
                    animal.adicionarServico(servico);
                }

                // Associar o animal ao cliente
                cliente.adicionarAnimal(animal);
            }

            // Adicionar o cliente à lista de clientes
            clientes.add(cliente);
        }

        // Imprimir os cadastros de todos os clientes, animais e seus serviços
        for (Cliente cliente : clientes) {
            System.out.println("\nCadastro do Cliente:");
            cliente.imprimirCadastro(); // Método que imprime as informações do cliente, incluindo os animais e serviços associados
        }

        // Fecha o scanner após a execução do programa
        scanner.close();
    }
}
