package TopEducation.TopEducationApp.repositories;

import TopEducation.TopEducationApp.entities.InstallmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstallmentRepository extends JpaRepository<InstallmentEntity, Long> {
    // Custom query's here

    // Custom query to find all installments for a given student and
    // save them in a list
    @Query("SELECT e FROM InstallmentEntity e WHERE e.installmentRUT = :installmentRUT")
    List<InstallmentEntity> findAllInstallmentsByRUT(@Param("installmentRUT") String installmentRUT);

    // Custom query to find all paid installments for a given student and
    // save them in a list
    @Query("SELECT e FROM InstallmentEntity e WHERE e.installmentRUT = :installmentRUT AND e.installmentStatus = 1")
    List<InstallmentEntity> findAllPaidInstallmentsByRUT(@Param("installmentRUT") String installmentRUT);

    // Custom query to find all overdue installments for a given student and
    // save them in a list
    @Query("SELECT e FROM InstallmentEntity e WHERE e.installmentRUT = :installmentRUT AND e.installmentOverdueStatus = 1")
    List<InstallmentEntity> findAllOverdueInstallmentsByRUT(@Param("installmentRUT") String installmentRUT);

}
