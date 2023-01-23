package org.example.factory.yellow;

import java.util.List;

public abstract class BasicStereo {
    protected List<Device> devices;

    public BasicStereo(){
        createStereo();
    }

    public abstract void createStereo();
}
