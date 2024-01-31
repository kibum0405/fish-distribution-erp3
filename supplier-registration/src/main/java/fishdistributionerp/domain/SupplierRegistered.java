package fishdistributionerp.domain;

import fishdistributionerp.domain.*;
import fishdistributionerp.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class SupplierRegistered extends AbstractEvent {

    private String supplierId;
    private String supplierName;
    private String contactNumber;
    private Address address;

    public SupplierRegistered(Supplier aggregate) {
        super(aggregate);
    }

    public SupplierRegistered() {
        super();
    }
}
//>>> DDD / Domain Event
