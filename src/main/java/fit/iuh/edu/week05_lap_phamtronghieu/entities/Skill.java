package fit.iuh.edu.week05_lap_phamtronghieu.entities;


import fit.iuh.edu.week05_lap_phamtronghieu.emums.SkillType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@EqualsAndHashCode(of={"id"})
@Table(name="skill")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Skill {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private long id;

    private String skill_name;

    private String skill_desc;

    private SkillType type;

    @OneToMany(mappedBy = "skill", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<JobSkill> jobSkills;


    //constructor


    public Skill(String skill_name, String skill_desc, SkillType type) {
        this.skill_name = skill_name;
        this.skill_desc = skill_desc;
        this.type = type;
    }
}
