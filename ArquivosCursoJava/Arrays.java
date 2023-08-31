import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        /*
         * final int TAM = 5; // criando constante
         * 
         * 
         * -> no lugar de criar variável por variável assim: int n1,n2,n3,n4,n5;
         * 
         * -> crie um Array:
         *      int[] num = new int[TAM]; <- array vazio com TAM (valor da constante) posições, todos inicializam com zero pq tipo 'int' recebe zero por padrão.
         */

        /*
         * -> adicionar elemento individualmente no array (não aconselhável):
         *      num[0] = 10;
         *      num[1] = 5;
         *      num[2] = 15;
         *      num[3] = 0;
         *      num[4] = 8;
         */

        /*
         * -> criando Array e adicionando:
         *      int[] numeros = { 10, 20, 30, 40, 50 };
         * 
         * -> Loop para mostrar o conteúdo do array:
         *      for (int i = 0; i < numeros.length; i++) {
         *          System.out.printf("%d - ", numeros[i]);
         *      }
         */

        // exercicio de gabarito de uma prova:

        final int TAM = 5;
        char[] gabarito = { 'a', 'a', 'd', 'b', 'c' };
        char[] respostas = new char[TAM];
        int nota = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < TAM; i++) {
            System.out.printf("Informe a resposta %d:", i);
            respostas[i] = scan.nextLine().charAt(0); // vai pegar apenas o primeiro caractere, index 0 da palavra lida.
        }

        for (int i = 0; i < TAM; i++) {
            if (respostas[i] == gabarito[i]) {
                nota++;
            }
        }

        System.out.printf("\n Você acertou %d questões.", nota);
        scan.close();

    }
}
