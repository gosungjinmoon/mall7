package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DeliverStarted extends AbstractEvent {

    private Long id;

    public DeliverStarted(){
        super();
    }
}
