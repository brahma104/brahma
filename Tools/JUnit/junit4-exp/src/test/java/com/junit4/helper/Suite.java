package com.junit4.helper;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(org.junit.runners.Suite.class)
@SuiteClasses({ ArrayHelperTest.class, NumberTest.class, FileReaderTest.class, WordProcessorTest.class })
public class Suite {

}
