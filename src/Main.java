public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello CRISTI!");
//        byte myfirstbyte = (2 + 5);
//        System.out.println(myfirstbyte);
//
//        myfirstbyte += 2;
//        System.out.println(myfirstbyte);
//
//        int myfirstint = (5 * 30);
//        System.out.println(myfirstint);
//
//        short myfirstshort = (11 * 26);
//        System.out.println(myfirstshort);
//
//        long myfirstlong = (1120 * 36L);
//        System.out.println(myfirstlong);
//
//        float myfirstfloat = (32161 * 6);
//        System.out.println(myfirstfloat);
//
//        double mifirstdouble = (336 * 4456654);
//        System.out.println(mifirstdouble);
//
//        int x = myfirstbyte + 10;
//        System.out.println(x);
//
//        int y = myfirstint - 5;
//        System.out.println(y);
//
//        boolean myfirstboolean = (y > x);
//        System.out.println(myfirstboolean);
//        System.out.println(y != x);
//        System.out.println(y < x);
//
//        System.out.println(300 * 7555);
//        System.out.println("rezultat" + (200 + 620));
//
//        String author = "Cristi";
//        String poveste = author + " nu gaseste linia oblica orientata de la stanga(sus) spre dreapta(jos) pe tastatura WINDOWS " +
//                "pentru a aranja propozitiile una sub cealalalta";


        int x = 2;
        int y = 5;

        int z = sum(x, y);
        System.out.println(z);

        float a = substract(x, y);
        System.out.println(a);

        float b = multiplication(x, y);
        System.out.println(b);

        double c = divide(x, y);
        System.out.println(c);

        double d = module(x, y);
        System.out.println(d);


    }
        public static int sum(int first, int second) {
            int result = first + second;
            return result;
        }

        public static float substract(float first, float second){
            float result = first - second;
            return result;
        }


        public static float multiplication (float first, float second){
        float result = first * second;
        return result;
        }

        public static double divide (double first, double second){
            double result = first / second;
            return result;
        }


    public static double module (double first, double second) {
        double result = first%second;
        return result;

    }




}