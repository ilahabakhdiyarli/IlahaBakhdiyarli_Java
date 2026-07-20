//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("---Task5---");
        Kalkulyator calc = new Kalkulyator();
        int test1 = calc.vurma(4, 5);
        System.out.println(test1);
        System.out.println(calc.vurma(4, 5, 6));
        System.out.println(calc.vurma(4.5, 5.6));

        System.out.println("---Task6---");
        EmailBildiris email = new EmailBildiris();
        SmsBildiris sms = new SmsBildiris();
        PushBildiris pb = new PushBildiris();
        Bildiris[] b = {email,sms,pb};
        for (Bildiris bildiris : b) {
            System.out.println(bildiris.mesajGonder());
        }
    }
}

