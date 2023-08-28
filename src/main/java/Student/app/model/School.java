package Student.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table
@Entity
@Data
public class School {
	
	@Id
	private String id;
	private String name;
	private String location;

}
