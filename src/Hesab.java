public abstract class Hesab {
    private double balans = 14000;

    public double getBalans() {
        return balans;
    }

    public void balansGoster() {
        System.out.println("Cari balans: " + balans + " AZN");
    }

    public abstract double faizHesabla();
}
