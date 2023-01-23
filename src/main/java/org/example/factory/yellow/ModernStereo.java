package org.example.factory.yellow;

public class ModernStereo extends BasicStereo{
    @Override
    public void createStereo() {
        this.devices.add(new FmRadio());
        this.devices.add(new BluRayPlayer());
    }
}
