package day12;

import java.util.ArrayList;
import java.util.List;

public class Users {
    private List<Integer> userID;
    private Sorting sorting;
    public Users(){
        userID = new ArrayList<>();
    }
    public void addSortingMethod(Sorting _sorting){
        sorting = _sorting;
    }
    public void addUser(Integer _userID){
        userID.add(_userID);
    }
    public void sort(){
        sorting.sort(userID);
    }
}
