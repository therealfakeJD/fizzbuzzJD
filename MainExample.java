public class MainExample {

    public static void main(String[] args) {
        int i;
        String fizzbuzz;
      for (i = 0; i <= 100; i++) {

          if (i % 3 == 0 && i % 5 == 0) {
              fizzbuzz = "fizzbuzz";
              System.out.println(fizzbuzz);
          } else if (i % 5 == 0) {
              fizzbuzz = "buzz";
                  System.out.println(fizzbuzz);
              } else if (i % 3 == 0) {
                  fizzbuzz = "fizz";
                  System.out.println(fizzbuzz);
              } else {
              System.out.println(i);
          }
          }
      }
    }

