package fit.iuh.edu.week05_lap_phamtronghieu.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Table(name="job")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Job {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id")
    private long id;



    @ManyToOne
    @JoinColumn(name = "com_id")
    private Company company;

    private String job_desc;

    private String job_name;




    @OneToMany(mappedBy = "job", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<JobSkill> jobSkills;

    public Job(Company company, String job_desc, String job_name, List<JobSkill> jobSkills) {
        this.company = company;
        this.job_desc = job_desc;
        this.job_name = job_name;
        this.jobSkills = jobSkills;
    }
}
