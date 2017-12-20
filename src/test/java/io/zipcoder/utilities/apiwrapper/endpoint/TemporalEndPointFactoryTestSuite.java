package io.zipcoder.utilities.apiwrapper.endpoint;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by leon on 12/2/17.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        DailyEndPointFactory.class,
        IntradayEndPointFactoryTest.class,
        WeeklyEndPointFactoryTest.class,
        MonthlyEndPointFactoryTest.class
})
public class TemporalEndPointFactoryTestSuite {
}
