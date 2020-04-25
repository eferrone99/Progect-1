package ferroneericfinalexam;
import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author Ferro
 */
public class CD extends Library {

    private String artist;
    private int numTracks;
    private static final int CHECKED_OUT_TIME = 14;
    public static final double FINE_PER_DAY = .50 + 2.00;
    public static final double FINE = 2.00;
    private LocalDate dueDate;

    public CD(int id, String title) {
        super(id, title);
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getNumTracks() {
        return numTracks;
    }

    public void setNumTracks(int numTracks) {
        this.numTracks = numTracks;
    }

    @Override

    @Override
    public String toString() {
        return super.toString() + "Artist: " + artist + "Number of Tracks: " + numTracks;
    }
}
