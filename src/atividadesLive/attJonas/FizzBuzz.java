package atividadesLive.attJonas;

public class FizzBuzz {
    public static void main(String[] args) {
        int numeros = 100;
        for (int i = 1; i <= numeros; i++) {
            if(i % 3 == 0 && i % 5 == 0)  {
                System.out.println(i + " Fizz Buzz");
                continue;
            }
            if (i % 3 == 0 && i < 15) {
                System.out.println(i + " fizz ");
            }
            if (i % 5 == 0) {
                System.out.println(i + " buzz");
            }

        }

    }

}

