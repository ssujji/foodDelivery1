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
    @Autowired OrderInfoRepository orderInfoRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Picked'")
    public void wheneverPicked_KakaoNotice(@Payload Picked picked){

        Picked event = picked;
        System.out.println("\n\n##### listener KakaoNotice : " + picked + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CookFinished'")
    public void wheneverCookFinished_KakaoNotice(@Payload CookFinished cookFinished){

        CookFinished event = cookFinished;
        System.out.println("\n\n##### listener KakaoNotice : " + cookFinished + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CookStarted'")
    public void wheneverCookStarted_KakaoNotice(@Payload CookStarted cookStarted){

        CookStarted event = cookStarted;
        System.out.println("\n\n##### listener KakaoNotice : " + cookStarted + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderRejected'")
    public void wheneverOrderRejected_KakaoNotice(@Payload OrderRejected orderRejected){

        OrderRejected event = orderRejected;
        System.out.println("\n\n##### listener KakaoNotice : " + orderRejected + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderAccepted'")
    public void wheneverOrderAccepted_KakaoNotice(@Payload OrderAccepted orderAccepted){

        OrderAccepted event = orderAccepted;
        System.out.println("\n\n##### listener KakaoNotice : " + orderAccepted + "\n\n");


        

        // Sample Logic //

        

    }

}


