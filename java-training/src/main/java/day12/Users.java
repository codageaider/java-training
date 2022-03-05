package day12;

import java.util.ArrayList;
import java.util.List;
/*
This class depends upon a concrete sorting object
And the user can provide the sorting method as per choice
(i) User of this class can provide what sorting algorithm to use.
(ii) Minimal changes to previous approach

sorting attribute object is provided by the user.
USers class dependends upon the concrete implmentation
of sorting interface.
This is called dependency Injection
You inject or provide a dependency from outside


 */
public class Users {
    private List<Integer> userID;
    private Sorting sorting;

    public Users(){
        userID = new ArrayList<>();
    }

    public Sorting getSorting() {
        return sorting;
    }

    // Setter Injection
    public void setSorting(Sorting sorting) {
        this.sorting = sorting;
    }

    // Constructor Injection
    public Users(Sorting _sorting){
        sorting=_sorting;
    }
    // User of this class has full control
    // over which sorting method to user.
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
