package fit.iuh.edu.week05_lap_phamtronghieu.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@EqualsAndHashCode(of={"id"})
@Table(name="company")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Company {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "com_id")
    private long id;

    @OneToOne
    @JoinColumn(name = "add_id")
    private Address address;



    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Job> jobs;

    private String about;

    private String comp_name;
    private String email;

    private String phone;

    private String web_url;

    public Company(Address address, List<Job> jobs, String about, String comp_name, String email, String phone, String web_url) {
        this.address = address;
        this.jobs = jobs;
        this.about = about;
        this.comp_name = comp_name;
        this.email = email;
        this.phone = phone;
        this.web_url = web_url;
    }
}
