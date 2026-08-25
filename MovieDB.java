import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieDB {

    public static ArrayList<Movie> readMoviesIntoAL(String fileName){
       try(Scanner in = new Scanner(new File(fileName))){    
            ArrayList<Movie> db = new ArrayList<>();
        //enter is new movie, commas seperate PIVS
            while (in.hasNextLine()) {
                String[] movie = in.nextLine().split("[\u2028]");
                Movie m = new Movie(movie[0].trim(),movie[1].trim(),Integer.parseInt(movie[2].trim()),movie[3].trim());
                db.add(m);
            }
            return db;
       }catch (Exception e) {
        System.out.println("Can't find the file likely");
        System.err.println(e);
        return new ArrayList<Movie>();
       }
    }

    public static void main(String[] args){
        ArrayList<Movie> db = readMoviesIntoAL("Movies.txt");
        for(int i=0; i<db.size();i++)
        System.out.println(db.get(i).toString());
    }
}    


