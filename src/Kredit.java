public class Kredit extends Hesab{
    @Override
    public double faizHesabla() {
        return getBalans() * 20/100;
    }
}
