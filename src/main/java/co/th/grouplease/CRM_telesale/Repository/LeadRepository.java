package co.th.grouplease.CRM_telesale.Repository;

import co.th.grouplease.CRM_telesale.Entity.Lead;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeadRepository extends JpaRepository<Lead,Long> {

}
