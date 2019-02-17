import com.mycompany.app.my.BlackBoxTests;
import com.mycompany.app.my.WhiteBoxTests;
import junit.framework.TestResult;
import junit.framework.TestSuite;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner extends spock.lang.Specification{
    public static void main(String[] args) {

        Result result = JUnitCore.runClasses(JunitTestSuite.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
        System.out.println();
        System.out.println("*** Run tests with TestSuite ***");
        TestSuite suite = new TestSuite(BlackBoxTests.class, WhiteBoxTests.class, TestResult.class);
    }
}
