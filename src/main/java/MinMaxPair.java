public class MinMaxPair {
    double min = 0;
    double max = 0;

    public MinMaxPair(double min, double max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public String toString() {
        return "{" +
                 min +
                ", " + max +
                '}';
    }
}
