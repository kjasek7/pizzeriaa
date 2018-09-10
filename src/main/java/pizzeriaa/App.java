package pizzeriaa;

import api.IOrder;
import config.AutoConfig;
import config.Config;
import implementation.Order;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);
        IOrder order = (IOrder)context.getBean(Order.class);
        order.printOrder();
    }
}
