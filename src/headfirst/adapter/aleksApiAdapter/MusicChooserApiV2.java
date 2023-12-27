package headfirst.adapter.aleksApiAdapter;

import java.util.List;

public interface MusicChooserApiV2 {
    public String choose(String musicName, String genre);

    List<String> availableGenres(boolean isOrderAsc);

}
