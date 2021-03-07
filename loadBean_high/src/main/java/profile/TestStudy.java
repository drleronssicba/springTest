package profile;

public class TestStudy implements Study{
    @Override
    public void study() {
        System.out.println("当前调用的是test的学习方法");
    }
}
