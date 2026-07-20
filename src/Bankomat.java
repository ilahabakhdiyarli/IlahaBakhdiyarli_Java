public class Bankomat {
    private double balans;

    public Bankomat(double balans) {
        System.out.println("Balans teyin edildi: "+ balans);
        this.balans = balans;
    }

    public void pulCekmek(double mebleg) {
        if (meblegYoxla(mebleg) && balansYoxla(mebleg)) {
            balans -= mebleg;
            System.out.println("Cixilan mebleg: -"+ mebleg);
            System.out.println("Yekun balans: " + balans);
        } else {
            System.out.println("Hazirki balans: "+ balans);
        }

    }
    private boolean balansYoxla(double mebleg) {
        if (mebleg > balans) {
            System.out.println("Kifayet qeder balans yoxdur");
            return false;
        } else  {
            return true;
        }
    }
    private boolean meblegYoxla(double mebleg) {
        if (mebleg <= 0 ) {
            System.out.println("Cixilacaq mebleg 0-dan boyuk olmalidir");
            return false;
        } else  {
            return true;
        }
    }
}
