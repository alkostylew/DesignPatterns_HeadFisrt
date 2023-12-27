package headfirst.adapter.aleksApiAdapter;

import java.util.List;

public class MusicChooserApiV1Adapter implements MusicChooserApiV1 {

    private MusicChooserApiV2 musicChooserApiV2;

    public MusicChooserApiV1Adapter(MusicChooserApiV2 musicChooserApiV2) {
        this.musicChooserApiV2 = musicChooserApiV2;
    }

    @Override
    public String choose(String musicName) {
        return musicChooserApiV2.choose(musicName, null);
    }

    @Override
    public List<String> availableGenres() {
        return musicChooserApiV2.availableGenres(true);
    }
}
