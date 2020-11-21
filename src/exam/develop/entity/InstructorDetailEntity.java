package exam.develop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T0002_INSTRUCTOR_DETAIL")
public class InstructorDetailEntity {

	@Id
	@SequenceGenerator(name = "seq_instDet", sequenceName = "INSTRUCTOR_DET_SEQ", initialValue = 100000000, allocationSize = 100)
	@GeneratedValue(generator = "seq_instDet")
	@Column(name = "ID")
	private int idInstDet;

	@Column(name = "YOUTUBE_CHANEL")
	private String youtubeChanel;

	@Column(name = "HOBBY")
	private String hobby;

	public InstructorDetailEntity() {

	}

	public InstructorDetailEntity(String youtubeChanel, String hobby) {
		this.youtubeChanel = youtubeChanel;
		this.hobby = hobby;
	}

	public int getIdInstDet() {
		return idInstDet;
	}

	public void setIdInstDet(int idInstDet) {
		this.idInstDet = idInstDet;
	}

	public String getYoutubeChanel() {
		return youtubeChanel;
	}

	public void setYoutubeChanel(String youtubeChanel) {
		this.youtubeChanel = youtubeChanel;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "InstructorDetailEntity [idInstDet=" + idInstDet + ", youtubeChanel=" + youtubeChanel + ", hobby="
				+ hobby + "]";
	}

}
