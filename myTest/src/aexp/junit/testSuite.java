package aexp.junit;

import junit.framework.TestSuite;
import testCase.StringTest20130204;

public class testSuite extends TestSuite
{
    public testSuite() 
    {
        addTestSuite( StringTest20130204.class );
    }
}
