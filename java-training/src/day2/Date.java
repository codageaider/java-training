package day2;

public class Date {
    private int day;
    private int month;
    private int year;


    public Date(int day, int month, int year) throws Exception {
        if(!validate(day, month, year))
            throw new Exception("Invalid date parameters");
        this.day = day;
        this.month = month;
        this.year = year;
    }

    private boolean validate(int day, int month, int year) {
        boolean isValid = true;
        if(day<=0 || day >31)
            isValid=false;
        else if(month<=0 || month>12)
            isValid=false;
        else if(year<=0)
            isValid=false;
        return isValid;
    }

}
