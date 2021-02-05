import java.util.Arrays;

public class Quiz {
  public static void main(String[] args) {
    for (String arg : args) {
      if (arg.charAt(0) == 't') {
        System.out.println(arg);
      }
    }
  }
}