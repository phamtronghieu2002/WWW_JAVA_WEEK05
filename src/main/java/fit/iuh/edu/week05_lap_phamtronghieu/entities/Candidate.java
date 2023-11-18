package fit.iuh.edu.week05_lap_phamtronghieu.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "Candidate")
@EqualsAndHashCode(of={"id"})
@NoArgsConstructor
@AllArgsConstructor
public class Candidate {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "can_id")

    private long id;
    private String phone;
    private LocalDate dod;
    private String email;

    @Column(name = "full_name")
    private String fullname;

    @OneToOne
    @JoinColumn(name = "add_id")
    private Address address;

    @OneToMany(mappedBy = "candidate", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Experience> experiences;

    @OneToMany(mappedBy = "candidate", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<CandidateSkill> candidateSkills;

    public Candidate(String phone, LocalDate dod, String email, String fullname, Address address, List<Experience> experiences) {
        this.phone = phone;
        this.dod = dod;
        this.email = email;
        this.fullname = fullname;
        this.address = address;
        this.experiences = experiences;
    }


}
