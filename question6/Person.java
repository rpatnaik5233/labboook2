package question6;
public class Person extends Account {
 String name;
 public float age;
public Person()
{
}
public Person(String name, float age)
{
	super();
	this.name=name;
	this.age=age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getAge() {
	return age;
}
public void setAge(float age) {
	this.age = age;
}


public String toString()
{
	String text="Name:" +name+ "\n" + "Age: " +age+ "\n";
	return text;
}
}
