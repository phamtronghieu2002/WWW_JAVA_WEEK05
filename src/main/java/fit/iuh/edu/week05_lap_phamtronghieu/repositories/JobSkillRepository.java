package fit.iuh.edu.week05_lap_phamtronghieu.repositories;

import fit.iuh.edu.week05_lap_phamtronghieu.entities.JobSkill;
import fit.iuh.edu.week05_lap_phamtronghieu.ids.JobSkillID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSkillRepository extends JpaRepository<JobSkill, JobSkillID> {
}