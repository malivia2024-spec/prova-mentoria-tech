import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] notas = new double[8];
        
        // Entrada das 8 notas
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a nota do " + (i + 1) + "º bimestre: ");
            notas[i] = entrada.nextDouble();
        }
        
        // Médias bimestrais (no exemplo, é só mostrar cada nota)
        System.out.println("\n--- Resultados ---");
        for (int i = 0; i < 8; i++) {
            System.out.println((i + 1) + "º Bimestre: " + notas[i]);
        }
        
        // Cálculo dos semestres
        double semestre1 = (notas[0] + notas[1] + notas[2] + notas[3]) / 4.0;
        double semestre2 = (notas[4] + notas[5] + notas[6] + notas[7]) / 4.0;
        
        // Média final
        double mediaFinal = (semestre1 + semestre2) / 2.0;
        
        // Saída
        System.out.println("\n1º Semestre: " + semestre1);
        System.out.println("2º Semestre: " + semestre2);
        System.out.println("Média Final: " + mediaFinal);
        
        entrada.close();
    }
}
