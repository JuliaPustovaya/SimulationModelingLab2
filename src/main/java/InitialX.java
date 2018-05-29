import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;


public class InitialX {
    public static ArrayList<Integer> X1 = new ArrayList();
    public static ArrayList<Integer> X2 = new ArrayList();
    public static ArrayList<Integer> X3 = new ArrayList();
    public static ArrayList<Integer> X4 = new ArrayList();

    public static ArrayList<Double> X1Probability = new ArrayList();
    public static ArrayList<Double> X2Probability = new ArrayList();
    public static ArrayList<Double> X3Probability = new ArrayList();
    public static ArrayList<Double> X4Probability = new ArrayList();

    public static ArrayList<Double> X1Accumulative = new ArrayList();
    public static ArrayList<Double> X2Accumulative = new ArrayList();
    public static ArrayList<Double> X3Accumulative = new ArrayList();
    public static ArrayList<Double> X4Accumulative = new ArrayList();

    public static ArrayList<MinMaxPair> X1RandomPair = new ArrayList();
    public static ArrayList<MinMaxPair> X2RandomPair = new ArrayList();
    public static ArrayList<MinMaxPair> X3RandomPair = new ArrayList();
    public static ArrayList<MinMaxPair> X4RandomPair = new ArrayList();

    public static ArrayList<Integer> X1Randoms = new ArrayList();
    public static ArrayList<Integer> X2Randoms = new ArrayList();
    public static ArrayList<Integer> X3Randoms = new ArrayList();
    public static ArrayList<Integer> X4Randoms = new ArrayList();

    static {
        X1.add(1);
        X1.add(2);
        X1.add(3);
        X1.add(4);
        X1.add(5);
        X1.add(6);
        X1.add(7);
        X1.add(8);
        X2.add(0);//doctor A
        X2.add(1);//doctor B
        X3.add(1);//Yes
        X3.add(0);//No
        X4.add(6);
        X4.add(8);
        X4.add(10);
        X4.add(12);
        X4.add(14);
    }

    static {
        X1Probability.add(0.05);
        X1Probability.add(0.05);
        X1Probability.add(0.1);
        X1Probability.add(0.2);
        X1Probability.add(0.4);
        X1Probability.add(0.1);
        X1Probability.add(0.05);
        X1Probability.add(0.05);

        X2Probability.add(0.50);
        X2Probability.add(0.50);

        X3Probability.add(0.90);
        X3Probability.add(0.10);
        X4Probability.add(0.10);
        X4Probability.add(0.20);
        X4Probability.add(0.50);
        X4Probability.add(0.1);
        X4Probability.add(0.1);

    }
static {
        X1Randoms.add(63);
        X1Randoms.add(27);
        X1Randoms.add(15);
        X1Randoms.add(99);
        X1Randoms.add(86);
        X1Randoms.add(71);
        X1Randoms.add(74);
        X1Randoms.add(45);
        X1Randoms.add(11);
        X1Randoms.add(2);
        X1Randoms.add(15);
        X1Randoms.add(14);
        X1Randoms.add(18);
        X1Randoms.add(7);
        X1Randoms.add(14);
        X1Randoms.add(58);
        X1Randoms.add(68);
        X1Randoms.add(39);
        X1Randoms.add(31);
        X1Randoms.add(8);
        X1Randoms.add(13);
        X1Randoms.add(55);

        X2Randoms.add(5);
        X2Randoms.add(4);
        X2Randoms.add(2);
        X2Randoms.add(2);
        X2Randoms.add(3);
        X2Randoms.add(1);
        X2Randoms.add(3);
        X2Randoms.add(3);
        X2Randoms.add(5);
        X2Randoms.add(7);
        X2Randoms.add(5);
        X2Randoms.add(5);
        X2Randoms.add(3);
        X2Randoms.add(1);
        X2Randoms.add(7);
        X2Randoms.add(2);
        X2Randoms.add(7);
        X2Randoms.add(3);
        X2Randoms.add(8);
        X2Randoms.add(2);
        X2Randoms.add(4);
        X2Randoms.add(7);

        X3Randoms.add(6);
        X3Randoms.add(2);
        X3Randoms.add(0);
        X3Randoms.add(4);
        X3Randoms.add(8);
        X3Randoms.add(3);
        X3Randoms.add(3);
        X3Randoms.add(7);
        X3Randoms.add(1);
        X3Randoms.add(1);
        X3Randoms.add(2);
        X3Randoms.add(5);
        X3Randoms.add(2);
        X3Randoms.add(9);
        X3Randoms.add(0);
        X3Randoms.add(2);
        X3Randoms.add(1);
        X3Randoms.add(5);
        X3Randoms.add(2);
        X3Randoms.add(6);
        X3Randoms.add(6);
        X3Randoms.add(2);

        X4Randoms.add(69);
        X4Randoms.add(39);
        X4Randoms.add(39);
        X4Randoms.add(27);
        X4Randoms.add(85);
        X4Randoms.add(49);
        X4Randoms.add(90);
        X4Randoms.add(25);
        X4Randoms.add(84);
        X4Randoms.add(47);
        X4Randoms.add(42);
        X4Randoms.add(4);
        X4Randoms.add(83);
        X4Randoms.add(3);
        X4Randoms.add(78);
        X4Randoms.add(87);
        X4Randoms.add(61);
        X4Randoms.add(82);
        X4Randoms.add(69);
        X4Randoms.add(33);
        X4Randoms.add(40);
        X4Randoms.add(64);
}
    public static ArrayList<Double> getAccumulativeValues(ArrayList<Double> xProbation, ArrayList<Double> xKumulative) {
        double sum = 0;
        for (int i = 0; i < xProbation.size(); i++) {
            sum = sum + xProbation.get(i);
            xKumulative.add(new BigDecimal(sum).setScale(2, RoundingMode.HALF_DOWN).doubleValue());
        }
        return xKumulative;
    }

    public static ArrayList<MinMaxPair> getRandomPair(ArrayList<Double> xKumulative, ArrayList<MinMaxPair> randomPair) {
        randomPair.add(new MinMaxPair(0, (xKumulative.get(0) * 100 - 1)));
        for (int i = 1; i < xKumulative.size(); i++) {
            randomPair.add(new MinMaxPair(xKumulative.get(i - 1) * 100, (xKumulative.get(i) * 100 - 1)));
        }
        return randomPair;
    }
    public static ArrayList<MinMaxPair> getRandomPair50(ArrayList<Double> xKumulative, ArrayList<MinMaxPair> randomPair) {
        randomPair.add(new MinMaxPair(0, (xKumulative.get(0) * 10 - 1)));
        for (int i = 1; i < xKumulative.size(); i++) {
            randomPair.add(new MinMaxPair(xKumulative.get(i - 1) * 10, (xKumulative.get(i) * 10 - 1)));
        }
        return randomPair;

    }
        public static int getNumberCategory(int x1Random, ArrayList<MinMaxPair> randomArrayList, ArrayList<Integer> x) {
        for (int i = 0; i < randomArrayList.size(); i++) {
            if (x1Random >= randomArrayList.get(i).min&& x1Random <= randomArrayList.get(i).max) {
                return x.get(i);
            }
        }
        return 0;
    }
}


