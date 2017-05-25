/**
 * 
 */
package interfaces;

/**
 * <pre>
 * interfaces
 *   |_ IDBManager
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 *
 * @author :  tjrgh
 * @version : 1.0
 */
public interface IDBManager {
	
	String ORACLE_DATABASE ="ORACLE";
	String SYBASE_DATABASE = "SYBASE";
	
	void insert();
	void search();
	void update();
	void delete();
	
	public static IDBManager getDBObject(String database){
		if (database.equals("ORACLE")) {
			IDBManager DB = new OracleDB();
			return DB;
		} else if (database.equals("SYBASE")) {
			IDBManager DB = new SybaseDB();
			return DB;
		}
		return null;
	}
	
}
