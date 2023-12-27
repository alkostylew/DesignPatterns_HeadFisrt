package headfirst.adapter.aleksApiAdapter;

import java.util.Arrays;
import java.util.List;

public class MusicChooserApiV1Impl implements MusicChooserApiV1 {

    List<Music> musicList = Arrays.asList(
            new Music("Sultans of swing", "Rock"),
            new Music("All of me", "Jazz"),
            new Music("Facil", "POP"));
    @Override
    public String choose(String musicName) {
        return musicList.stream()
                .filter(music -> music.getName().startsWith(musicName))
                .map(music -> music.getName())
                .findFirst().orElse("Music not found");
    }

    @Override
    public List<String> availableGenres() {
        return musicList.stream()
                .map(Music::getGenre)
                .toList();
    }
}
