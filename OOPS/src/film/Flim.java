package film;

import java.util.ArrayList;
import java.util.List;

interface iFlim{
	void setTitle(String title);
	String getTitle();
	
	void setDirector(String director);
	String getDirector();
	
	void setYear(int year);
	int getYear();
	
}
class Film implements iFlim{
	private String title;
	private String director;
	private int year;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
interface iFlimLibrary{
	void addFlim(iFlim flim);
	void removeFlim(String title);
	 List<iFlim> searchFlims(String query);
	 List<iFlim> getFlims();
	 int getTotalFlimCount(); 
}
class FlimLibrary implements iFlimLibrary{
    private List<iFlim> flims = new ArrayList<>();
	public void addFlim(iFlim flim) {
		flims.add(flim);
	}
	public void removeFlim(String title) {
		flims.removeIf(f->f.getTitle().equalsIgnoreCase(title));
	}
    public List<iFlim> searchFilms(String query) {

        List<iFlim> result = new ArrayList<>();

        for (iFlim flim : flims) {

            if (flim.getTitle().toLowerCase().contains(query.toLowerCase()) ||
                flim.getDirector().toLowerCase().contains(query.toLowerCase())) {

                result.add(flim);
            }
        }

        return result;
    }

    public List<iFlim> getFilms() {
        return flims;
    }

    public int getTotalFilmCount() {
        return flims.size();
    }
}

// Main class
public class Flim {

    public static void main(String[] args) {

        FlimLibrary library = new FlimLibrary();

        Film f1 = new Film();
        f1.setTitle("Inception");
        f1.setDirector("Christopher Nolan");
        f1.setYear(2010);

        Film f2 = new Film();
        f2.setTitle("Interstellar");
        f2.setDirector("Christopher Nolan");
        f2.setYear(2014);

        library.addFlim(f1);
        library.addFlim(f2);

        System.out.println("Total Films: " + library.getTotalFilmCount());

        List<iFlim> search = library.searchFilms("Nolan");

        for (iFlim film : search) {
            System.out.println(film.getTitle() + " - " + film.getDirector());
        }
    }
}
