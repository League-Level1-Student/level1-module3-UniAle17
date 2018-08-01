

public class Okay {
public static void main(String[] args) {
	Movie yes = new Movie("The Best Night of my Life",  5) ;
	Movie ok = new Movie("Break Through", 7);
	Movie yep= new Movie("No Thank You", 3);
	Movie yah = new Movie("Everything Comes Down", 8);
	Movie sure = new Movie("The Stars are Shining Tonight", 10);

	sure.getTicketPrice();
	
NetflixQueue k = new NetflixQueue();
k.addMovie(yes);
k.addMovie(ok);
k.addMovie(yep);
k.addMovie(yah);
k.addMovie(sure);

k.printMovies();

Movie bestMovie = k.getBestMovie();

k.sortMoviesByRating();
Movie second = k.getMovie(1);

System.out.println("The best movie is, "+bestMovie);
System.out.println("The second best movie is, "+second);

}
	
}
