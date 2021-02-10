package ws12libraries;

public class WS12Libraries {

    public static void main(String[] args) {
        float squareRoot = 0.0F;
        float number = 0.0F;
        float base = 0.0F;
        float power = 0.0F;
        float exponent = 0.0F;
        float AbsolutueValue = 0.0F;
        number = 8;
        showTheSquareRoot(number);
        number = 50;
        showTheSquareRoot(number);
        number = 25;
        showTheSquareRoot(number);
        base = 6;
        exponent = 2;
        power = computePower(base,exponent);
        System.out.println("The power of: " + base + "^" + exponent + "=" + power);
        base = 5;
        exponent = 4;
        power = computePower(base,exponent);
        System.out.println("The power of: " + base + "^" + exponent + "=" + power);
        base = 75;
        exponent = 4;
        power = computePower(base,exponent);
        System.out.println("The power of: " + base + "^" + exponent + "=" + power);
        number =8;
        AbsolutueValue = (float)Math.abs(number);
        System.out.println("AbsolutueValue of : " + number + "=" + AbsolutueValue );
        number = -8;
        AbsolutueValue = getAbsolutueValue(number);
        System.out.println("AbsolutueValue of : " + number + "=" + AbsolutueValue );
        

    }

    private static void showTheSquareRoot(float number) {
        float squareRoot;
        squareRoot = (float) Math.sqrt(number);
        System.out.println("The squareRoot of : " + number + "is" + squareRoot);
    }

    public static float computePower(float base, float exponent) {
        float power;
        power = 1.0F;
        for (int i = 1; i <= (int) exponent; i++) {
            power = power * base;
        }
        return power;
    }

    public static float getAbsolutueValue(float number) {
        if(number < 0){
            return -number;
        }else{
            return number;
        }

    }

}
