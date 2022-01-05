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