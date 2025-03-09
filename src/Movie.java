public class Movie {
    private String title;
    private Genre genre;
    private double rating;
    private int duration;

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getDuration(){
        return duration;
    }

    public Movie(String title, Genre genre, double rating, int duration){
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.duration = duration;
    }

    public  boolean isRecommended(){
        return rating > 7.0;
    }
}
