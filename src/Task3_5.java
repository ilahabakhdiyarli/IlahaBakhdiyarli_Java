public class Task5 {
        public static void main(String[] args) {
            int bal1 = 78, bal2 = 91, bal3 = 84;

            double cem = bal1 + bal2 + bal3;   // 253

            /* (bal1 + bal2 + bal3) / 3
            int + int + int = int (253), sonra int / int = int.
            253 / 3 = 84 (kəsr — .33 — atılır).Ona görə double ilə olmalıdır. */


            double orta = cem / 3.0;        // 253 / 3.0 = 84.333...

            System.out.println("Cəm:  " + cem);
            System.out.println("Orta: " + orta);
        }
    }


