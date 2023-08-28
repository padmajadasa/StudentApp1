package Student.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_student")
public class Student {
	@Id
	   private String id;
	   private String name;
	   private String phoneNumner;
	   private String section;
	   private String address;
	   private String schoolName;
	public String getId() {
		return id;
	}
	public void setId(String l) {
		this.id = l;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumner() {
		return phoneNumner;
	}
	public void setPhoneNumner(String phoneNumner) {
		this.phoneNumner = phoneNumner;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	   
	   
	}
