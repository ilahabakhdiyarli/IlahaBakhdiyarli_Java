import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir ədəd daxil edin: ");
        String metn = sc.nextLine();

        int reqem = Integer.parseInt(metn);

        int hesablama = reqem*4;

        String neticeMetn = String.valueOf(hesablama);

        int uzunluq = neticeMetn.length();

        System.out.println("Daxil edilən mətn: \"" + metn + "\"");
        System.out.println("Reqeme cevrildi: " + reqem);
        System.out.println("Hesablama sonrasi: " + hesablama);
        System.out.println("Yeniden stringe cevrildi: \"" + neticeMetn + "\"");
        System.out.println("Metn uzunlugu: " + uzunluq);

}}
