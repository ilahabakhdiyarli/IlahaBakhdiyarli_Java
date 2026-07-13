import java.util.Scanner;

public class Task7_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---Ən sürətli qaçışçı---");
        int runner = 3;
        int minTime = 0;
        int minRunner = 0;

        for (int i = 1; i <= runner; i++) {
            System.out.print(i + "-ci qaçışçının vaxtı: ");
            int second = input.nextInt();

            if (i == 1 || second < minTime) {
                minTime = second;
                minRunner = i;
            }

        }
        System.out.println("Ən sürətli qaçışçı: " + minRunner + " nömrəli, vaxtı: " + minTime + " saniyə");

      input.close();
    }
}

