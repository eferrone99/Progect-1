package ferroneericfinalexam;
import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author Ferro
 */
public class Book extends Library {

    private String author;
    private int numPages;
    private static final int CHECKED_OUT_TIME = 21;
    public static final double FINE_PER_DAY = .50;
    private LocalDate dueDate;

    public Book(int id, String title) {
        super(id, title);

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    @Override

    @Override
    public String toString() {
        return super.toString() + "author: " + author + "Number of Pages: " + numPages;
    }
}
