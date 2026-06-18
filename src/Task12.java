public class Task12 {
    public static void main(String[] args) {
        boolean a = true, b = false, c = true;
        System.out.println(a&&b); //false
        System.out.println(a&&c); //true
        System.out.println(a || b );//true
        System.out.println(b || b ); //false
        System.out.println(!a); //false
        System.out.println(!b); //true
        System.out.println(a&&!b); //true
        System.out.println(!a || b ); //false
        System.out.println((a || b)&&c); //true
        System.out.println (!(a&&c)); //false

    }
}
