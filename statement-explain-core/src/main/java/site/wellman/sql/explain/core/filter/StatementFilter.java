package site.wellman.sql.explain.core.filter;

import site.wellman.sql.explain.core.StatementWrapper;

/**
 * @author li.guoqiang
 **/
public interface StatementFilter {

    boolean shouldExclude(StatementWrapper statementWrapper);
}
