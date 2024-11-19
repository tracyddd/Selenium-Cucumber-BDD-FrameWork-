package stepDefinitions;

import org.example.SampleService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SampleStepDefinitions {

    @Test
    public void testGreeting1() {
        // 创建 SampleService 类的实例
        SampleService sampleService = new SampleService();

        // 调用 getGreeting 方法并验证输出
        String greeting = sampleService.getGreeting("Alice");
        Assertions.assertEquals("Hello,Alice!", greeting);
    }
    @Test
    public void aestGreeting2() {
        // 创建 SampleService 类的实例
        SampleService sampleService = new SampleService();

        // 调用 getGreeting 方法并验证输出
        String greeting = sampleService.getGreeting("Alex");
        Assertions.assertEquals("Hello,Aleex!", greeting);

    }

    @Test
    public void testGreeting3(){
        System.out.println("test successfully");
    };
}
