import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o primeiro numero: ");
        int primeiroNum = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int segundoNum = scanner.nextInt();

        try{
            contar(primeiroNum, segundoNum);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

    }

    static void contar(int primeiroNum, int segundoNum) throws ParametrosInvalidosException{

        if (segundoNum > primeiroNum){
            int contagem = segundoNum - primeiroNum;

            for (int i = 1; i <= contagem; i++)
                System.out.println("Imprimindo os numeros: " + i);
        }else {
            throw new ParametrosInvalidosException();
        }
    }
}
