package be;

public class ChartData {

    private String string;
    private int absencesPercent;

    public ChartData(String string, int absencesPercent) {
        this.string = string;
        this.absencesPercent = absencesPercent;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int getAbsencesPercent() {
        return absencesPercent;
    }

    public void setAbsencesPercent(int absencesPercent) {
        this.absencesPercent = absencesPercent;
    }
}
