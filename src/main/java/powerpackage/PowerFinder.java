
package powerpackage;

public class PowerFinder {
    public static int OF(int baseNumber, int powerOf) {
        int result = 1;
        for (int temporary = 0; temporary<powerOf; temporary++) {
            result *= baseNumber;
        }
        return result;
    }
}
