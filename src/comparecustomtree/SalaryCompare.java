package comparecustomtree;

import java.util.Comparator;
//The Comparator implementation holds the sorting logic.
public class SalaryCompare implements Comparator<Employee> {
	// override compare() method to provide the sorting logic on user defined objects.
	 @Override
	    public int compare(Employee e1, Employee e2) {
	        if(e1.getSalary() > e2.getSalary()){
	            return 1;
	        } else {
	            return -1;
	        }
	    }
}
