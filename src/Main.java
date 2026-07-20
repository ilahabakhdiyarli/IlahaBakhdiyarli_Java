//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("---Task7---");

        KofeMasini km = new KofeMasini();
        km.kofeHazirla();

        System.out.println("---Task8---");
        Bankomat bm = new Bankomat(156);
        bm.pulCekmek(56);
        bm.pulCekmek(105);
        bm.pulCekmek(-24);
    }
}

