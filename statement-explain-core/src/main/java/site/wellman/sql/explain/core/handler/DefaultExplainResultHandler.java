package site.wellman.sql.explain.core.handler;

import site.wellman.sql.explain.core.AnalysisResult;
import site.wellman.sql.explain.core.ExplainResult;
import site.wellman.sql.explain.core.analyzer.ExplainResultAnalyzer;
import site.wellman.sql.explain.core.notifier.ExplainResultNotifier;

/**
 * @author li.guoqiang
 **/
public class DefaultExplainResultHandler implements ExplainResultHandler {

    private ExplainResultAnalyzer explainResultAnalyzer;
    private ExplainResultNotifier explainResultNotifier;

    @Override
    public void handle(ExplainResult explainResult) {
        AnalysisResult analysisResult = explainResultAnalyzer.analysis(explainResult);
        explainResultNotifier.notifyResult(analysisResult);
    }
}
