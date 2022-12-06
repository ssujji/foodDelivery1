package fooddelivery.domain;

import fooddelivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class Delivered extends AbstractEvent {

    private Long id;
    private String status;
    private String orderId;
    private String address;
}
