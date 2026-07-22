//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Bildiris ---");
        Bildiris b = new Bildiris();
        b.gonder();

        System.out.println("--- EmailBildiris ---");
        EmailBildiris e = new EmailBildiris();
        e.gonder();

        System.out.println("--- TeciliEmailBildiris ---");
        TeciliEmailBildiris t = new TeciliEmailBildiris();
        t.gonder();
    }
}

