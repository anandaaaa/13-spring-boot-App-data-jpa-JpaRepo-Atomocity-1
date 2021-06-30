package in.anand.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.anand.Entity.DoctorLocInfoEntity;

public interface DoctorLocInfo extends JpaRepository<DoctorLocInfoEntity,Serializable> {

}
