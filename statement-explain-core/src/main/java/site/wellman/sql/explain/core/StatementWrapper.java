package site.wellman.sql.explain.core;

/**
 * @author li.guoqiang
 **/
public class StatementWrapper {

    private String statementId;
    private String originStatement;
    private String valueStatement;

    public String getStatementId() {
        return statementId;
    }

    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }

    public String getOriginStatement() {
        return originStatement;
    }

    public void setOriginStatement(String originStatement) {
        this.originStatement = originStatement;
    }

    public String getValueStatement() {
        return valueStatement;
    }

    public void setValueStatement(String valueStatement) {
        this.valueStatement = valueStatement;
    }
}
