public class Main {
  public static void main (String [] args) {
    int x = 5;
    int y = 5;
    int result1 = x++ + 5;
    // 변수를 실행한 후 x에 1이 더해짐 [1 is added to x after executing the variable.]
    int result2 = ++y + 5;
    // y에 1이 더해지고 변수가 실행됨 [1 is added to y and the variable is executed.]
    System.out.println("result1 = " + result1 + ", result2 = " + result2);
    
    //Using the Asky code.

    char code = 'A';

    if ((code >= 65) & ( code <= 90)) {
      System.out.println("It's a capital letter.");

    }
    if ((code >= 97) & ( code <= 122)) {
      System.out.println("It's lowercase letters.");
      
    }
    if (!(code < 48) && !( code > 57)) {
      System.out.println("It's a number between 0 and 9.");
      
    }
    //Using the Asky code.
  }
}