public class FaylMenecer implements Yuklene, Endirile{
    @Override
    public void yukle(String fayl) {
        System.out.println(fayl + " serverə yükləndi.");
    }

    @Override
    public void endir(String fayl) {
        System.out.println(fayl + " cihaza endirildi.");
    }

}
