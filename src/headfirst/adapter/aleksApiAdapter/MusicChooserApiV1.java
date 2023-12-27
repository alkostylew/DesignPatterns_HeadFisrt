package headfirst.adapter.aleksApiAdapter;

import java.util.List;

public interface MusicChooserApiV1 {
    public String choose(String musicName);

    public List<String> availableGenres();

}
