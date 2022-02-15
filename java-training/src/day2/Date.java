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
// Date date = new Date(30,2,2022) <-- this is an invalid
    // feb doesnot have 30 days

    private boolean validate(int day, int month, int year) {
        boolean isValid = true;

//        if(months that have 31 days){
//            if(day>31)
//                isValid=false;
//        }
//        if(months that have 30 days){
//            if(day>30)
//                isValid=false;
//        }
//        else if(isLeapYear(year) && day>29 || !isLeapYear(year) && day >28)
//            isValid=false;
//        else if(month<=0 || month>12)
//            isValid=false;
//        else if(year<=0)
//            isValid=false;
        return isValid;
    }
// write a class that represents a student
    // write a person class
    // write a faculty class
}
