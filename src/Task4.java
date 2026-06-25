public class Task4 {
        public static void main(String[] args) {
            int a = 15, b = 40;

            System.out.println("Əvvəl: a=" + a + ", b=" + b);

            int temp = a;   // temp a-nın dəyərini saxlayır → temp=15
            a = b;          // a indi b-nin dəyərini alır    → a=40
            b = temp;       // b temp-dəki köhnə a-nı alır    → b=15

            System.out.println("Sonra: a=" + a + ", b=" + b);
}}
