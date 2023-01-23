package org.example.factory.yellow.creational;

import org.example.factory.yellow.stereo.Stereo;
import org.example.factory.yellow.stereo.ClassicStereo;
import org.example.factory.yellow.stereo.ModernStereo;

public class StereoFactory {
    public static Stereo getStereo(StereoType type) {
        switch (type) {
            case CLASSIC: return new ClassicStereo();
            case MODERN: return new ModernStereo();
            default: return null;
        }
    }
}
