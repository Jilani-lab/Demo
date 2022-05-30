package stream;

import java.util.List;

public class Employe {
	
private int eid;
private String name;
private double salary;

public Employe() {

}
public Employe(int eid, String name, double salary) {
	
	this.eid = eid;
	this.name = name;
	this.salary = salary;

}
@Override
public String toString() {
	return "Employe [eid=" + eid + ", name=" + name + ", salary=" + salary +  "]";
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}


}
