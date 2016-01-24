package pl.lodz.p.ftims.pai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.lodz.p.ftims.pai.domain.Transit;

import java.util.List;

/**
 * Spring Data JPA repository for the Transit entity.
 */
public interface TransitRepository extends JpaRepository<Transit,Long> {

    @Query("SELECT t FROM Transit t WHERE t.departureDepartment.id = ?1")
    List<Transit> findByDepartmentId(long departmentId);

}
