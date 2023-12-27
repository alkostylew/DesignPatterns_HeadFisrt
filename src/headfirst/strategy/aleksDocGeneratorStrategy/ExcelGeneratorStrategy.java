package headfirst.strategy.aleksDocGeneratorStrategy;

public class ExcelGeneratorStrategy implements DocumentGenerator {
    @Override
    public void generateDoc(String docName) {
        System.out.println("Logic to generate the document: " + docName + ".xls");
        System.out.println("Generated the documet: " + docName + ".xls \n");
    }
}
