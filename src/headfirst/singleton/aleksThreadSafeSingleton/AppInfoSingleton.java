package headfirst.singleton.aleksThreadSafeSingleton;

public class AppInfoSingleton {

    private AppInfoSingleton() {
    }

    private static AppInfoSingleton singleton;

    public static synchronized AppInfoSingleton getIntance() {
        if (singleton == null) {
            singleton = new AppInfoSingleton();
        }
        return singleton;
    }

    public String someAppInfo() {
        return "App ip = 123.12.12.133";
    }
}
