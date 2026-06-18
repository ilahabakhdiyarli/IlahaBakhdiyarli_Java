public class Task13 {
    public static void main(String[] args) {

        int yas1,yas2,yas3;
        int mebleg1,mebleg2,mebleg3;
        double gelir1,gelir2,gelir3;
        boolean tarix1,tarix2,tarix3;

        yas1=34;
        gelir1=1500;
        mebleg1=10000;
        tarix1=true;

        yas2=19;
        gelir2=950;
        mebleg2=3000;
        tarix2=true;

        yas3=45;
        gelir3=750;
        mebleg3=7000;
        tarix3=false;

        System.out.println("Musteri 1:");
        boolean uygun1 = (yas1>=21 && yas1<=65) && (gelir1>800) && (tarix1) &&
                (mebleg1>=300 && mebleg1<=50000);
        System.out.println("Uygundurmu: " + uygun1);

        System.out.println("Musteri 2:");
        boolean uygun2 = (yas2>=21 && yas2<=65) && (gelir2>800) && (tarix2) &&
                (mebleg2>=300 && mebleg2<=50000);
        System.out.println("Uygundurmu: " + uygun2);

        System.out.println("Musteri 3:");
        boolean uygun3 = (yas3>=21 && yas3<=65) && (gelir3>800) && (tarix3) &&
                (mebleg3>=300 && mebleg3<=50000);
        System.out.println("Uygundurmu: " + uygun3);

    }
}
