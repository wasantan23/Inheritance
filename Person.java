//Tanisha Wasan 
public class Person {
private String name;
private int birth; 
//super reference to the parent class in the constructor 
//how do we pass in the major or the salary 
//how do we build a person and scholar at the same time 
public Person(String name, int birth) {
	//super(name, birth);
//his.major = major;
this.name = name;
this.birth = birth;
}
/*
public class Scholar extends Person {
	//not inside the parent class
private String major;

public Scholar(String name, int birth, String major) {
super(name, birth);
this.major =  major;
 
}
*/

//you need to make a toString method because you cannot print out an object. If you print out an obkect, it will print its memory location. 
// a toString method can be called in multiple ways 
public String toString() {
	//System.out.println();
	//super reference the name 
	//you need to return in the toString method
	//return ("The scholars name is" + super.name);
	return ("The scholars name is" + name + ". The scholars birthday is" + birth);
	//return ("The scholars year of birth is" + super.birth); 
	//return ("The scholars major is" + major): 
	//return ("The scholars salaray is" + salary);
}
}
 /*
public class Instructor extends Person {
	//not inside the parent class
private double salary; 
//super(name, birth);
this.salary = salary;
}
*/
