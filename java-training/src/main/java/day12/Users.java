package day12;

import java.util.ArrayList;
import java.util.List;

public class Users {
    private List<Integer> userID;
    private BubbleSort bubbleSort;
    public Users(){
        userID = new ArrayList<>();
        bubbleSort = new BubbleSort();
    }
    public void addUser(Integer _userID){
        userID.add(_userID);
    }
    public void sort(){
        bubbleSort.sort(userID);
    }
}
