package q1;

public class Main {
    public static void main(String[] args) {
        Average avgInterface = (x, y) -> (double) (x + y) / 2;
        System.out.println(avgInterface.average(4, 1));
    }
}

@FunctionalInterface
interface Average {
    double average(int x, int y);
}
