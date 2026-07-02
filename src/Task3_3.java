public class Task3 {
    public static void main(String[] args) {
    int     a = 8,  b = 3;
    boolean p = true, q = false;
    String  s = "QA";

System.out.println(a + b);           // 11
System.out.println(a - b * 2);      // 2
System.out.println(a / b);           // 2
System.out.println(a % b);           // 2
System.out.println(p && q);          // false
System.out.println(p || q);          // true
System.out.println(!p && !q);        // false
System.out.println(a > 5 || b > 5);  // (true || false) = true
System.out.println(s + a + b);       // "QA"+8+3=QA83
System.out.println(a + b + s);       // 11QA
}}
