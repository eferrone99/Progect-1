package ferroneericfinalexam;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Ferro
 */
public abstract class Library {

    private int id;
    private String title;
    private int dueDate;
    LocalDate dateOfRent;
    Period period;
    private static int nextId = 1001;

    public Library(int id, String title) {
        this.id = id;
        this.title = title;
        dateOfRent = LocalDate.now();
        this.period = period;
        id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
       
    public LocalDate getDateOfRent() {
        return dateOfRent;
    }

    public void setDateOfRent(LocalDate dateOfRent) {
        this.dateOfRent = dateOfRent;
    }
    
        public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    @Override

    
    @Override
    public String toString() {
        return "id: " + id + ", title: " + title;
    }
}
