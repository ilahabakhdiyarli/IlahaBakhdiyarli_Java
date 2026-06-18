public class Task16 {
    public static void main(String[] args) {
        String metn = " Salam, ABB Bank! ";
        System.out.println(metn.length());
        System.out.println(metn.trim().length());
        System.out.println(metn.toUpperCase());
        System.out.println(metn.toLowerCase());
        System.out.println(metn.contains("ABB"));
        System.out.println(metn.contains("bank")); //contains() böyük/kiçik hərfi fərqləndirir.
        System.out.println(metn.replace("Bank","Kredit"));
        System.out.println(metn.trim().startsWith("Salam"));
    }
}
