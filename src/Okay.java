

public class Okay {
public static void main(String[] args) {
	Movie yes = new Movie("Yes",  7) ;
	Movie ok = new Movie("Okay", 7);
	Movie yep= new Movie("Yep", 7);
	Movie yah = new Movie("Yah", 7);
	Movie sure = new Movie("Sure", 7);

	sure.getTicketPrice();
	
NetflixQueue k = new NetflixQueue();
k.addMovie(yes);
k.addMovie(ok);
k.addMovie(yep);
k.addMovie(yah);
k.addMovie(sure);

k.printMovies();
System.out.println(yes);
System.out.println(ok);
System.out.println(yep);
System.out.println(yah);
System.out.println(sure);




}
	
}
