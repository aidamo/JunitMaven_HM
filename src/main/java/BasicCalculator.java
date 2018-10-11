public class BasicCalculator {
    public BasicCalculator(){
        System.out.println("Constructor BasicCalculator");
    }

    public int add(int... numbers) {
        int result = 0;
        for (int a : numbers) {
            result = result + a;
        }
        return result;
    }
    public long add(long...numbers){
        long result=0;
        for (long a:numbers){
            result=result+a;
        }
        return result;
    }
    public double add(double...numbers){
        double result=0;
        for (double a:numbers){
            result=result+a;
        }
        return result;
    }

    public int substract(int...numbers){
        int result=0;
        for (int i=1; i<numbers.length;i++){
            if (i==1){
                result=numbers[0]-numbers[1];
            }
            else {
                result=result-numbers[i];
            }
        }
        return result;
    }
    public long substract(long...numbers){
        long result=0;
        for (int i=1; i<numbers.length;i++){
            if (i==1){
                result=numbers[0]-numbers[1];
            }
            else {
                result=result-numbers[i];
            }
        }
        return result;
    }
    public double substract (double...numbers) {
        double result = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (i == 1) {
                result = numbers[0] - numbers[1];
            }
            else {
                result = result - numbers[i];
            }
        }
        return result;
    }
    public int multiply (int...numbers) {
        int result=0;
        for (int i=1;i<numbers.length;i++){
            if (i==1) {
                result=numbers[0]*numbers[1];
            }
            else {
                result=result*numbers[i];
            }
        }
        return result;
    }
    public long multiply (long...numbers) {
        long result=0;
        for (int i=1;i<numbers.length;i++){
            if (i==1) {
                result=numbers[0]*numbers[1];
            }
            else {
                result=result*numbers[i];
            }
        }
        return result;
    }
    public double multiply (double...numbers) {
        double result=0;
        for (int i=1;i<numbers.length;i++){
            if (i==1) {
                result=numbers[0]*numbers[1];
            }
            else {
                result=result*numbers[i];
            }
        }
        return result;
    }

    public int divide (int...numbers) {
        int result=0;
        for (int i=1;i<numbers.length;i++){
            if (i==1){
                result=numbers[0]/numbers[1];
            }
            else {
                result=result/numbers[i];
            }
        }
        return result;
    }
    public long divide (long...numbers) {
        long result=0;
        for (int i=1;i<numbers.length;i++){
            if (i==1){
                result=numbers[0]/numbers[1];
            }
            else {
                result=result/numbers[i];
            }
        }
        return result;
    }
    public double divide (double...numbers) {
        double result=0;
        for (int i=1;i<numbers.length;i++){
            if (i==1){
                result=numbers[0]/numbers[1];
            }
            else {
                result=result/numbers[i];
            }
        }
        return result;
    }



    }





