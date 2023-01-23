package org.example.factory.yellow.creational;

import org.example.factory.yellow.stereo.Stereo;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class StereoFactoryTest {

    private final Logger logger = LoggerFactory.getLogger(StereoFactoryTest.class);

    @Test
    public void testDemo() {
        Stereo stereo = StereoFactory.getStereo(StereoType.CLASSIC);
        stereo.getDevices().forEach(device -> logger.info(device.getDescription()));
    }
}
