public class Scholar extends Person {
	//not inside the parent class
private String major;

public Scholar(String name, int birth, String major) {
super(name, birth);
this.major =  major;
 
}

public String toString() {

//you can also do super.name or super.birth
//adding the major because it will first print the name and birth 
return ("The scholars name and birth is " + super.toString() + ". The scholars major is " + major);
}
}
