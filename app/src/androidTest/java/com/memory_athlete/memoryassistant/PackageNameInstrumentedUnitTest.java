package com.memory_athlete.memoryassistant;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import org.junit.Test;
import org.junit.runner.RunWith;

import static com.memory_athlete.memoryassistant.TestHelper.waitForExecution;
import static org.junit.Assert.assertEquals;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

@RunWith(AndroidJUnit4ClassRunner.class)
public class PackageNameInstrumentedUnitTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        // No longer useful
        assertEquals("com.memory_athelte.memoryassistant", appContext.getPackageName());

        waitForExecution();
    }
}
