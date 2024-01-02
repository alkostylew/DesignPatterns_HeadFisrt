package headfirst.facade.aleksDbConnections;

import java.sql.Connection;

public class DbConnectiobTest {

    public static void main(String[] args) {
        String tableName="Employee";

        System.out.println("--->>> generating MySql HTML report and Oracle PDF report WITHOUT using Facade");
        Connection con = MySqlHelper.getMySqlDBConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        mySqlHelper.generateMySqlHTMLReport(tableName, con);

        Connection con1 = OracleHelper.getOracleDBConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generateOraclePDFReport(tableName, con1);

        System.out.println("--->>> generating MySql HTML report and Oracle PDF report using Facade");
        DbConnectionFacade.generateReport(DbConnectionFacade.DBTypes.MYSQL, DbConnectionFacade.ReportTypes.HTML, tableName);
        DbConnectionFacade.generateReport(DbConnectionFacade.DBTypes.ORACLE, DbConnectionFacade.ReportTypes.PDF, tableName);
    }
}
