package NewProject.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:pwdfeatures",
        glue = "NewProject.Base",
        dryRun = false


)

public class Runner {
}
