import java.util.Scanner;

public class EnteringNumbers {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Wpisz dowolną liczbę dodatnią i wciśnij enter:");
        Integer[] numbers = new Integer[10];

        for (int i = 0; i < numbers.length; i++) {
            int number = sc.nextInt();

            if (number < 0) {
                Scanner sc = new Scanner(numbers);

                int a = numbers[0];
                int b = numbers[1];
                int c = numbers[2];

                System.out.println("Liczba ta NIE powinna być dodana do listry");
                System.out.println("Odwrotna kolejność wprowadzonych cyfr: "+sc.nextLine());
                System.out.println("Suma cyfr a+b+c = "+(a+b+c));
                System.out.println("Największa wprowadzona cyfra to: "+ Integer.MAX_VALUE);
                System.out.println("Najmniejsza wprowadzona cyfra to: " + Integer.MIN_VALUE);
                sc.close();
            }
        }
    }
}



