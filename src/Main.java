import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Coñecidos o nome e o peso de dúas persoas,
        queremos escribir os datos da que pesa máis e,
        a diferenza de peso entre elas .
         */
        System.out.println("Este programa muestra la persona más gorda y la diferencia de peso entre dos personas");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre de la primera persona: ");
        String nome1 = sc.next();
        System.out.println("Introduce el peso de la primera persona: ");
        double peso1 = sc.nextDouble();
        System.out.println("Introduce el nombre de la segunda persona: ");
        String nome2 = sc.next();
        System.out.println("Introduce el peso de la segunda persona: ");
        double peso2 = sc.nextDouble();

        if (peso1 > peso2) {
            System.out.println(nome1 +" pesa mas que " + nome2);
            System.out.println("La diferencia de peso entre ambas es: " + (peso1-peso2));
        }
        else {
            System.out.println(nome2 +" pesa mas que " + nome1);
            System.out.println("La diferencia de peso entre ambas es: " + (peso2-peso1));
        }
    }
}