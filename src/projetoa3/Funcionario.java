package projetoa3;

import java.util.List;

public class Funcionario extends Usuario {
    
    public Funcionario(int id, String tipo, String nome, String email, String senha, String telefone, String usuario) {
        super(id, tipo, nome, email, senha, telefone, usuario);
    }

   

    public void atualizacaoProjeto(Projeto projeto) {
        
    }

    /**
     *
     * @param codigo
     * @return
     */
    
    public Projeto consultaProjeto(String codigo) {
        List<Projeto> projetos = super.getProjetos();
        for (Projeto projeto : projetos) {
            if (projeto.getCodigo().equals(codigo) ) {
                return projeto;
            }
        }
        return null; 
    }
}
