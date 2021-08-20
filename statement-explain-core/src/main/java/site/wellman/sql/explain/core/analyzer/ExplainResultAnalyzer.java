package site.wellman.sql.explain.core.analyzer;

import site.wellman.sql.explain.core.AnalysisResult;
import site.wellman.sql.explain.core.ExplainResult;

/**
 * @author li.guoqiang
 **/
public interface ExplainResultAnalyzer {

    AnalysisResult analysis(ExplainResult explainResult);
}
