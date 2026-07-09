import java.util.Scanner;

public class Task6_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ilkin emanet meblegi: ");
        double ilkinEmanet = sc.nextDouble();

        System.out.println("Illik faiz: ");
        double illikFaiz = sc.nextDouble();

        double hedef = ilkinEmanet * 2;
        int il = 0;

        while (ilkinEmanet < hedef) {
            il++;
            double artim = ilkinEmanet * (illikFaiz / 100);
            ilkinEmanet = ilkinEmanet + artim;
            System.out.println(il + "-ci ilin sonunda balans: " + ilkinEmanet + " AZN");
        }
        sc.close();
    }
}