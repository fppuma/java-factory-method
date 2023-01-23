# java-factory-method
Factory Method Pattern

```mermaid
  graph TD;
      Stereo-->ClassicStereo;
      Stereo-->ModernStereo;
```

## Java Code
```java
public class StereoFactory {
  public static Stereo getStereo(StereoType type) {
    switch (type) {
      case CLASSIC: return new ClassicStereo();
      case MODERN: return new ModernStereo();
      default: return null;
    }
  }
}
```