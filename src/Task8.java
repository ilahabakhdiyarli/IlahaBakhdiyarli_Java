public class Task8 {
    public static void main(String[] args) {
        //int yas = 25;
        int yas =20; //netice yasUygun false olması üçün yaşı dəyişdim
        double gelir = 1200.0;
        boolean tarix = true;

// Kredit şərti: yaş 21-65, gəlir 800-dən çox, tarix true olmalı

        boolean yasUygun  = yas > 21 && yas < 65;    // nəticə: false,yaş 21-65 aralığına 21 və 65 də daxil olmalıdır
        boolean gelirUygun = gelir > 800;              // nəticə: true, düzdür

        boolean uygun      = yasUygun || gelirUygun || tarix; // bütün şərtlər eyni vaxtda
        // ödənilməlidirsə "&&" olmalıdır "||" yox

        System.out.println("Yaş uyğun:   " + yasUygun);
        System.out.println("Gəlir uyğun: " + gelirUygun);
        System.out.println("Kredit:      " + uygun);
    }
}
