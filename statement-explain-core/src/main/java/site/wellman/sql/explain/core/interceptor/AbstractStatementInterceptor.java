package site.wellman.sql.explain.core.interceptor;

import site.wellman.sql.explain.core.StatementWrapper;
import site.wellman.sql.explain.core.submitter.DefaultStatementSubmitter;
import site.wellman.sql.explain.core.submitter.StatementSubmitter;

/**
 * @author li.guoqiang
 **/
public abstract class AbstractStatementInterceptor implements StatementInterceptor {

    private final StatementSubmitter statementSubmitter = new DefaultStatementSubmitter();

    protected void afterIntercept(StatementWrapper statementWrapper) {
        statementSubmitter.submit(statementWrapper);
    }
}
