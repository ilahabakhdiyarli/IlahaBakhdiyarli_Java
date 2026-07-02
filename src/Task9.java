import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Email daxil edin: ");
        String email = sc.nextLine();
        boolean simvolVar = email.contains("@");
        boolean noqteVar = email.contains(".");
        boolean ikiSimvol = email.indexOf("@") >= 2;

        System.out.println("\"@\" simvolu var: " + simvolVar);
        System.out.println("\".\"  var: " + noqteVar);
        System.out.println("\"@\" evvel en azi 2 simvol var: " + ikiSimvol);

}}
