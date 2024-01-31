package fishdistributionerp.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class RegisterSupplierCommand {

    private String supplierId;
    private String supplierName;
    private String contactNumber;
    private Address address;
}
