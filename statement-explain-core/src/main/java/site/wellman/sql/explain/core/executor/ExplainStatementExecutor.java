package site.wellman.sql.explain.core.executor;

import site.wellman.sql.explain.core.ExplainResult;
import site.wellman.sql.explain.core.StatementWrapper;

/**
 * @author li.guoqiang
 **/
public interface ExplainStatementExecutor {

    ExplainResult execute(StatementWrapper statementWrapper);
}
