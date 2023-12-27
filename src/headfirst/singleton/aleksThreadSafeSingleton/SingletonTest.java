package headfirst.singleton.aleksThreadSafeSingleton;

public class SingletonTest {
    public static void main(String[] args) {
        AppInfoSingleton appInfoA = AppInfoSingleton.getIntance();
        AppInfoSingleton appInfoB = AppInfoSingleton.getIntance();

        System.out.println(appInfoA);
        System.out.println(appInfoB);

        System.out.println(appInfoA.someAppInfo());
        System.out.println(appInfoB.someAppInfo());
    }
}
