package fooddelivery.domain;

import fooddelivery.domain.ReviewWritten;
import fooddelivery.CustomerApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="OrderInfo_table")
@Data

public class OrderInfo  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Boolean reviewYn;
    
    
    
    
    
    private String orderId;
    
    
    
    
    
    private String storeId;

    @PostPersist
    public void onPostPersist(){


        ReviewWritten reviewWritten = new ReviewWritten(this);
        reviewWritten.publishAfterCommit();

    }

    public static OrderInfoRepository repository(){
        OrderInfoRepository orderInfoRepository = CustomerApplication.applicationContext.getBean(OrderInfoRepository.class);
        return orderInfoRepository;
    }






}
