package fit.iuh.edu.week05_lap_phamtronghieu.repositories;

import fit.iuh.edu.week05_lap_phamtronghieu.entities.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}