import java.sql.Connection;

public class BaseDAO {
    protected Connection conn(){
        return FabricaDeConexoes.obterInstancia().conn();
    }
}
