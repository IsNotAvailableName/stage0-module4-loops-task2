package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power >= 0) {
            int count = 0;
            int pow = 1;
            while (count < power + 1) {
                System.out.println(pow);
                pow *= 2;
                count++;
            }
        } else {
            System.out.println("too much power");
        }
    }
}
