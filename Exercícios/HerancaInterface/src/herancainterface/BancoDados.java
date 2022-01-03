
package herancainterface;
public interface BancoDados extends SqlDCL, SqlDML, SqlDDL {
    public void AbrirConexao();
    public void FecharConexao();
}
