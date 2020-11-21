package exam.develop.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T0001_INSTRUCTOR")
public class InstructorEntity {

	@Id
	@SequenceGenerator(name = "seq_instructor", sequenceName = "INSTRUCTOR_SEQ", initialValue = 100000000, allocationSize = 100)
	@GeneratedValue(generator = "seq_instructor")
	@Column(name = "ID")
	private int idInstructor;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "EMAIL")
	private String email;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "INSTRUCTOR_DETAIL_ID")
	private InstructorDetailEntity idInstDet;

	public InstructorEntity() {

	}

	public InstructorEntity(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public int getIdInstructor() {
		return idInstructor;
	}

	public void setIdInstructor(int idInstructor) {
		this.idInstructor = idInstructor;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public InstructorDetailEntity getIdInstDet() {
		return idInstDet;
	}

	public void setIdInstDet(InstructorDetailEntity idInstDet) {
		this.idInstDet = idInstDet;
	}

	@Override
	public String toString() {
		return "InstructorEntity [idInstructor=" + idInstructor + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", idInstDet=" + idInstDet + "]";
	}



}
