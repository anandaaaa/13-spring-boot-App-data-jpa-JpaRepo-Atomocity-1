package in.anand.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DoctorInfoEntity {
	
	@Id
	private Integer doctorId;
	private String doctorName;
	private String doctorFee;
	public Integer getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDoctorFee() {
		return doctorFee;
	}
	public void setDoctorFee(String doctorFee) {
		this.doctorFee = doctorFee;
	}
	@Override
	public String toString() {
		return "DoctorInfoEntity [doctorId=" + doctorId + ", doctorName=" + doctorName + ", doctorFee=" + doctorFee
				+ "]";
	}
	
	

}
