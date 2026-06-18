public class Task14 {
    public static void main(String[] args) {
        int n = 84;
        System.out.print("Cut mu?: ");
        System.out.println(n%2==0);

        System.out.print("Müsbət mi?: ");
        System.out.println(n>0);

        System.out.print("3-ə bölünür?: ");
        System.out.println(n%3==0);

        System.out.print("7-ə bölünür?: ");
        System.out.println(n%7==0);

        System.out.print("Həm 3-ə, həm 7-yə bölünür?: ");
        System.out.println((n%3==0) && (n%7==0));

        System.out.print("10-dan böyük, 100-dən kiçik?: ");
        System.out.println((n>10) && (n<100));
    }
}
