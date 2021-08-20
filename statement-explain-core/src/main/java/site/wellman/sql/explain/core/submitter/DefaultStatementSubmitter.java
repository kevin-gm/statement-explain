package site.wellman.sql.explain.core.submitter;

import site.wellman.sql.explain.core.ExplainStatementDelegator;
import site.wellman.sql.explain.core.StatementWrapper;

import java.util.logging.Logger;

/**
 * @author li.guoqiang
 **/
public class DefaultStatementSubmitter implements StatementSubmitter {

    private final static Logger LOGGER = Logger.getLogger("DefaultStatementSubmitter");

    private ExplainStatementDelegator explainStatementDelegator;

    @Override
    public void submit(StatementWrapper statementWrapper) {
        explainStatementDelegator.delegate(statementWrapper);
    }
}
