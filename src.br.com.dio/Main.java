import java.util.Scanner;
import models.IPhone;

public class Main {
    public static void main(String[] args) {
        IPhone meuIPhone = new IPhone();
        Scanner scanner = new Scanner(System.in);
        int opcao;
        int opcaoReprodutorMusical;
        int opcaoAparelhoTelefonico;
        int opcaoNavegadorInternet;
        String musica = "";

        do {
            System.out.println("\nEscolha qual opção do iPhone deseja utilizar:");
            System.out.println("1 - Reprodutor Musical");
            System.out.println("2 - Aparelho Telefônico");
            System.out.println("3 - Navegador na Internet");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.println("\n[REPRODUTOR MUSICAL]");
                    System.out.println("Escolha qual opção deseja utilizar:");
                    System.out.println("1 - Selecionar Música");
                    System.out.println("2 - Tocar Música");
                    System.out.println("3 - Pausar Música");
                    System.out.println("0 - Voltar ao menu do iPhone");
                    System.out.print("Opção: ");
                    opcaoReprodutorMusical = scanner.nextInt();
                    scanner.nextLine();

                    if (opcaoReprodutorMusical == 1) {
                        System.out.print("Digite o nome da música: ");
                        musica = scanner.nextLine();
                        if (musica.isBlank()) {
                            System.out.println("Por favor, digite uma música válida.");
                            break;
                        }
                        meuIPhone.selecionarMusica(musica);
                    } else if (opcaoReprodutorMusical == 2) {
                        if (musica.isBlank()) {
                            System.out.println("Nenhuma música foi selecionada. Tocando música aleatória...");
                        } else {
                            meuIPhone.tocar();
                        }
                    } else if (opcaoReprodutorMusical == 3) {
                        if (musica.isBlank()) {
                            System.out.println("Nenhuma música foi selecionada...");
                        } else {
                            meuIPhone.pausar();
                        }
                    } else if (opcaoReprodutorMusical == 0) {
                        break;
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;

                case 2:
                    System.out.println("\n[APARELHO TELEFÔNICO]");
                    System.out.println("Escolha qual opção deseja utilizar:");
                    System.out.println("1 - Ligar");
                    System.out.println("2 - Atender");
                    System.out.println("3 - Iniciar Correio de Voz");
                    System.out.println("0 - Voltar ao menu do iPhone");
                    System.out.print("Opção: ");
                    opcaoAparelhoTelefonico = scanner.nextInt();
                    scanner.nextLine();

                    if (opcaoAparelhoTelefonico == 1) {
                        System.out.print("Digite o número para ligar: ");
                        String numero = scanner.nextLine();
                        if (numero.isBlank()) {
                            System.out.println("Por favor, digite um número válido.");
                            break;
                        }
                        meuIPhone.ligar(numero);
                    }
                    else if (opcaoAparelhoTelefonico == 2) meuIPhone.atender();
                    else if (opcaoAparelhoTelefonico == 3) meuIPhone.iniciarCorreioVoz();
                    else System.out.println("Opção inválida.");
                    break;

                case 3:
                    System.out.println("\n[NAVEGADOR DE INTERNET]");
                    System.out.println("Escolha qual opção deseja utilizar:");
                    System.out.println("1 - Exibir Página");
                    System.out.println("2 - Adicionar Nova Aba");
                    System.out.println("3 - Atualizar Página");
                    System.out.println("0 - Voltar ao menu do iPhone");
                    System.out.print("Opção: ");
                    opcaoNavegadorInternet = scanner.nextInt();
                    scanner.nextLine();

                    if (opcaoNavegadorInternet == 1){
                        System.out.print("Digite a URL da página: ");
                        String url = scanner.nextLine();
                        if (url.isBlank()) {
                            System.out.println("Por favor, digite uma URL válida.");
                            break;
                        }
                        meuIPhone.exibirPagina(url);
                    }
                    else if (opcaoNavegadorInternet == 2) meuIPhone.adicionarNovaAba();
                    else if (opcaoNavegadorInternet == 3) meuIPhone.atualizarPagina();
                    else System.out.println("Opção inválida.");
                    break;

                case 0:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
