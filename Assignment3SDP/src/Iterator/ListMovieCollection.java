package Iterator;

import java.util.ArrayList;
import java.util.List;

public class ListMovieCollection {
    private List<String> movies;

    public ListMovieCollection() {
        movies = new ArrayList<>();
    }

    public void addMovie(String movie) {
        movies.add(movie);
    }

    public Iterator<String> iterator() {
        return new ListMovieIterator(movies);
    }
}
