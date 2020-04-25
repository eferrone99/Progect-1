package ferroneericfinalexam;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Ferro
 */
public class DVD extends Library {

    private String director;
    private int duration;
    private static final int CHECKED_OUT_TIME = 7;
    public static final double FINE_PER_DAY = .50;
    public static final double FINE = 2.00;
    private LocalDate dueDate;

    public DVD(int id, String title) {
        super(id, title);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override

    @Override
    public String toString() {
        return super.toString() + "Director: " + director + "Duration: " + duration;
    }
}
