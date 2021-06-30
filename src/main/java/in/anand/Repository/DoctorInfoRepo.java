package in.anand.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.anand.Entity.DoctorInfoEntity;

public interface DoctorInfoRepo extends JpaRepository<DoctorInfoEntity,Serializable> {

}
