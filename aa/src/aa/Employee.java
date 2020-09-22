
public class Employee implements Comparable{

	private String name;
	private double salary;
	
	public Employee(String n, double s) {
		name=n;
		salary=s;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public String toString() {
		return "\n" + "Name: " + name + "\n" +"Salary: " + salary + "\n";
	}
	
	public int compareTo(Object obj) {
		if(((Employee)(obj)).getSalary()<(this.getSalary())){
			return -1;
		}
		if(((Employee)(obj)).getSalary()>(this.getSalary())){
			return 1;
		}
		else{
			return 0;
		}
	}
}
