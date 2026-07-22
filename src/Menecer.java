public class Menecer extends Isci {
    private int komandaSayi;

    public Menecer(String ad, int komandaSayi) {
        super(ad);
        this.komandaSayi = komandaSayi;
    }

    public void melumat() {
        System.out.println("Menecer: " + getAd() + ", Komanda sayı: " + komandaSayi);
    }
}

