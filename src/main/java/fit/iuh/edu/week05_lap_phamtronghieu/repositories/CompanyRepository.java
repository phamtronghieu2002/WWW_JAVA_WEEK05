package fit.iuh.edu.week05_lap_phamtronghieu.repositories;

import fit.iuh.edu.week05_lap_phamtronghieu.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompanyRepository extends JpaRepository<Company, Long> {


}