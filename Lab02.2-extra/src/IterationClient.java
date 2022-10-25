public class IterationClient {
    public static void main(String[] args) {
        Iteration loop = new Iteration();
        loop.displayNumbersUsingForLoop(2, 7);
        System.out.println();
        loop.displayNumbersUsingWhile(1, 5);
        System.out.println();
        loop.displayNumbersUsingDoWhile(8, 20);
        System.out.println();
        loop.displayEvenNumbersOnlyUsingForLoop(22, 30);
    }
}
