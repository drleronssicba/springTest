package primaryAndQualify;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author ：tx
 * @description：@Primary和@Qualifier的配置类
 * @date ：Created in 2019/1/5 20:41
 * @modified By：
 * @version: 1.0
 */
@Configuration
public class PrimaryConfig {

    @Bean
   // @Primary
    public Study study(){
        return new TestStudy();
    }

    @Book
    @Bean
    public Study devStudy(){
        return new DevStudy();
    }
}
