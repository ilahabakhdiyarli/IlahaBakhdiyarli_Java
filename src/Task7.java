public class Task7 {
    public static void main(String[] args) {
        // 1) Temperatur 36-dan çox, 37.5-dən azdır
        double temp = 36.8;
        boolean normalTemp = temp > 36 && temp < 37.5;
        System.out.println("Normal temperatur: " + normalTemp);

        // 2) Sürət 0-dan çox VƏ 120-dən az, YA DA yanacaq 0-dan çoxdur
        int suret = 95, yanacaq = 0;
        boolean hereketMumkun = (suret > 0 && suret < 120) || yanacaq > 0;
        System.out.println("Hərəkət mümkün:    " + hereketMumkun);

        // 3) Hesab aktiv deyil, YA DA balans mənfidir
        boolean aktiv = false;
        double balans = -50.0;
        boolean problemli = !aktiv || balans < 0;
        System.out.println("Hesab problemli:   " + problemli);

        // 4) Ad boş deyil VƏ yaş 18-dən böyükdür
        String ad = "Anar";
        int yas = 22;
        boolean etibarli = ad.length() > 0 && yas > 18;
        System.out.println("Məlumat etibarlı:  " + etibarli);


    }
}
