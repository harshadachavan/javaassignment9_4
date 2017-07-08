package comparecustomtree;

import java.util.TreeSet;

public class CompareEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************ Sort By Salary ************");
		 //By using salary comparator (int comparison)
        TreeSet<Employee> salComp = new TreeSet<Employee>(new SalaryCompare());
        salComp.add(new Employee("Harshada",30000,"Caller"));
        salComp.add(new Employee("Sheetal",60000,"Teamlead"));
        salComp.add(new Employee("Ashwini",20000,"Helper"));
        salComp.add(new Employee("Tejal",24000,"Clerk"));
        for(Employee e:salComp){
            System.out.println(e);
        }
		
        System.out.println("************ Sort By Name ************");
		 //By using name comparator (String comparison)
        TreeSet<Employee> nameComp = new TreeSet<Employee>(new NameCompare());
        nameComp.add(new Employee("Harshada",30000,"Caller"));
        nameComp.add(new Employee("Sheetal",60000,"Teamlead"));
        nameComp.add(new Employee("Ashwini",20000,"Helper"));
        nameComp.add(new Employee("Tejal",24000,"Clerk"));
        for(Employee e:nameComp){
            System.out.println(e);
        }
        
        System.out.println("************ Sort By Designation ************");
		 //By using name comparator (String comparison)
       TreeSet<Employee> desiComp = new TreeSet<Employee>(new DesignationCompare());
       desiComp.add(new Employee("Harshada",30000,"Caller"));
       desiComp.add(new Employee("Sheetal",60000,"Teamlead"));
       desiComp.add(new Employee("Ashwini",20000,"Helper"));
       desiComp.add(new Employee("Tejal",24000,"Clerk"));
       for(Employee e:desiComp){
           System.out.println(e);
       }
        
       

	}

}
