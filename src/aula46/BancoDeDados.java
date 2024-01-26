package aula46;

public interface BancoDeDados extends SqlDCL, SqlDML, SqlDDL {

    // as interfaces podem extender quantas inferfaces forem necessárias

    void abrirConexao();

    void fecharConexao();

}
