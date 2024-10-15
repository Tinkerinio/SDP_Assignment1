package Iterator;

class ArrayMovieIterator implements Iterator<String> {
    private String[] movies;
    private int position;

    public ArrayMovieIterator(String[] movies) {
        this.movies = movies;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < movies.length && movies[position] != null;
    }

    @Override
    public String next() {
        if (hasNext()) {
            return movies[position++];
        }
        return null;
    }
}
