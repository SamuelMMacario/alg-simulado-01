import java.util.Scanner;

public class Mario {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fasesFaceis = 0;
        int fasesDificeis = 0; 
        int totalFases = 0;
        int horasFasesFaceis = 1;
        int horasFasesDificeis = 2;
        double valorEnergia = 5.00;
        int totalHoras;

        System.out.println("Digite o total de fases no jogo: ");
        totalFases = input.nextInt();

        do {
        System.out.println("Digite a quantidade de fases fáceis no jogo: ");
        fasesFaceis = input.nextInt();
        // Verificação de que o usuário digitou um número válido de fases fáceis.
        } while(fasesFaceis < 0 || fasesFaceis > totalFases);{
            fasesDificeis = totalFases - fasesFaceis;
        }

        horasFasesFaceis *= fasesFaceis;
        horasFasesDificeis *= fasesDificeis;
        totalHoras = horasFasesFaceis + horasFasesDificeis;


        System.out.println("-------------------------------------------------");
        System.out.println("Quantidade fases fáceis: "+ fasesFaceis);
        System.out.println("Quantidade fases difíceis: "+ fasesDificeis);
        System.out.println();
        System.out.println("Horas nas fases fáceis: "+ horasFasesFaceis);
        System.out.println("Horas nas fases difíceis: "+ horasFasesDificeis);
        System.out.println();
        System.out.println("Total de horas gastas até concluir o jogo: " + totalHoras);
        System.out.println("Valor em reais da jogatina: R$"+  (valorEnergia * (horasFasesFaceis + horasFasesDificeis)));


        input.close();
    }
}
