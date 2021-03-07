package condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
public class ConditionalConfig {

    @Bean
    @Conditional(isDevCondition.class)
    public Study deStudy(){
        return new DevStudy();
    }

    @Bean
    @Profile("test")
    public Study teStudy(){
        return  new TestStudy();
    }
}

