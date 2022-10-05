package interfaces;

import java.util.List;

public interface ISpeakingBird extends IBird {
    List<String> getVocabulary();
    String getFavoritePhrase();
}
