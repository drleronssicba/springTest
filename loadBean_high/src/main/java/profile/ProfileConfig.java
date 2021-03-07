package profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {
    @Bean
    @Profile("dev")
    public Study deStudy(){
        return new DevStudy();
    }

    @Bean
    @Profile("test")
    public Study teStudy(){
        return  new TestStudy();
    }
}

