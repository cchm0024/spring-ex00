package core.test3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //우선 받기
public class FireSword implements Sword{

}
