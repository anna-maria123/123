import java.util.Scanner;
  public class Main3 {
      public static void main(String[] args){
          double a, b, c, moda, modb, modc, max;
          Scanner q = new Scanner(System.in);
          System.out.print("1 ");
          if (q.hasNextDouble()) {
              a = q.nextDouble();
              System.out.print("2 ");
              if (q.hasNextInt()) {
                  b = q.nextDouble();
                  System.out.print("3 ");
                  if (q.hasNextDouble()) {
                      c = q.nextInt();
                      moda = Math.abs(a);
                      modb = Math.abs(b);
                      modc = Math.abs(c);
                      if (moda >= modb && moda >= modc) {
                          max = a;
                      } else if (modb >= moda && modb >= modc) {
                          max = b; }
                      else {
                          max = c; }
                      System.out.println(max); }

                  else {
                      System.out.println("Not double"); }
              } else {
                  System.out.println("Not double");
              } } else {
              System.out.println("Not double"); }
      }
  }