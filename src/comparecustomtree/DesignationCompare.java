package comparecustomtree;

import java.util.Comparator;
//The Comparator implementation holds the sorting logic.
public class DesignationCompare implements Comparator<Employee> {
	// override compare() method to provide the sorting logic on user defined objects.
	@Override
    public int compare(Employee e1, Employee e2) {
        return e1.getDesignation().compareTo(e2.getDesignation());
    }

}
