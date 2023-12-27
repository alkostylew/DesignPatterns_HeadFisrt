package headfirst.strategy.aleksDocGeneratorStrategy;

public class CsvGeneratorStrategy implements DocumentGenerator {
    @Override
    public void generateDoc(String docName) {
        System.out.println("Logic to generate the document: " + docName + ".csv");
        System.out.println("Generated the documet: " + docName + ".csv \n");
    }
}
