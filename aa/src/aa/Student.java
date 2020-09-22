
public class Student implements Comparable{

	private String name;
	private double gpa;
	
	public Student(String n, double g) {
		name=n;
		gpa=g;
	}
	
	public String getName() {
		return name;
	}
	
	public Double getGPA() {
		return gpa;
	}
	
	public String toString() {
		return "\n" + "Name: " + name + "\n" +"GPA: " + gpa + "\n";
	}
	
	public int compareTo(Object o){
		return ((Student)(o)).getName().compareTo(this.getName()); 
	}
	
	
}




