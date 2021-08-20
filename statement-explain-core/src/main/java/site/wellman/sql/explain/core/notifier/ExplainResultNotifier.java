package site.wellman.sql.explain.core.notifier;

import site.wellman.sql.explain.core.AnalysisResult;

/**
 * @author li.guoqiang
 **/
public interface ExplainResultNotifier {

    void notifyResult(AnalysisResult analysisResult);
}
