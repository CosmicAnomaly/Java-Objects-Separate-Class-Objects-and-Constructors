
public class Driver {


	public static void main(String[] args) {
		Anime show1;
		Anime show2;
		Anime show3;
		
		show1 = new Anime ("Full Metal Alchemist", "Action", "Aniplex", "October 4, 2003", "October 2, 2004");
		show2 = new Anime ("Full Metal Alchemist: Brotherhood", "Adventure", "Square Enix", "April 5, 2009", "July 4, 2010");
		show3 = new Anime ("Sword Art Online", "Fantasy", "Genco", "July 8, 2012", "December 23, 2012");
		
		System.out.println("Title of Show: " + show1.getTitleOfShow());
		System.out.println("Genre: " + show1.getGenre());
		System.out.println("Show Begin Date: " + show1.getStartDate());
		System.out.println("Final Episode Date: " + show1.getFinalEpisodeDate());
		
		System.out.println();
		
		System.out.println("Title of Show: " + show2.getTitleOfShow());
		System.out.println("Genre: " + show2.getGenre());
		System.out.println("Show Begin Date: " + show2.getStartDate());
		System.out.println("Final Episode Date: " + show2.getFinalEpisodeDate());
		
		System.out.println();
		
		System.out.println("Title of Show: " + show3.getTitleOfShow());
		System.out.println("Genre: " + show3.getGenre());
		System.out.println("Show Begin Date: " + show3.getStartDate());
		System.out.println("Final Episode Date: " + show3.getFinalEpisodeDate());
		
		
		

	}

}