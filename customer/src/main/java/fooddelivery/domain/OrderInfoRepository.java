package fooddelivery.domain;

import fooddelivery.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="orderInfos", path="orderInfos")
public interface OrderInfoRepository extends PagingAndSortingRepository<OrderInfo, Long>{

}
