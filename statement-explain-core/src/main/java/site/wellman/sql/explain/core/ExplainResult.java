package site.wellman.sql.explain.core;

/**
 * @author li.guoqiang
 **/
public class ExplainResult {

	private String markId;
	private int cost;
	private String fileId;
	private String sqlHash;
	private String sql;
	private long timestamp;
	private String explainContent;
	private String databaseType;

	public String getMarkId() {
		return markId;
	}

	public void setMarkId(String markId) {
		this.markId = markId;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getSqlHash() {
		return sqlHash;
	}

	public void setSqlHash(String sqlHash) {
		this.sqlHash = sqlHash;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public String getExplainContent() {
		return explainContent;
	}

	public void setExplainContent(String explainContent) {
		this.explainContent = explainContent;
	}

	public String getDatabaseType() {
		return databaseType;
	}

	public void setDatabaseType(String databaseType) {
		this.databaseType = databaseType;
	}
}
