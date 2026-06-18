public class Task6 {
    public static void main(String[] args) {
        int a = 17, b = 5;

        System.out.println(a+b); //a+b=22
        System.out.println(a-b); //a-b=12
        System.out.println(a*b); //a*b=85
        System.out.println(a/b); //a/b=3  tam eded kimi qebul edir
        System.out.println(a%b); //a%b=2  qaligi gosterir 17/5=3 2/5 kimi, 3.4-den 0.4 kimi deyil
        a++;
        System.out.println(a);  //a++=18
        a--;
        System.out.println(a); //a--=17
        a+=5;
        System.out.println(a); //a+=5 =22
        a*=5;
        System.out.println(a); //a*=5 =110
        System.out.println(a==b); //false
        System.out.println(a>b); //true
        System.out.println(a<b); //false
        System.out.println(a!=b); //true
        System.out.println(a>=b); //true
        System.out.println(a<=b); //false

    }
}
