package in.anand.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DoctorLocInfoEntity {
	@Id
	private Integer LocationId;
	private String doctorCity;
	private String doctorDistrict;
	private String doctorState;
	private Integer doctorId;
	public Integer getLocationId() {
		return LocationId;
	}
	public void setLocationId(Integer locationId) {
		LocationId = locationId;
	}
	public String getDoctorCity() {
		return doctorCity;
	}
	public void setDoctorCity(String doctorCity) {
		this.doctorCity = doctorCity;
	}
	public String getDoctorDistrict() {
		return doctorDistrict;
	}
	public void setDoctorDistrict(String doctorDistrict) {
		this.doctorDistrict = doctorDistrict;
	}
	public String getDoctorState() {
		return doctorState;
	}
	public void setDoctorState(String doctorState) {
		this.doctorState = doctorState;
	}
	public Integer getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}
	@Override
	public String toString() {
		return "DoctorLocInfoEntity [LocationId=" + LocationId + ", doctorCity=" + doctorCity + ", doctorDistrict="
				+ doctorDistrict + ", doctorState=" + doctorState + ", doctorId=" + doctorId + "]";
	}
	

}
