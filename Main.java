public class Main {
  public static void main (String [] args) {
    for (int i = 1;i<=10;++i) {
      if (i%2 != 0) {
        continue;
      }
      System.out.println(i);
    }

    String str1 = "KGH";
    String str2 = "KGH";
    
    if (str1 == str2) {
      System.out.println("str1 and str2 have the same reference.");
    }
    else {
      System.out.println("str1 and str2 have different references.");
    }

    if (str1.equals(str2)) {
      System.out.println("str1 and str2 have the same string.");
    }

    String str3 = new String("KGH");
    String str4 = new String("KGH");

    if (str3 == str4) {
      System.out.println("str3 and str4 have the same reference.");
    }
    else {
      System.out.println("str3 and str4 have different references.");
    }

    if (str3.equals(str4)) {
      System.out.println("str3 and str4 have the same string.");
    }

    int[] score = {40, 76, 31, 88, 59, 100, 93, 67, 43, 95};

    int sum = 0;
    for (int o =0; o<10; o++) {
      sum += score[o];
    }
    double avg = (double) sum / 10;
    System.out.println("The average of students' exams : " + avg);

    
  }
}