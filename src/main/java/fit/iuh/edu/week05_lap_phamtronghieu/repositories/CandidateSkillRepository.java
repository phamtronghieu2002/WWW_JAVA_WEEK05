package fit.iuh.edu.week05_lap_phamtronghieu.repositories;

import fit.iuh.edu.week05_lap_phamtronghieu.entities.CandidateSkill;
import fit.iuh.edu.week05_lap_phamtronghieu.ids.CandidateSkillID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateSkillRepository extends JpaRepository<CandidateSkill, CandidateSkillID> {
}