package com.mulesoft.training;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class HelloMavenTest extends FunctionalTestCase {

    @Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
        runFlowAndExpect("mavenFlow", "Hello World");
    }
    
    @Test
    public void flightsReturnsValue() throws Exception {
    	runFlowAndExpect("retrieveFlights", "[{\"DESTINATION\":\"SFO\",\"PRICE\":555,\"ORIGIN\":\"YYZ\",\"ID\":0},{\"DESTINATION\":\"LAX\",\"PRICE\":450,\"ORIGIN\":\"YYZ\",\"ID\":1},{\"DESTINATION\":\"SEA\",\"PRICE\":777,\"ORIGIN\":\"SQL\",\"ID\":2},{\"DESTINATION\":\"SFO\",\"PRICE\":999,\"ORIGIN\":\"SQL\",\"ID\":3}]");
    }
    
    @Override
    protected String getConfigFile() {
        return "maven-project.xml";
    }

}
