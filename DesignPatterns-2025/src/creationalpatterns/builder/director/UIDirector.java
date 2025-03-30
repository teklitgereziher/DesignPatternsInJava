package creationalpatterns.builder.director;

import creationalpatterns.builder.builder.UIBuilder;

/**
 * The UIDirector maintains an object reference of type UIBuilder. This
 * UIBuilder object can be passed to the UIDirector as part of a call to its
 * constructor. As part of the build method, the UIDirector invokes different
 * UIBuilder methods on this object for constructing the JPanel searchUI
 * object.
 */
public class UIDirector {
    private UIBuilder builder;

    public UIDirector(UIBuilder bldr) {
        builder = bldr;
    }

    public void build() {
        builder.addUIControls();
        builder.initialize();
    }
}
