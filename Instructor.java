public class Instructor extends Person {
	//not inside the parent class
private double salary; 
//super(name, birth);
public Instructor(String name, int birth, String major, int salary) {
super(name, birth);
this.salary =  salary;
 
}

public String toString() {
return (super.toString() + salary);
}
}


