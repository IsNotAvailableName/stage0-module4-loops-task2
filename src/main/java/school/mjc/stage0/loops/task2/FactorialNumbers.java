package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int count = 1;
        int result = 1;
        while (count <= printToInclusive + 1) {
            System.out.println(result);
            result *= count;
            count++;
        }
    }
}
