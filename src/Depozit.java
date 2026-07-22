public class Depozit extends Hesab  {
    @Override
    public double faizHesabla() {
        return getBalans() * 11.25/100;
    }
}
