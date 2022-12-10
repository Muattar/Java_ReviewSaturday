package week02_review;

public class PrimitiveCastings {

    public static void main(String[] args) {

        // byte < short < int < long < float < double

        //implicit casting :  smaller to larger
        byte b = 58;
        long l = b;

        double d = 100;

        //explicit casting; larger to smaller

        double o = 10.5;

        int i = (int) o;

        long z = 1000;
        short s = (short) z;



    }

}
