package fishdistributionerp.domain;

import fishdistributionerp.SupplierRegistrationApplication;
import fishdistributionerp.domain.SupplierRegistered;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Supplier_table")
@Data
//<<< DDD / Aggregate Root
public class Supplier {

    @Id
    private String supplierId;

    private String supplierName;

    private String contactNumber;

    private Address address;

    @PostPersist
    public void onPostPersist() {
        SupplierRegistered supplierRegistered = new SupplierRegistered(this);
        supplierRegistered.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static SupplierRepository repository() {
        SupplierRepository supplierRepository = SupplierRegistrationApplication.applicationContext.getBean(
            SupplierRepository.class
        );
        return supplierRepository;
    }
}
//>>> DDD / Aggregate Root
