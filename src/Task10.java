import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ad və Soyad daxil edin : ");
        String adSoyad = sc.nextLine();

        System.out.print("Yaşınızı daxil edin : ");
        int yas = Integer.parseInt(sc.nextLine());

        System.out.print("İllik gəlirinizi daxil edin : ");
        String gelir = sc.nextLine();
        double illikGelir = Double.parseDouble(gelir);

        boolean adDuzgun = adSoyad.contains(" ") && adSoyad.length() >= 5;
        boolean yasDuzgun = yas >= 18 && yas <= 70;
        boolean gelirDuzgun = illikGelir >= 3000;

        boolean netice = adDuzgun && yasDuzgun && gelirDuzgun;

        System.out.println("Ad və Soyad : " + adSoyad.toUpperCase());
        System.out.println("Yaş : " + yas);
        System.out.println("İllik gəlir : " + illikGelir + " AZN");
        System.out.println("Ad Soyad şərti düzgündürmü? : " + adDuzgun);
        System.out.println("Yaş şərti düzgündürmü? : " + yasDuzgun);
        System.out.println("Gəlir şərti düzgündürmü? : " + gelirDuzgun);
        System.out.printf("Müraciət şərtlərə uyğundurmu? : %b%n", netice);

    }}
