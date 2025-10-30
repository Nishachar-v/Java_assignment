// 2. Wrapper to Primitive Conversion
public class WrapperToPrimitive {
    public static void main(String[] args) {
        Double dObj = Double.valueOf(45.67);
        double primDouble = dObj.doubleValue();
        int primInt = (int) dObj.doubleValue(); // casting
        System.out.println("Double object: " + dObj);
        System.out.println("Primitive double: " + primDouble);
        System.out.println("Primitive int (casted): " + primInt);
    }
}
