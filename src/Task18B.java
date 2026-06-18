public class Task18B {
    public static void main(String[] args){
    String musteriAdi = "John Doe";
    int yas = 38;
    double ayliqGelir = 2345.78;
    double kreditMeblegi =189.1;
    int muddet = 6;
    double illikFaiz = 10;
    boolean kreditTarixi = true;

    double umumiFaiz = kreditMeblegi* illikFaiz/100;
        System.out.println("Umumi faiz: " + umumiFaiz);

        double ayliqOdenis =(kreditMeblegi+umumiFaiz)/muddet;
        System.out.println("Ayliq odenis: "+ayliqOdenis);

        double gelireNisbet = ayliqOdenis/ayliqGelir*100;
        System.out.println("Gelire nisbet: "+gelireNisbet);

        System.out.println("Yoxlama:");
        boolean nisbetSerti = gelireNisbet < 40;
        boolean uygun1 = (yas>=21 && yas<=65) && (ayliqGelir>800) && (kreditTarixi) &&
                (kreditMeblegi>=300 && kreditMeblegi<=50000)&&
                (nisbetSerti);
        System.out.println("Uygundurmu: " + uygun1);
    }
}