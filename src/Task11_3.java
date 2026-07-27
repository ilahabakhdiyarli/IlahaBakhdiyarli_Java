public class Task11_3 {
    public static void kocurmeEt(double mebleg) {
        if (mebleg <= 0) {
            throw new IllegalArgumentException("Məbləğ sıfır və ya mənfi ola bilməz: " + mebleg);
        }
        System.out.println("Köçürüldü: " + mebleg);
    }

    public static void main(String[] args) {

        // 1. müsbət məbləğ
        try {
            kocurmeEt(150.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Xəta: " + e.getMessage());
        }

        // 2. mənfi məbləğ
        try {
            kocurmeEt(-50.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Xəta: " + e.getMessage());
        }
    }
}
