package headfirst.adapter.aleksApiAdapter;

import java.util.Arrays;
import java.util.List;

public class MusicChooserApiV2Impl implements MusicChooserApiV2 {

    List<Music> musicList = Arrays.asList(
            new Music("Sultans of swing", "Rock"),
            new Music("All of me", "Jazz"),
            new Music("Facil", "POP"));
    @Override
    public String choose(String musicName, String genre) {
        return musicList.stream()
                .filter(music -> music.getName().startsWith(musicName) &&
                        (genre == null || music.getGenre().equals(genre)))
                .map(Music::getName)
                .findFirst().orElse("Music not found");
    }

    @Override
    public List<String> availableGenres(boolean isOrderAsc) {
        if (isOrderAsc) {
            return musicList.stream()
                    .map(Music::getGenre)
                    .sorted((o1, o2) -> o1.compareTo(o2))
                    .toList();
        } else {
            return musicList.stream()
                    .map(Music::getGenre)
                    .toList();
        }
    }
}
