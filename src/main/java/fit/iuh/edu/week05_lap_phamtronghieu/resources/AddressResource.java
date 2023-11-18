package fit.iuh.edu.week05_lap_phamtronghieu.resources;


import fit.iuh.edu.week05_lap_phamtronghieu.entities.Address;
import fit.iuh.edu.week05_lap_phamtronghieu.repositories.AddressRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AddressResource {

    private final AddressRepository repository;


    AddressResource(AddressRepository repository) {
        this.repository = repository;
    }


    @GetMapping("/addresses")
    @ResponseBody
    List<Address>  all() {
        return repository.findAll();
    }


    @GetMapping("/addresses/{id}")
    @ResponseBody
     Address getAddressById(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new AddressNotFoundException(id));
    }

}
