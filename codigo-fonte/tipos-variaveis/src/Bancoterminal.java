import java.util.Scanner;

public class Bancoterminal {
    public static void main(String[] args) {
        Scanner conta = new Scanner(System.in);
        double saldo = 25.000;
        while (true) {
            System.out.println("Caro cliente gostaria de realizar o saque ou deposito ?");
            String açao1 = conta.nextLine();
            if (açao1.equalsIgnoreCase("saque")){
                System.out.printf("O seu saldo é %s , qual valor gostaria de retirar ?\n",saldo);
                Double retirada = conta.nextDouble();
                conta.nextLine();
                if (retirada > saldo) {
                    System.out.println("Caro cliente voce nao possui saldo para realizar este saque");
                }
                else{
                Double posSaque = saldo - retirada ;
                saldo = posSaque;
                System.out.printf("o seu novo saldo é %s\n",posSaque);
                }}
            else if(açao1.equalsIgnoreCase("deposito")){
                System.out.println("Qual o valor que deseja depositar ? ");
                Double deposito = conta.nextDouble();
                Double posDeposito = saldo + deposito;
                saldo = posDeposito;
                System.out.printf("o seu novo saldo é %s.",posDeposito);
                conta.nextLine();
            }
            else {
                System.out.println("opçao invalida, tente novamente");
            }
            System.out.println("Gostaria de realizar outra Operaçao ?(sim/nao)");
            String continuar = conta.nextLine();
            if (!continuar.equalsIgnoreCase("sim")) {
                System.out.println("Atendimento encerrado. Obrigado por utilizar o BancoTerminal!");
                break;
            }

        }   
    }
}
