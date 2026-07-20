//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("---Task3---");
        Menecer isci = new Menecer("Ilaha");
        isci.teqdimat();
        isci.vezifem();

        Developer isci2 = new Developer("Ivan");
        isci2.teqdimat();
        isci2.vezifem();

        System.out.println("---Task4---");
        EmanetHesab hesab = new EmanetHesab("Yigim hesabi");
        hesab.balansArtir(260);
        hesab.faizTetbiqEt(30);
        System.out.println("Son balans: "+ hesab.getBalans());
    }
}

