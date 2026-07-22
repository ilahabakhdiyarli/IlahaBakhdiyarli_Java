//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Test[] testler = {new UITest(), new APITest(), new DBTest()};

        for (Test t : testler) {
            t.icraEt();
        }
    }
}

