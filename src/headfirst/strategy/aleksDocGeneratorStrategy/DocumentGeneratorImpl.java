package headfirst.strategy.aleksDocGeneratorStrategy;

public class DocumentGeneratorImpl {

    DocumentGenerator documentGenerator;

    public DocumentGeneratorImpl(DocumentGenerator documentGenerator) {
        this.documentGenerator = documentGenerator;
    }

    public void generateDocument(String docName) {
        this.documentGenerator.generateDoc(docName);
    }
}
