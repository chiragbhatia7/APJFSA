package Encapsulation;

class Student {
	private int sid;
	private String name;
	private String email;
	private long phoneNo;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

}

public class Encapsulation {

	public static void main(String[] args) {
		Student s = new Student();
		s.setSid(1);
		s.setName("David");
		s.setEmail("dmalan@gmail.com");
		s.setPhoneNo(2132223475);
		System.out.println(s.getSid() + "\n" + s.getName() + "\n" + s.getEmail() + "\n" + s.getPhoneNo());
	}

}
