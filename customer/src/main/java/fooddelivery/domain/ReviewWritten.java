package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class ReviewWritten extends AbstractEvent {

    private Long id;
    private Boolean reviewYn;
    private String orderId;
    private String storeId;

    public ReviewWritten(OrderInfo aggregate){
        super(aggregate);
    }
    public ReviewWritten(){
        super();
    }
}
