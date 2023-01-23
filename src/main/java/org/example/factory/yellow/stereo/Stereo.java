package org.example.factory.yellow.stereo;

import org.example.factory.yellow.component.Device;

import java.util.List;

public abstract class Stereo {
    protected List<Device> devices;

    public Stereo(){
        createStereo();
    }

    public abstract void createStereo();
}
