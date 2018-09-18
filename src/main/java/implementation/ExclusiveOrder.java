package implementation;

import api.IOrder;
import api.IPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ExclusiveOrder implements IOrder {

    private IPizza pizza;

    public ExclusiveOrder(){
        super();
    }

    public void printOrder() {
        System.out.println("Zamówienie exclusive: " +pizza.getName()+" Cena: " +pizza.getPrice());
    }

    public IPizza getPizza() {
        return pizza;
    }

    @Autowired
    public void setPizza(IPizza pizza) {
        pizza.setPrice(23);
        this.pizza = pizza;
    }

}
