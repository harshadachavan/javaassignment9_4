package comparecustomtree;

import java.util.Comparator;
//The Comparator implementation holds the sorting logic.
public class NameCompare implements Comparator<Employee>{
	
	@Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }

}
