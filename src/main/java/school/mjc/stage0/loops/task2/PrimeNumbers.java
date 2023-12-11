package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int count = 0;
        while (count < printToInclusive) {
            int insideCount = 2;
            boolean isPrimeNumber = count > 1 ? true : false;
            while (insideCount < count) {
                if (count % insideCount == 0 && insideCount != count) {
                    isPrimeNumber = false;
                }
                insideCount++;
            }
            if (isPrimeNumber) {
                System.out.println(count);
            }
            count++;
        }
    }
}
