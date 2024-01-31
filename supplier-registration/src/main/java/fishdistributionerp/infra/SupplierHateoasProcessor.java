package fishdistributionerp.infra;

import fishdistributionerp.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class SupplierHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Supplier>> {

    @Override
    public EntityModel<Supplier> process(EntityModel<Supplier> model) {
        return model;
    }
}
