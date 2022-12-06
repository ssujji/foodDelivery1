package fooddelivery.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="MeansOfDelivery_table")
@Data
public class MeansOfDelivery {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private String deliveryType;


}
