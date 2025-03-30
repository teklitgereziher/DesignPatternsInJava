package creationalpatterns.builder.builder;

import javax.swing.*;

public abstract class UIBuilder {
    protected JPanel searchUI;

    // add necessary UI controls and initialize them
    public abstract void addUIControls();

    public abstract void initialize();

    //return the SELECT sql command for the specified criteria
    public abstract String getSQL();

    //common to all concrete builders.
    // returns the fully constructed search UI
    public JPanel getSearchUI() {
        return searchUI;
    }
}
