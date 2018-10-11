public class ExpertCalculator extends BasicCalculator{
    public int pow(int... numbers) {
        int result = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (i == 1) {
                result = numbers[0] ^ numbers[i];
            } else {
                result = result ^ numbers[i];
            }
        }
        return result;
    }

        public int pow ( int baz, int exp){
            int rez = baz;
            for (int i = 1; i < exp; i++) {
                rez = rez * baz;

            }
            return rez;
        }

        public long pow ( long baz, long exp){
            long rez = baz;
            for (int i = 1; i < exp; i++) {
                rez = rez * baz;

            }
            return rez;
        }

        public double pow ( double baz, double exp){
            double rez = baz;
            for (int i = 1; i < exp; i++) {
                rez = rez * baz;

            }
            return rez;
        }

        public float root ( int number){
            float root = 0.0f;
            float square = root;
            while (square < number) {
                root++;
                square = root * root;
            }
            return root;
        }

        public int factorial ( int a){
            int fact = 1;
            for (int i = 1; i <= a; i++) {
                fact = fact * i;
            }
            return fact;
        }
    }

//public int pow(int base, int power)

