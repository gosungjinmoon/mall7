package mall.domain;

import mall.domain.Orderplace;
import mall.주문Application;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Order_table")
@Data

public class Order  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Integer id;

    @PostPersist
    public void onPostPersist(){


        Orderplace orderplace = new Orderplace(this);
        orderplace.publishAfterCommit();

    }

    public static OrderRepository repository(){
        OrderRepository orderRepository = 주문Application.applicationContext.getBean(OrderRepository.class);
        return orderRepository;
    }






}
