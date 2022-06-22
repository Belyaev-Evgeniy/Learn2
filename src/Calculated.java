public class Calculated {

    Calculated() {
        for (int i = 1, t = 1; i < 101; i++, t++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz" + "\n");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
