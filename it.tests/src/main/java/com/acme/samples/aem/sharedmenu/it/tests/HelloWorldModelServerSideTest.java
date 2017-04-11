package com.acme.samples.aem.sharedmenu.it.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.apache.sling.junit.annotations.SlingAnnotationsTestRunner;
import org.apache.sling.junit.annotations.TestReference;
import org.apache.sling.settings.SlingSettingsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.acme.samples.aem.sharedmenu.core.models.HelloWorldModel;

/** 
 *  Test case which uses OSGi services injection
 *  to get hold of the HelloWorldModelServerSideTest which 
 *  it wants to test server-side. 
 */
@RunWith(SlingAnnotationsTestRunner.class)
public class HelloWorldModelServerSideTest {

    @TestReference
    private HelloWorldModel hello;

    @TestReference
    private SlingSettingsService settings;

    @Test
    public void testHelloWorldModelServerSide() throws Exception {
        assertNotNull(
                "Expecting HelloWorldModel to be injected by Sling test runner",
                hello);

        assertNotNull("Expecting the slingsettings to be injected by Sling test runner", settings);

        assertTrue("Expecting the HelloWorldModel to return the slingId as part of the message", 
                hello.getMessage().contains(settings.getSlingId()));
    }
}
