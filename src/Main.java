//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Depozit d = new Depozit();
        d.balansGoster();
        System.out.println("Depozit faizi: " + d.faizHesabla() + " AZN");

        Kredit k = new Kredit();
        k.balansGoster();
        System.out.println("Kredit faizi: " + k.faizHesabla() + " AZN");

        // Hesab h = new Hesab();
    }
}

