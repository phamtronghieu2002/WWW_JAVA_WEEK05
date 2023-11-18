package fit.iuh.edu.week05_lap_phamtronghieu.resources;

public class AddressNotFoundException extends RuntimeException {
    public AddressNotFoundException(Long id) {
        super("Address not found with id: " + id);
    }
}
