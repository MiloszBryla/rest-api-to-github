package rafal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Bean
    public Matrix matrix() {
        return new Matrix(quarter());
    }

    @Bean
    public Quarter quarter() {
        return new Quarter(item());
    }

    @Bean
    public Item item() {
        return new Item("codebooks");
    }


}
