public class Main {
  public static void main (String [] args) {
    int sum = 0;

    for (int i = 1; i<= 100; ++i){
      sum += i;
    }
    System.out.println("1~100 Total = " + sum );

    int o = 1;
    while (o <= 10) {
      System.out.println(o);
      ++o;
    }
    int p = 1;

    do {
      System.out.println(p);
      ++p;
    } while (p <= 5);

    int a = 1;
    while (a <= 10){
      System.out.println(a);
      ++a;
      if (a == 4) {
        break;
      }
    }
  }
}