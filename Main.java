
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Favor informar a hora entre 0 e 12");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a hora:");
        int hora = sc.nextInt();

        System.out.print("Digite o minuto:");
        int minuto = sc.nextInt();

        if (hora > 12 || minuto > 59) {
            System.out.println("Entrada invalida!");
            
            return;
        }

        int posicaoMinuto = obterPosicaoMinuto(minuto);
        int posicaoHora = obterPosicaoHora(hora);

        int diferenca = obterDiferenca(posicaoMinuto, posicaoHora);

        System.out.println("A diferenca dos angulo entre os 2 ponteiros do relogio = " + diferenca + " graus");
    }

    public static int obterPosicaoMinuto(int minutos) {
        // 360 = volta completa, dividimos por 60 pra saber quando cada minuto representa em graus
        return minutos * (360 / 60);
    }

    public static int obterPosicaoHora(int horas) {
        // se hora for igual a 12 retorna 0 se nao
        // 360 = volta completa, dividimos por 12 pra saber quando cada hora representa em graus
        return horas == 12 ? 0 : horas * (360 / 12);
    }

    private static int obterDiferenca(int posicaoMinuto, int posicaoHora) {
        int diferenca = 0;
        // verifica qual é o maior grau, para fazer a subtracao nao dar negativa
        if (posicaoHora > posicaoMinuto) {
            diferenca = posicaoHora - posicaoMinuto;
        } else {
            diferenca = posicaoMinuto - posicaoHora;
        }
        return diferenca;
    }
    

}

