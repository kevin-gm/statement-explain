package site.wellman.sql.explain.core.handler;

import site.wellman.sql.explain.core.ExplainResult;

/**
 * @author li.guoqiang
 **/
public interface ExplainResultHandler {

    void handle(ExplainResult explainResult);
}
