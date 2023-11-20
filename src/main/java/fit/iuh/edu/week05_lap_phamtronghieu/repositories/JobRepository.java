package fit.iuh.edu.week05_lap_phamtronghieu.repositories;

import fit.iuh.edu.week05_lap_phamtronghieu.entities.Job;
import fit.iuh.edu.week05_lap_phamtronghieu.entities.JobSkill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobRepository extends JpaRepository<Job, Long> {
    public  abstract List<Job> findJobsByJobSkills(JobSkill jobSkill);
}