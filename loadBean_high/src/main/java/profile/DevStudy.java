package profile;

public class DevStudy implements Study {
    @Override
    public void study() {
        System.out.println("当前调用的是dev的学习方法");
    }
}
