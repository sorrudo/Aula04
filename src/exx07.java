import java.util.Scanner;

public class exx07 {
    public static void main(String[] args) {
        /*No parque Valter Dino World, os clientes podem ter a chance
        de passar uma noite no castelo da princesa Javarella. Para isso,
        devem acertar quantos feijões estão em um jarro (1238). Faça um
        programa que solicite a digitação da quantidade de feijões até que um cliente acerte.
         */
        Scanner leitor = new Scanner(System.in);
        int valor;
        System.out.println("Adivinhe quantos grãos de feijão tem na Jarra");
        System.out.println("--------------------------------------------------");
        valor = leitor.nextInt();
        while ( valor !=  1238) {
            System.out.println("Você errou, tente novamente !");
            valor = leitor.nextInt();
            if (valor == 1238){
                System.out.println("Parabéns você ganhou");
            }
        }
        leitor.close();
    }
}
