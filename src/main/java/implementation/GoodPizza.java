package implementation;

import api.IPizza;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@PropertySource("classpath:properties/ceny.properties")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class GoodPizza implements IPizza {
    private  int price;
    private String name;

    public GoodPizza(@Value("${cena_egzotycznej}") int price,@Value("${nazwa}") String name){
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
