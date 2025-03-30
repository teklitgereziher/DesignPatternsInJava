package creationalpatterns.builder.client;

import creationalpatterns.builder.builder.UIBuilder;
import creationalpatterns.builder.director.UIDirector;
import creationalpatterns.builder.helperbuilderfactory.BuilderFactory;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class SearchManager extends JFrame {
    public static final String CANDIDATE_SRCH = "CANDIDATE_SEARCH";
    public static final String EMPLOYER_SRCH = "EMPLOYER_SEARCH";
    public static final String GET_SQL = "GET_SQL";
    private SearchManager manager;
    private UIBuilder builder;

    public SearchManager() {
        BuilderFactory factory = new BuilderFactory();
        var builder = factory.getUIBuilder("CANDIDATE_SEARCH");
        manager = new SearchManager();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(SearchManager.GET_SQL)) {
            manager.setSQL(builder.getSQL());
        }
        if (e.getSource() == manager.getSearchTypeCtrl()) {
            String selection = manager.getSearchType();
            if (selection.equals("") == false) {
                BuilderFactory factory = new BuilderFactory();
                //create an appropriate builder instance
                builder = factory.getUIBuilder(selection);
                //configure the director with the builder
                UIDirector director = new UIDirector(builder);
                //director invokes different builder methods
                director.build();
                //get the final build object
                JPanel UIObj = builder.getSearchUI();
                manager.displayNewUI(UIObj);
            }
        }
    }

    public void buttonHandler(SearchManager inManager) {
        manager = inManager;
    }

    public void setSQL(String query) {

    }

    public String getSearchTypeCtrl() {
        return "";
    }

    public String getSearchType() {
        return "";
    }

    public void displayNewUI(JPanel panel) {

    }
}
