package site.wellman.sql.explain.core;

import site.wellman.sql.explain.core.executor.ExplainStatementExecutor;
import site.wellman.sql.explain.core.filter.StatementFilter;
import site.wellman.sql.explain.core.handler.ExplainResultHandler;

import java.util.List;

/**
 * @author li.guoqiang
 **/
public class ExplainStatementDelegator {

    private List<StatementFilter> filterList;
    private ExplainStatementExecutor explainStatementExecutor;
    private ExplainResultHandler explainResultHandler;

    public void delegate(StatementWrapper statementWrapper) {
        boolean shouldExplain = shouldExplain(statementWrapper);
        if (!shouldExplain) {
            return;
        }
        ExplainResult explainResult = explainStatementExecutor.execute(statementWrapper);
        explainResultHandler.handle(explainResult);
    }

    private boolean shouldExplain(StatementWrapper statementWrapper) {
        for (StatementFilter filter : filterList) {
            if (filter.shouldExclude(statementWrapper)) {
                return false;
            }
        }
        return true;
    }
}
