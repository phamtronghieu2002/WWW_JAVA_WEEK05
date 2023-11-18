package fit.iuh.edu.week05_lap_phamtronghieu.services;

import fit.iuh.edu.week05_lap_phamtronghieu.entities.Address;
import fit.iuh.edu.week05_lap_phamtronghieu.entities.Candidate;
import fit.iuh.edu.week05_lap_phamtronghieu.repositories.AddressRepository;
import fit.iuh.edu.week05_lap_phamtronghieu.repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class AdressService {
    @Autowired
    private AddressRepository candidateRepository;

    public Page<Address> findAll(int pageNo, int pageSize, String sortBy,
                                 String sortDirection) {
        Sort sort = Sort.by(Sort.Direction.fromString(sortDirection), sortBy);
        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
        return candidateRepository.findAll(pageable);
    }
}