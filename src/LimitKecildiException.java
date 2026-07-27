public class LimitKecildiException extends Exception {
    public LimitKecildiException(double limit,double mebleg) {
        super("LimitKecildiException: Gündəlik limit aşıldı!Limit: " + limit + " AZN, tələb olunan: " + mebleg + " AZN");
    }
}

