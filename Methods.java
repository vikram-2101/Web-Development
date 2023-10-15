import java.util.*;
public class Methods {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
    char ch=scanner.next().charAt(0);
    int ascii = (int)ch;
    if(ascii>=65 && ascii<=99) {
      System.out.println("Uppercase character");
    }
    else if(ascii>=97 && ascii<=122) {
    System.out.println("Lowercase character");
    }

  }
}


