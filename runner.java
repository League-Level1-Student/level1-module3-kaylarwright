package extra;

public class runner {
public static void main(String[] args) {
	Movie m = new Movie("Finding Nemo", 3);
	Movie o = new Movie("Finding Dory", 2);
	Movie v = new Movie("Black Panther", 5);
	Movie i = new Movie("incredibles", 4);
	Movie e = new Movie("Emoji Movie", 1);
	String price = m.getTicketPrice();
	System.out.println(price);
	
	NetflixQueue n = new NetflixQueue();
	n.addMovie(m);
	n.addMovie(o);
	n.addMovie(v);
	n.addMovie(i);
	n.addMovie(e);
	n.printMovies();
	Movie mov = n.getBestMovie();
	n.sortMoviesByRating();
	Movie ie = n.getMovie(2);
	System.out.println("The best movie is " + mov.getTitle() + "and the second best movie is " + ie.getTitle());
	
	

	
}
}
