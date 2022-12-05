package mall.common;


import mall.BoundedContext1073Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext1073Application.class })
public class CucumberSpingConfiguration {
    
}
