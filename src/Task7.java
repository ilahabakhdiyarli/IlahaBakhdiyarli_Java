public class Task7 {
    public static void main(String[] args) {
        double amount = 8000;
        double yearlyPercent =15;
        int duration =12;

        double totalPercent = amount*(yearlyPercent/100);
        double totalAmount = amount+totalPercent;
        double monthlyAmount = totalAmount/duration;

        System.out.println(totalPercent);
        System.out.println(totalAmount);
        System.out.println(monthlyAmount);
    }
}
