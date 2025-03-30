package creationalpatterns.builder.helperbuilderfactory;

import creationalpatterns.builder.builder.UIBuilder;
import creationalpatterns.builder.client.SearchManager;
import creationalpatterns.builder.concretebuilder.CandSrchBuilder;
import creationalpatterns.builder.concretebuilder.EmpSrchBuilder;

public class BuilderFactory {
    public UIBuilder getUIBuilder(String str) {
        UIBuilder builder = null;
        if (str.equals(SearchManager.CANDIDATE_SRCH)) {
            builder = new CandSrchBuilder();
        } else if (str.equals(SearchManager.EMPLOYER_SRCH)) {
            builder = new EmpSrchBuilder();
        }
        return builder;
    }
}
