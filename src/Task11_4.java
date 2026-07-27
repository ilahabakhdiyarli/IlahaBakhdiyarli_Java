public class Task11_4 {

    public static void nagdCixar(double mebleg) throws LimitKecildiException {
        double limit = 2000;
        if (mebleg > limit) {
            throw new LimitKecildiException(limit,mebleg);
        }
        System.out.println("Çıxarıldı: " + mebleg + " AZN");
    }

    public static void main(String[] args) {

        try {
            nagdCixar(1500);
            nagdCixar(2500);
        } catch (LimitKecildiException e) {
            System.out.println(e.getMessage());
        }
    }
}
