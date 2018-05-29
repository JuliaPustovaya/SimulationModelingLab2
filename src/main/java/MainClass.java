public class MainClass {
    public static void main(String args[])
    {

        System.out.println("X1");
        InitialX.getAccumulativeValues(InitialX.X1Probability,InitialX.X1Accumulative);
        InitialX.getRandomPair(InitialX.X1Accumulative,InitialX.X1RandomPair);
        System.out.println("аккумулятвная   "+InitialX.X1Accumulative);
        System.out.println("случайная числа "+InitialX.X1RandomPair);


        System.out.println("X2");
        InitialX.getAccumulativeValues(InitialX.X2Probability,InitialX.X2Accumulative);
        InitialX.getRandomPair50(InitialX.X2Accumulative,InitialX.X2RandomPair);
        System.out.println("аккумулятвная   "+InitialX.X2Accumulative);
        System.out.println("случайная числа "+InitialX.X2RandomPair);


        System.out.println("X3");
        InitialX.getAccumulativeValues(InitialX.X3Probability,InitialX.X3Accumulative);
        InitialX.getRandomPair50(InitialX.X3Accumulative,InitialX.X3RandomPair);
        System.out.println("аккумулятвная   "+InitialX.X3Accumulative);
        System.out.println("случайная числа "+InitialX.X3RandomPair);

        System.out.println("X4");
        InitialX.getAccumulativeValues(InitialX.X4Probability,InitialX.X4Accumulative);
        InitialX.getRandomPair(InitialX.X4Accumulative,InitialX.X4RandomPair);
        System.out.println("аккумулятвная   "+InitialX.X4Accumulative);
        System.out.println("случайная числа "+InitialX.X4RandomPair);
        System.out.println(FormTable.formTableFirstRow());
    }
}
