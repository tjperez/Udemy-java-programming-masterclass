public class Main {

    public static void main(String[] args) {

        // byte has a width of 8
        byte byteValue = 127;
        byte newbyte = (byte)(byteValue / 2);
        System.out.println(newbyte);

        // short has a width of 16
        short shortValue = 32767;

        //int has a width of 32
        int minValue = -2_147_483_648;
        int maxValue = 2_147_483_647;
        int total = minValue / 2;
        System.out.println(total);

        //long has a width of 64
        long longValue = 9_223_372_036_854_775_807L;


        byte a = 28;
        short b = 128;
        int c = 128000;
        long d = 5000 + 10 * (a + b + c);
        long totalChallenge = d;

        System.out.println(totalChallenge);



    }
}
