package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int iterator = 0;
        while (iterator <= printTillInclusive) {
            if (iterator == 0 || iterator % 2 == 0) {
                System.out.println(iterator);
            }
            ++iterator;
        }
    }
}
