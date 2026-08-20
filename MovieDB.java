import java.util.Scanner;

public class MovieDB {
    public static ArrayList<Movie> readMoviesIntoAL(String fileName){
       try(Scanner in = new Scanner(new File(fileName))){    
            ArrayList<Movie> db = new ArrayList<>();
        //enter is new movie, commas seperate PIVS
            while (in.hasNextLine()) {
                String[] movie = in.nextLine().split("[,]");
                m = new Movie(movie[0],movie[1],movie[2],movie[3]);
                db.add(m);
            }
       }catch (Exception e) {
        System.out.println("Can't find the file likely");
        System.err.println(e);
       }

       return db;
    }
    
}
