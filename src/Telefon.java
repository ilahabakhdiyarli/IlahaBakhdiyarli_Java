public class Telefon {

    private int batareya;

    public void setBatareya(int faiz) {
        if (faiz >= 0 && faiz <= 100) {
            batareya = faiz;
            System.out.println("Batareya faizi teyin edildi: " + faiz);
        } else {
            System.out.println("Xəta! Batareya 0–100 aralığında olmalıdır. Daxil edilən: " + faiz + "%");
        }
    }

    public int getBatareya() {
        return batareya;
    }
}
