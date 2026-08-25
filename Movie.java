public class Movie {
    private String title;
    private String actor;
    private int year;
    private String directors;

    public Movie(String t, String a, int y, String d){
        title = t;
        actor = a;
        year = y;
        directors = d;
    }
    public String getTitle(){
        return title;
    }
    public String getActor(){
        return actor;
    }
    public int getYear(){
        return year;
    }
    public String getDirector(){
        return directors;
    }
    public String toString(){
        return (title + " | " + actor + " | " + year + " | " + directors);
    }
}
