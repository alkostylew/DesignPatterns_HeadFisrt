package headfirst.adapter.aleksApiAdapter;

public class MainApiTester {

    public static void main(String[] args) {
        MusicChooserApiV1 apiV1 = new MusicChooserApiV1Impl();
        printConsultation(apiV1);

        System.out.println("Now we start using V2!");

        MusicChooserApiV2 musicChooserApiV2 = new MusicChooserApiV2Impl();
        MusicChooserApiV1 apiV1Adapter = new MusicChooserApiV1Adapter(musicChooserApiV2);
        printConsultation(apiV1Adapter);

    }

    private static void printConsultation(MusicChooserApiV1 api) {
        System.out.println("Choosing a music from api: (starts with Sult)");
        System.out.println(api.choose("Sul"));
        System.out.println("Listing genres:");
        System.out.println(api.availableGenres());
    }
}
