package fooddelivery.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import fooddelivery.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import fooddelivery.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired DeliveryRepository deliveryRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrdePlaced'")
    public void wheneverOrdePlaced_CopyOrderInfo(@Payload OrdePlaced ordePlaced){

        OrdePlaced event = ordePlaced;
        System.out.println("\n\n##### listener CopyOrderInfo : " + ordePlaced + "\n\n");


        

        // Sample Logic //
        Delivery.copyOrderInfo(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CookStarted'")
    public void wheneverCookStarted_UpdateStatus(@Payload CookStarted cookStarted){

        CookStarted event = cookStarted;
        System.out.println("\n\n##### listener UpdateStatus : " + cookStarted + "\n\n");


        

        // Sample Logic //
        Delivery.updateStatus(event);
        

        

    }

}


