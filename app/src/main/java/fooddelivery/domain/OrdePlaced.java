package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrdePlaced extends AbstractEvent {

    private Long id;
    private String foodId;
    private List<String> options;
    private String address;
    private String customerId;
    private String deliveryType;
    private String storeId;

    public OrdePlaced(Order aggregate){
        super(aggregate);
    }
    public OrdePlaced(){
        super();
    }
}
