import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
          /* Imagine que uma ONG precise saber a média de idade dos
        alunos de uma escola.
            sabendo de antemão quantos alunos existem e sem a necessidade
            de armazenar permanentemente a idade de cada um desses alunos
            qual a melhor forma de calcular essa média ?
         */
        Scanner leitor = new Scanner(System.in);
        int idade;
        int i = 0;
        int soma=0;
        int media;

        while (i < 10) {
            System.out.println("Digite a idade do Aluno:");
            idade = leitor.nextInt();
            soma = soma + idade;
            i = i + 1;
        }
        media = soma / 10;
        System.out.println("A média de idade dos Alunos são : " + media);
    }
}
