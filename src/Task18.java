public class Task18 {
    public static void main(String[] args) {
    String tamAd = "leyla hüseynova";

    System.out.println(tamAd.substring(0,1).toUpperCase()
            + tamAd.substring(1,6)
     + tamAd.substring(6,7).toUpperCase()+tamAd.substring(7) );

         // Alternative2.sözlərin uzunluğu dəyişdikdə (IndexOutOfBounds) istifade olunur. int bosluqYeri = tamAd.indexOf(" ");
         //  String ad = tamAd.substring(0, 1).toUpperCase() + tamAd.substring(1, bosluqYeri); // İlk adı böyüdürük
         //  String soyad = tamAd.substring(bosluqYeri + 1, bosluqYeri + 2).toUpperCase() + tamAd.substring(bosluqYeri + 2); // Soyadı böyüdürük
         //  String netice = ad + " " + soyad;

        System.out.println("Düzgün format: " + tamAd.length());
        System.out.println("Uzunluq: " + tamAd.substring(5));
        System.out.println("Adın ilk 5 hərfi: " +tamAd.contains(" "));
        System.out.println("Boşluq varmı?: " + tamAd.startsWith("leyla"));
        System.out.println("Leyla ilə başlayırmı?: " + tamAd.toUpperCase());
}
}