import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    static Box box1 = new Box(1,"troca de pneu", 10,"sul");
    Box box2 = new Box(2,"troca de motor", 2,"sul");
    Box box3 = new Box(3,"consertar caixa de marcha", 5,"sul");

    Mecanico mecanico1 = new Mecanico("joão","2131414234","troca de pneu","23424234234",box1);
    Mecanico mecanico2 = new Mecanico("pedro","928392832","motor","213112314234",box2);
    Mecanico mecanico3 = new Mecanico("samuel","654757448","caixa de marcha","85857847734",box3);
    public static void main(String[] args) {
        int opcao = 0;
        while (opcao != 5) {
            System.out.println("\n===== LOJA DE SUPRIMENTOS =====");
            System.out.println("1 - Cadastrar Ordem Serviço");
            System.out.println("2 - Associar um mecânico a um box");
            System.out.println("3 - Atribuir ordem de serviço a um box");
            System.out.println("4 - Ordens atribuídas a um box específico");
            System.out.println("5 - Quantidade total de ordens finalizadas por cada box");
            System.out.println("6 - Buscar ordens por status.");
            System.out.println("7 - Detalhes completos de uma ordem específica");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            if (opcao == 1) {

                System.out.println("Codigo: ");
                String codigo = sc.next();

                System.out.println("cliente: ");
                String cliente = sc.next();

                System.out.println("modelo do veiculo: ");
                String modeloveiculo = sc.next();

                System.out.println("placa do veiculo: ");
                String placaveiculo = sc.next();

                System.out.println("data: ");
                String data = sc.next();

                System.out.println("status: ");
                String status = sc.next();

                System.out.println("valor: ");
                double valor = sc.nextDouble();



                System.out.println("Categoria Serviço: ");
                String servico = sc.next();


                OrdemServico ordemServico1 = new OrdemServico(codigo, cliente, modeloveiculo, placaveiculo, data, status, valor, servico);





            } else if (opcao == 2) {
                System.out.println("Mecanico: ");
                String mecanico = sc.next();
                System.out.println("box: ");
                String box = sc.next();
            } else if (opcao == 3) {

            } else if (opcao == 4) {

            } else if (opcao == 5) {
                box1.exibirOrdensSercos();

            } else if (opcao == 6) {

            } else if (opcao == 7) {
                box1.quantidadeOrdensFinalizadas();


            } else {
                System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }
}