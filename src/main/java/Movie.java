public class Movie {
    private String title;
    private float rating;
    private String objectId;

    public Movie(String title, float rating) {
        this.title = title;
        this.rating = rating;
    }

    public String getTitle() { return title; }
    public float getRating() { return rating; }
    public String getObjectId() { return objectId; }

    public void setTitle(String title) { this.title = title; }
    public void setRating(float rating) { this.rating = rating; }
    public void setObjectId(String objectId) { this.objectId = objectId; }

    @Override
    public String toString() {
        return "Movie: " + title +", Rating: " + rating;
    }
}