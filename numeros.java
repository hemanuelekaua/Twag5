import java.util.Scanner;

public class numeros {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2;
        int aux = 0;

            System.out.println("Digite a quantidade de repetições: ");
            num1 = input.nextInt();

            while (aux<num1){
                aux = aux +1;
                System.out.println("informe um numero: ");
                num2 = input.nextInt();

                if(num2>0){
                    System.out.println("O numero é postivo");
                }
                if (num2<0){
                    System.out.println("O numero é negativo");
                }
                if (num2==0) {
                    System.out.println("O numero é zero");
                }

        }
    }
}



