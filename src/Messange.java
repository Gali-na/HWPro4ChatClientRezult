import java.util.Date;

public class Messange {
    private Date date = new Date();
    private static String name;
    private String to;
    private String text;

    public Messange(Date date, String name, String to, String text) {
        this.date = date;
        this.name = name;
        this.to = to;
        this.text = text;
    }

    public Messange() {

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Messange{" +
                "date=" + date +
                ", to='" + to + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
