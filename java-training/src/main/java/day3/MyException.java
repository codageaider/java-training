package day3;

public class MyException extends Exception {
    private Double num;
    private Double denom;

    public MyException(Double _num, Double _denom) {
             num=_num;
             denom=_denom;
    }

    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
    }

    public Double getDenom() {
        return denom;
    }

    public void setDenom(Double denom) {
        this.denom = denom;
    }


}
