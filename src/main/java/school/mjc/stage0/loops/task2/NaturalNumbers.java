package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {
        int iterator = 0;
        while (iterator <= lastPrinted){
            System.out.println(iterator);
            ++iterator;
        }
    }
}
