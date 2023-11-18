package fit.iuh.edu.week05_lap_phamtronghieu.ids;



import fit.iuh.edu.week05_lap_phamtronghieu.entities.Candidate;
import fit.iuh.edu.week05_lap_phamtronghieu.entities.Skill;

import java.io.Serializable;

public class CandidateSkillID implements Serializable {

    private Skill skill;
    private Candidate candidate;
}
