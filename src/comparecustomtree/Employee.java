package comparecustomtree;

public class Employee {
	
	private String name;
	private String designation;
    private int salary;
     
    public Employee(String n, int s,String d){
        this.name = n;
        this.salary = s;
        this.designation = d;
    }
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getDesignation() {
    	return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String toString(){
        return "Name: "+this.name+"- Salary: "+this.salary+"- Designation: "+this.designation;
    }

}
