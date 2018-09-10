package config;

import api.IOrder;
import api.IPizza;
import implementation.ExoticPizza;
import implementation.GoodPizza;
import implementation.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public IPizza pizza(){
        return new ExoticPizza(19,"Exotic");
    }

//    @Bean(name = "Iorder")
//    public IOrder order(IPizza pizza){
//        return  new Order(pizza);
//    }
}
