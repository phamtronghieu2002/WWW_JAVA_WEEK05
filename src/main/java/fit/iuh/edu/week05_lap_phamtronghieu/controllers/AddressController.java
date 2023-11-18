package fit.iuh.edu.week05_lap_phamtronghieu.controllers;



import fit.iuh.edu.week05_lap_phamtronghieu.entities.Address;
import fit.iuh.edu.week05_lap_phamtronghieu.entities.Candidate;
import fit.iuh.edu.week05_lap_phamtronghieu.repositories.AddressRepository;
import fit.iuh.edu.week05_lap_phamtronghieu.repositories.CandidateRepository;
import fit.iuh.edu.week05_lap_phamtronghieu.services.AdressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class AddressController {


    @Autowired
    private AddressRepository addressRepository;


    @Autowired
    private AdressService adressService;
    @GetMapping("/listAddress")
    public String showCandidateList(Model model) {
        model.addAttribute("addresses",addressRepository.findAll());
        return "address/addresses";
    }

    @GetMapping("/candidates")
    public String showCandidateListPaging(Model model,
                                          @RequestParam("page") Optional<Integer> page,
                                          @RequestParam("size") Optional<Integer> size) {
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(10);
        Page<Address> candidatePage= adressService.findAll(
                currentPage - 1,pageSize,"id","asc");
        model.addAttribute("AddressPage", candidatePage);
        int totalPages = candidatePage.getTotalPages();
        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        return "address/addressPaging";
    }

}
