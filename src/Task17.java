public class Task17 {
    public static void main(String[] args) {
        String s1 = "test";
        String s2 = "test";
        String s3 = "TEST";
        System.out.println(s1.equals(s2)); // her ikisi kicik herflerle oldugu ucun beraberdir
        System.out.println(s1.equals(s3)); // boyuk ve kicik herf ferqli oldugu ucun eyni deyil
        System.out.println(s1.equalsIgnoreCase(s3)); // boyuk ve ya kicik herfle yazilmasini ignore etdiyi ucun eyni qebul edilir
        System.out.println(s1.equals(" test ".trim())); // trimle evvel ve sondaki bosluqlari kesir ve s1-le eyni olur."test" kimi

        String s4 = new String("test");
        System.out.println(s1 == s2); // Hər iki dəyişən eyni "String Pool"dakı eyni yaddaş ünvanını (memory address) göstərdiyi üçün == operatoru true qaytarır.
        System.out.println(s1 == s4); //new açar sözü s4 üçün "String Pool"dan kənarda, yaddaşın "heap" hissəsində yeni bir obyekt yaratdığı üçün, s1 və s4 fərqli yaddaş ünvanlarını göstərir.

}
}
