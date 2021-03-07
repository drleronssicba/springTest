package condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class isDevCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //如果环境变量中含有dev字段 返回true 否则返回false
        if(conditionContext.getEnvironment().containsProperty("dev")) return true;
        return false;
    }
}
