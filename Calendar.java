package HustBookStore;

public class Calendar {
    private int day;
    private int month;
    private int year;

    public Calendar(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getCalendar() {
        return day + "/" + month + "/" + year;
    }

    public void displayDate() {
        System.out.println("Date: " + getCalendar());
    }
}
