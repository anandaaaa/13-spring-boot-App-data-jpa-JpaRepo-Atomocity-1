package in.anand.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.anand.Entity.DoctorInfoEntity;
import in.anand.Entity.DoctorLocInfoEntity;
import in.anand.Repository.DoctorInfoRepo;
import in.anand.Repository.DoctorLocInfo;

@Service
public class ReadingDoctorinfo {
	
	@Autowired
	private  DoctorInfoRepo docinforepo;
	@Autowired
	private DoctorLocInfo doclocinfo;
	
@Transactional(rollbackOn = Exception.class)
 public void save()
 {
	 DoctorInfoEntity doctorInfoEntity = new DoctorInfoEntity();
	 doctorInfoEntity.setDoctorId(2);
	 doctorInfoEntity.setDoctorName("Ajay");
	 doctorInfoEntity.setDoctorFee("500");
	 
	 docinforepo.save(doctorInfoEntity);
	 
	 int i=10/0;
	 
	 DoctorLocInfoEntity doctorLocInfoEntity = new DoctorLocInfoEntity();
	 
	 doctorLocInfoEntity.setLocationId(2);
	 doctorLocInfoEntity.setDoctorCity("MTM");
	 doctorLocInfoEntity.setDoctorDistrict("krishna");
	 doctorLocInfoEntity.setDoctorState("AP");
	 doctorLocInfoEntity.setDoctorId(2);
	 doclocinfo.save(doctorLocInfoEntity);
	 
 }
	
	
}
