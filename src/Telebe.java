public class Telebe {
    private int bal;
    private String ad;

    public Telebe(String ad) {
        this.ad = ad;
    }

    public String getAd() {
        return ad;
    }

    public void setBal(int bal) {
        if (bal >= 0 && bal <= 100) {
            this.bal = bal;
        } else {
            System.out.println("Bal 0-100 araliginda olmalidir");
        }
    }

    public int getBal() {
        return bal;
    }

    public String getQiymet() {

        if (this.bal >= 90) {
            return "Əla";
        } else if (this.bal >= 70) {
            return "Yaxşı";
        } else if (this.bal >= 50) {
            return "Kafi";
        } else {
            return "Qeyri-kafi";
        }
    }

    public void printNetice() {
        System.out.println("Ad: " + getAd() + ", Bal: " + getBal() + ", Qiymət: " + getQiymet());
    }
}

