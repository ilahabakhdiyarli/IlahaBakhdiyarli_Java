public class Task13 {
    public static void main(String[] args) {
        String metn = " Java proqramlaşdırma dili çox güclüdür! ";

        int evvel = metn.length();           // boşluqlar daxil
        int sonra = metn.trim().length();    // əvvəl və sondakı boşluqlar atılır
        System.out.println("Uzunluq (əvvəl): " + evvel);
        System.out.println("Uzunluq (sonra): " + sonra);
        System.out.println("Fərq: " + (evvel - sonra) + " boşluq atıldı");

        boolean javaVar      = metn.contains("Java");
        boolean javaBoyukVar = metn.contains("JAVA");
        System.out.println("\"Java\" var: " + javaVar);
        System.out.println("Böyük hərflə \"JAVA\" var: " + javaBoyukVar);

        String evezlenmis = metn.replace("proqramlaşdırma", "programming");
        System.out.println("Əvəzlənmiş: " + evezlenmis.trim());

        String ilk4 = metn.trim().substring(0, 4);
        System.out.println("İlk 4 hərf: " + ilk4);

        boolean nidaVar = metn.contains("!");
        System.out.println("\"!\" var: " + nidaVar);

        String kicik = metn.trim().toLowerCase();
        System.out.println("Kiçik və trim: " + kicik);
    }
}
