package odev4;

public class yeniuye {
private int id;
private String name;
private String lastname;
private String tc;
private String doğumyılı;
public  yeniuye(int id, String name, String lastname, String tc, String doğumyılı) {
	super();
	this.id = id;
	this.name = name;
	this.lastname = lastname;
	this.tc = tc;
	this.doğumyılı = doğumyılı;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getTc() {
	return tc;
}
public void setTc(String tc) {
	this.tc = tc;
}
public String getDoğumyılı() {
	return doğumyılı;
}
public void setDoğumyılı(String doğumyılı) {
	this.doğumyılı = doğumyılı;
}

}
