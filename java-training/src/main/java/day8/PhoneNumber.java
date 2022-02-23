package day8;

public class PhoneNumber {
    private int id;
    private String number;
    private String serviceProvider;

    public PhoneNumber() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PhoneNumber(int id, String number, String serviceProvider) {
        this.id = id;
        this.number = number;
        this.serviceProvider = serviceProvider;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }
}
