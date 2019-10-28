package co.gc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMovieApp {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		/*
		 * Setting up the database
		 */
		List<Movie> movieList = new ArrayList<>(); 
		movieList.add(new Movie("Terminator 2: Judgement Day", "scifi"));
		movieList.add(new Movie("Maleficent: Mistress of Evil", "animated"));
		movieList.add(new Movie("Mission: Impossible - Fallout", "scifi"));
		movieList.add(new Movie("San Andreas", "drama"));
		movieList.add(new Movie("Fractured", "drama"));
		movieList.add(new Movie("Wonder Woman: Bloodlines", "animated"));
		movieList.add(new Movie("The Nun", "horror"));
		movieList.add(new Movie("Spectre", "drama"));
		movieList.add(new Movie("Madagascar", "animated"));
		movieList.add(new Movie("Toy Story 4", "animated"));
		
		/*
		 * Introduction line
		 */
		System.out.println("Welcome to the Movie List Application!");
		System.out.println("");
		System.out.println("There are " + movieList.size() + " movies in this list.");
		
		/*
		 * loop to prompt user to keep searching
		 */
		String cont = "yes";
		String genre = "";
		while (cont.toLowerCase().startsWith("y")) {
			// your code should start here!
			genre = Validator.getString(scnr, "What category are you interested in? ");
			for (Movie movie : movieList) {
				if (movie.getCategory().equalsIgnoreCase(genre)) {
					System.out.println(movie.getTitle());
				}
			}
			// your logic should stop here if it doesn't need to be included in the loop
			System.out.println("");
			System.out.println("Continue? (yes/no)");
			cont = scnr.nextLine();
		}

		//This is our indication that the program has ended
		System.out.println("Goodbye!");

		scnr.close();
	}

}
