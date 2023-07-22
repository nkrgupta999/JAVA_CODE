public class typeoff {
    public static void main(String args[]) {
        byte b = 4;
        char c = 'c';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.98;
        // boolean bool = true;
        double result = (f * b) + (i % c) - (d * s);
        System.out.println("Type of result is " + result);
    }
}