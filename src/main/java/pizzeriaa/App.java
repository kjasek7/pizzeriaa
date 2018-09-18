package pizzeriaa;

import api.IOrder;
import config.AutoConfig;
import implementation.Order;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);
        IOrder order = (IOrder)context.getBean(IOrder.class);
        order.printOrder();
        IOrder order1 = (IOrder) context.getBean(Order.class);
        order1.printOrder();
    }
}
