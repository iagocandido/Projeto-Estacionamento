package bll;

import dal.VeiculoDAL;
import java.util.List;
import java.util.Vector;
import model.Plano;
import model.Proprietario;
import model.Veiculo;

public class VeiculoBLL {

    private VeiculoDAL dal;

    public VeiculoBLL() {
        this.dal = new VeiculoDAL();
    }

    public void adicionar(Veiculo veiculo) throws Exception {
        dal.salvar(veiculo);
    }

    public void alterar(Veiculo veiculo) throws Exception {
        dal.alterar(veiculo);
    }
    
    public void remover(Veiculo veiculo) throws Exception {
        dal.excluir(veiculo.getCodigo());
    }

    public List<Veiculo> getConsulta() {
        return dal.mostrarTodos();
    }
    
    public Veiculo getConsultaPorId(int cod) {
        return dal.consultarPorId(cod);
    }

    public Vector<Plano> listarPlanos() {
        return dal.listarPlanos();
    }

    public Vector<Proprietario> listarProprietarios() {
        return dal.listarProprietarios();
    }

}
