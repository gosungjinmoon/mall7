package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Orderplace extends AbstractEvent {

    private Long id;

    public Orderplace(Order aggregate){
        super(aggregate);
    }
    public Orderplace(){
        super();
    }
}
