public class Isci {
    private String ad;

    public Isci(String ad) {
        this.ad = ad;
    }

    public void teqdimat() {
        System.out.println("Salam, mən " + ad + ". Bu şirkətdə işləyirəm.");
    }
}

class Menecer extends Isci {
    public Menecer(String ad) {
        super(ad);
    }
    public void vezifem() {
        System.out.println("Menim vezifem menecerdir.");
    }
}

class Developer extends Isci {
    public Developer(String ad) {
        super(ad);
    }
    public void vezifem() {
        System.out.println("Menim vezifem developerdir.");
    }
}