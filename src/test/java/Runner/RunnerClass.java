package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Kavya reddy\\CucumberTask\\src\\test\\resources\\Feature\\Contact.feature",
        glue="Steps"
)
public class RunnerClass
{

}
