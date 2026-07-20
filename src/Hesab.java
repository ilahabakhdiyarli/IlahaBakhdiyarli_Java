public class Hesab {
    private String ad;
    private double balans;

    public Hesab(String ad) {
        this.ad = ad;
        System.out.println("Hesab yaradildi: " + ad);
    }

    public void balansArtir(double artim) {
        this.balans += artim;
        System.out.println("Balans artirildi.Yeni balans: " + this.balans);
    }

    public double getBalans() {
        return this.balans;
    }

    public void setBalans(double balans) {
        this.balans = balans;
    }
}

class EmanetHesab extends Hesab {
    public EmanetHesab(String ad) {
        super(ad);
    }

    public void faizTetbiqEt(double faiz) {
        double netice = getBalans() * faiz / 100.0 + super.getBalans();
        super.setBalans(netice);
        System.out.println("Emanet faizi tetbiq edildi.Yeni balans: " + super.getBalans());
    }
}