package fooddelivery.domain;

import fooddelivery.domain.Paid;
import fooddelivery.AppApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Payment_table")
@Data

public class Payment  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String orderId;
    
    
    
    
    
    private String status;

    @PostPersist
    public void onPostPersist(){


        Paid paid = new Paid(this);
        paid.publishAfterCommit();

    }

    public static PaymentRepository repository(){
        PaymentRepository paymentRepository = AppApplication.applicationContext.getBean(PaymentRepository.class);
        return paymentRepository;
    }




    public static void pay(OrdePlaced ordePlaced){

        /** Example 1:  new item 
        Payment payment = new Payment();
        repository().save(payment);

        Paid paid = new Paid(payment);
        paid.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(ordePlaced.get???()).ifPresent(payment->{
            
            payment // do something
            repository().save(payment);

            Paid paid = new Paid(payment);
            paid.publishAfterCommit();

         });
        */

        
    }


}
