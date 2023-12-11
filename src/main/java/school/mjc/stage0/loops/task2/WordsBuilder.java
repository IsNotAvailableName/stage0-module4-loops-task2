package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int count = 0;
        StringBuilder result = new StringBuilder();
        result.append(chars);
        System.out.print(result);
    }
}
