import com.backendless.Backendless;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessException;
import com.backendless.exceptions.BackendlessFault;

public class Main {
  public static void main(String[] args) {
    // Initialize Backendless with your app ID and API key
    String applicationId = "4CB3F98D-5C05-63EC-FFE2-1C385BF95C00";
    String apiKey = "545F9DCF-A8F3-4417-9106-C33A2408E612";
    Backendless.initApp(applicationId, apiKey);

    Movie movie = new Movie("Inception", 4.8f);
/*
    MovieHandler.saveMovie(movie, new AsyncCallback<Movie>() {
        @Override
        public void handleResponse(Movie response) {
          String objectId = response.getObjectId();
          System.out.println("Movie saved successfully with objectId: " + objectId);
        }

        @Override
        public void handleFault(BackendlessFault fault) {
            System.out.println("Error saving movie: " + fault.getMessage());
        }
    });
*/

  }
}