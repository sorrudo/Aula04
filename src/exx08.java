import java.util.Scanner;

public class exx08 {
    public static void main(String[] args) {
        /* Um professor quer saber quantos alunos de uma sala de 50 tiveram nota maior do que a média.
        Faça um programa onde o professor informe as médias e as notas de cada um dos 50 alunos e, ao final, seja
        exibido quantos alunos tiveram nota superior a média e quantos tiveram notas inferiores a média
         */
        Scanner leitor = new Scanner(System.in);
        int i=0;
        int nota;
        double media=0;
        int notaBoa=0;

        System.out.println("Média das notas do alunos");
        System.out.println("---------------------------");
        while(i < 50) {
            System.out.println("Digite a nota do " + (i+1) + "° Aluno");
            nota = leitor.nextInt();
            media = media + nota;
            if(nota > 5){
                notaBoa = notaBoa + 1;
            }
            i = i +1;
        }
        media = media / 50;
        System.out.println("A média das notas de todos os alunos são: " + media + " e\n a quantidade de alunos que tiraram maior que  5 são: " + notaBoa + " Alunos");
    }
}
