package implementation;

import api.IPizza;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class ExoticPizza implements IPizza {
    private int price;
    private String name;

    public ExoticPizza(@Value("12") int price,@Value("Exotic") String name) {
        super();
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }
}
