package comparecustomtree;

import java.util.Comparator;

public class DesignationCompare implements Comparator<Employee> {
	
	@Override
    public int compare(Employee e1, Employee e2) {
        return e1.getDesignation().compareTo(e2.getDesignation());
    }

}
