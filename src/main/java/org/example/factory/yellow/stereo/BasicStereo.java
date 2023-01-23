package org.example.factory.yellow.stereo;

import org.example.factory.yellow.component.Device;

import java.util.List;

public abstract class BasicStereo {
    protected List<Device> devices;

    public BasicStereo(){
        createStereo();
    }

    public abstract void createStereo();
}
