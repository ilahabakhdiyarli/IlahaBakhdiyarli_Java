public class Task9 {
    public static void main(String[] args) {
        String kod = "  abb-2024  ";

        System.out.println(kod.length());                      // Aktual:12, Gözlənilən: 8.trim olmalidir.çünki əks halda boşluqlar da sayılır
        System.out.println(kod.contains("ABB"));               // Aktual:false, Gözlənilən: true.contains() case-sensitive-dir — böyük və kiçik hərfi fərqli sayır.
        System.out.println(kod.trim() == "abb-2024");          // Aktual:false, Gözlənilən: true.== iki String-in məzmununu müqayisə etmir.String məzmununu yoxlamaq üçün həmişə .equals()
        System.out.println(kod.toUpperCase().contains("ABB")); // Aktual: true, Gözlənilən: true. bu doğrudur.toUpperCase bütün hərfləri böyük etdiyi üçün nəticə doğrudur.


        // Doğru versiya:
        /*
        System.out.println(kod.trim().length());
        System.out.println(kod.toUpperCase().contains("ABB"));
        System.out.println(kod.trim().equals("abb-2024"));
        System.out.println(kod.toUpperCase().contains("ABB"));
        */
    }
}
