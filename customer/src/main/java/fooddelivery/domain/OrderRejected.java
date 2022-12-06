package fooddelivery.domain;

import fooddelivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class OrderRejected extends AbstractEvent {

    private Long id;
    private String status;
    private String foodId;
    private String orderId;
    private String ord;
}
