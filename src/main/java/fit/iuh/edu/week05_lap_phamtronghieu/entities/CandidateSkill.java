package fit.iuh.edu.week05_lap_phamtronghieu.entities;


import fit.iuh.edu.week05_lap_phamtronghieu.emums.SkillLevel;
import fit.iuh.edu.week05_lap_phamtronghieu.ids.CandidateSkillID;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@EqualsAndHashCode(of={"id"})
@Table(name="candidate_skill")
@IdClass(value = CandidateSkillID.class)
@NoArgsConstructor
@AllArgsConstructor
@Data

public class CandidateSkill {

    @Id
    @ManyToOne
    @JoinColumn(name = "can_id" , referencedColumnName = "can_id")
    private Candidate candidate;



    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;


    @Column(name = "skill_level")
    private SkillLevel SkllLevel;

    @Column(name = "more_infos")
    private String moreInfor;




}
