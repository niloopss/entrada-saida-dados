import java.util.Scanner;


public class entradaSaida {
    public static void main(String[] args) {
        String nome;
        int idade;
        float altura;
        String estadocivil;
        Scanner leia = new Scanner(System.in);

        System.out.println("Bem vindo(a), para começar com o atendimento precisamos de alguns dados.");

        System.out.println("Digite seu nome: ");
        nome = leia.next();

        System.out.println("Digite sua idade: ");
        idade = leia.nextInt();

        System.out.println("Digite sua altura: ");
        altura = leia.nextFloat();

        System.out.println("Solteito ou casado? ");
        estadocivil = leia.next();

        System.out.println("\nConfirme os seus dados: ");
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Altura: "+altura);
        System.out.println("Estado civil: "+estadocivil);

        System.out.println("Seus dados estão corretos?(Sim/Não)");
        String resposta = leia.next().toLowerCase();

        while (!resposta.equals("sim") && !resposta.equals("não")) {
            System.out.println("Por favor, digite sim ou não.\n");
            resposta = leia.next().toLowerCase();
        }
        if (resposta.equals("sim")){
            System.out.println("O sistema agradece pela confiança!");
        }else {
            System.out.println("O sistema reiniciará. Por favor, forneça os dados novamente.");
        }
        leia.close();
    }

    }

