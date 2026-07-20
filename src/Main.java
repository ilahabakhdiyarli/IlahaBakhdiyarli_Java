//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Telefon tel = new Telefon();
        tel.setBatareya(200);
        int result = tel.getBatareya();
        System.out.println("Hazirki batareya faizi: " + result);
        tel.setBatareya(25);
        result = tel.getBatareya();
        System.out.println("Hazirki batareya faizi: " + result);
        tel.setBatareya(-54);
        result = tel.getBatareya();
        System.out.println("Hazirki batareya faizi: " + result);

        Telebe telebe = new Telebe("Ilaha");

        telebe.setBal(67);
        telebe.printNetice();
    }
}

