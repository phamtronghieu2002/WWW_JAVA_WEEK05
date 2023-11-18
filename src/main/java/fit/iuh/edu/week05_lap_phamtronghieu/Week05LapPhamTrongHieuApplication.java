package fit.iuh.edu.week05_lap_phamtronghieu;

import fit.iuh.edu.week05_lap_phamtronghieu.emums.CountryCode;
import fit.iuh.edu.week05_lap_phamtronghieu.entities.Address;
import fit.iuh.edu.week05_lap_phamtronghieu.entities.Candidate;
import fit.iuh.edu.week05_lap_phamtronghieu.repositories.AddressRepository;
import fit.iuh.edu.week05_lap_phamtronghieu.repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Random;

@SpringBootApplication
public class Week05LapPhamTrongHieuApplication {



    public static void main(String[] args) {
        SpringApplication.run(Week05LapPhamTrongHieuApplication.class, args);
    }
    @Autowired
    private CandidateRepository candidateRepository;
    @Autowired
    private AddressRepository addressRepository;
//    @Bean
    CommandLineRunner initData(){
        return args -> {
            Random rnd =new Random();
            for (int i = 1; i < 1000; i++) {
                Address add = new Address(rnd.nextInt(1,1000)+"","Quang Trung","HCM",
                        rnd.nextInt(70000,80000)+"", CountryCode.VN );
                addressRepository.save(add);
            }
        };
    }
}
