import java.util.Scanner;
public class Task6_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Operator kodunu daxil edin (məsələn, 050): ");
        String kod = sc.nextLine();

        if (kod.equals("050") || kod.equals("051")) {
            System.out.println("Operator: Azercell");
        } else if (kod.equals("055") || kod.equals("099")) {
            System.out.println("Operator: Bakcell");
        } else if (kod.equals("070") || kod.equals("077")) {
            System.out.println("Operator: Nar");
        } else System.out.println("Naməlum operator");

    }}