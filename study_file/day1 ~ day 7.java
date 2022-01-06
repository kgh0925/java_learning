/* 
[1day]

public class Main {
  public static void main(String[] args) {
    int value = 30;
    int result = value + 10;
    
    System.out.println(result);
  }

}

public class Main {
  public static void main(String[] args) {
    String name = "black";
    String job = "Student";

    System.out.println(name + job);
  }

}


[2day]

import java.util.Scanner;


public class Main {
  public static void main (String[] args) throws Exception {
    System.out.println("010-xxxx-xxxx\t[my name is KGH]\tArmy");
    System.out.println("We are \"developers\"");
    System.out.println("Spring\\Summer\\Fall\\Winter");

    boolean stop = true;
    if(stop) {
      System.out.println("Stop!");

    }
    else {
      System.out.println("Start!");
    }

    System.out.printf("name_list [ 1 : %1$s, 2 : %2$s ]\n", "KGH", "KHW");

    int keycode;
    
    while(true){
      keycode = System.in.read();
      System.out.println("Keycode = " + keycode);
      if (keycode == 113){
        break;
      }
    }
    Scanner scanner = new Scanner(System.in);
    String inputData;
    
    while (true) {
      inputData = scanner.nextLine();
      System.out.println("The entered text : \"" + inputData + "\"");
      if (inputData.equals("q")) {
        break;
      }
    }
    

  } 
}

[3day]

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
*/