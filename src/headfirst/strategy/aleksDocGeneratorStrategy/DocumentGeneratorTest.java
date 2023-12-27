package headfirst.strategy.aleksDocGeneratorStrategy;

public class DocumentGeneratorTest {

    public static void main(String[] args) {
        DocumentGenerator documentGenerator = new CsvGeneratorStrategy();
        documentGenerator.generateDoc("Income");

        documentGenerator = new ExcelGeneratorStrategy();
        documentGenerator.generateDoc("Income");
    }
}
