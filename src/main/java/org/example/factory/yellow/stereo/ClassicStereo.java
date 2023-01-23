package org.example.factory.yellow.stereo;

import org.example.factory.yellow.component.FmRadio;
import org.example.factory.yellow.component.TurnTable;

public class ClassicStereo extends Stereo {
    @Override
    public void createStereo() {
        this.devices.add(new FmRadio());
        this.devices.add(new TurnTable());
    }
}
