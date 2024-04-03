import java.util.Scanner;
public class Main4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        int s1L = s1.length();
        int s2L = s2.length();
        if (s1L>s2L){
            System.out.println(s1);

        }
        else if (s1L==s2L){
            System.out.println("Рівні:");
        }
        else{
            System.out.println(s2);
        }

    }
}

