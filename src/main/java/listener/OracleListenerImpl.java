package listener;

import gen.OracleSqlBaseListener;
import gen.OracleSqlParser;
import model.Statement;

public class OracleListenerImpl extends OracleSqlBaseListener {

    private Statement stmt = null;

    @Override
    public void enterStatement(OracleSqlParser.StatementContext ctx) {
        this.stmt = new Statement();
    }

    @Override
    public void enterColList(OracleSqlParser.ColListContext ctx) {
        this.stmt.setColumList(ctx.getText());
    }

    @Override
    public void enterTableList(OracleSqlParser.TableListContext ctx) {
        this.stmt.setTableList(ctx.getText());
    }

    public Statement getStmt(){
        return this.stmt;
    }

}
