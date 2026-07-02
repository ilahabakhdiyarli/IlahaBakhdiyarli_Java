public class Task10 {
    public static void main(String[] args) {
        int    meblег = 5000;
        int    faiz   = 15;
        double faizMeblegi = meblег * faiz / 100.0;

        System.out.println("Faiz məbləği: " + faizMeblegi);

// Gözlənilən: 750.0   Aktual: 750.0
        //Bu kod təsadüfən düz işləyir.çünki 75000 / 100 tam bölünür. Rəqəmlər fərqli olsa və qalıqlı bölünsə,kəsr hissə itər və nəticə səhv olar.
        //Sadəcə double yazmaq kifayət etmir,100 də 100.0 kimi qeyd etmək lazımdır.
    }
}
