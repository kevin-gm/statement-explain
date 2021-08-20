package site.wellman.sql.explain.core.submitter;

import site.wellman.sql.explain.core.StatementWrapper;

/**
 * @author li.guoqiang
 **/
public interface StatementSubmitter {

    void submit(StatementWrapper statementWrapper);
}
