package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrdePlaced extends AbstractEvent {

    private Long id;
    private String foodId;
    private Object options;
    private String address;
    private String customerId;
    private String deliveryType;
    private String storeId;
}


