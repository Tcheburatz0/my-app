import com.mycompany.app.my.BlackBoxTests;
import com.mycompany.app.my.WhiteBoxTests;
import junit.framework.TestResult;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestCaseTest.class,
        TestResult.class,
        BlackBoxTests.class,
        WhiteBoxTests.class
})

public class JunitTestSuite {
}
