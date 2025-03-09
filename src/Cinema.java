import java.util.LinkedList;
import java.util.List;

public class Cinema {
    private List<Movie> listOfMovies = new LinkedList<Movie>();

    public void addMovie(Movie movie){
        listOfMovies.add(movie);
    }

    public Movie findLongestMove(){

        Movie longestMovie = listOfMovies.getFirst();

        for(Movie movie : listOfMovies){
            if (movie.getDuration() > longestMovie.getDuration()){
                longestMovie = movie;
            }
        }

        return longestMovie;
    }
}
