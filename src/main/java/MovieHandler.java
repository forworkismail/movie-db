import com.backendless.Backendless;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessException;

public class MovieHandler {

    public static void saveMovie(Movie movie, AsyncCallback<Movie> callback) {
        Backendless.Data.of(Movie.class).save(movie, callback);
    }

    public static void getMovie(String objectId, AsyncCallback<Movie> callback) {
        Backendless.Data.of(Movie.class).findById(objectId, callback);
    }

    public static void updateMovie(Movie movie, AsyncCallback<Movie> callback) {
        if (movie.getObjectId() == null || movie.getObjectId().isEmpty()) {
          throw new IllegalArgumentException("Movie objectId cannot be null or empty for update.");
        }
        Backendless.Data.of(Movie.class).save(movie, callback);
    }

    public static void deleteMovie(Movie movie, AsyncCallback<Long> callback) {
        Backendless.Data.of(Movie.class).remove(movie, callback);
    }
}