package org.example.factory.yellow;

public class ClassicStereo extends BasicStereo{
    @Override
    public void createStereo() {
        this.devices.add(new FmRadio());
        this.devices.add(new TurnTable());
    }
}
