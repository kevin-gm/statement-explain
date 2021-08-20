package site.wellman.sql.explain.core;

/**
 * @author li.guoqiang
 **/
public class AnalysisResult {

	private String analysisAssess;
	private String explanation;
	private String suggestion;
	private ExplainResult explainResult;

	public String getAnalysisAssess() {
		return analysisAssess;
	}

	public void setAnalysisAssess(String analysisAssess) {
		this.analysisAssess = analysisAssess;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public String getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}

	public ExplainResult getExplainResult() {
		return explainResult;
	}

	public void setExplainResult(ExplainResult explainResult) {
		this.explainResult = explainResult;
	}
}
