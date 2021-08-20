package site.wellman.sql.explain.core.interceptor;

import site.wellman.sql.explain.core.StatementWrapper;

/**
 * @author li.guoqiang
 **/
public interface StatementInterceptor {

    StatementWrapper statementIntercept(Object object);
}
