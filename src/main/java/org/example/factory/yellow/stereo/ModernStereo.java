package org.example.factory.yellow.stereo;

import org.example.factory.yellow.component.BluRayPlayer;
import org.example.factory.yellow.component.FmRadio;

public class ModernStereo extends BasicStereo{
    @Override
    public void createStereo() {
        this.devices.add(new FmRadio());
        this.devices.add(new BluRayPlayer());
    }
}
