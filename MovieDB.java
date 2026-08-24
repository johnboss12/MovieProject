import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieDB {
    public static ArrayList<Movie> readMoviesIntoAL(String fileName){
       try(Scanner in = new Scanner(new File(fileName))){    
            ArrayList<Movie> db = new ArrayList<>();
        //enter is new movie, commas seperate PIVS
            while (in.hasNextLine()) {
                String[] movie = in.nextLine().split("[,]");
                Movie m = new Movie(movie[0],movie[1],movie[2],movie[3]);
                db.add(m);
            }
            return db;
       }catch (Exception e) {
        System.out.println("Can't find the file likely");
        System.err.println(e);
       }
    }
}    
public class Movie{
    private String title;
    private String actor;
    private int year;
    private String directors;

    public MovieDB(String t, String a, int y, String d){
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
}
