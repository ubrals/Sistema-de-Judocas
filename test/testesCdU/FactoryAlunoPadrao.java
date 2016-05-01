package testesCdU;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.model.beans.Endereco;
import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.model.beans.Filiado;
import org.fpij.jitakyoei.model.beans.Professor;

public class FactoryAlunoPadrao {
    public Aluno criarAluno(){
        Aluno aluno;
                
        Filiado filiado;
        Entidade entidade;
        Professor professor;
        
        
        Endereco endereco;
        
        entidade = new Entidade();
        filiado = new Filiado();
        professor = new Professor();
        
        endereco = new Endereco();
        
        endereco.setBairro("Higienopolis");
        endereco.setCep("01212-001");
        endereco.setCidade("São Paulo");
        endereco.setEstado("SP");
        endereco.setNumero("1771");
        endereco.setRua("Avenida Angelica");
        
        entidade.setCnpj("92929290001/71");
        entidade.setEndereco(endereco);
        entidade.setNome("Tyler Durden");
        entidade.setTelefone1("25656578");
        entidade.setTelefone2("992993991");
        
        filiado.setCpf("2122323233233-8");
        filiado.setDataCadastro(new Date());
        filiado.setDataNascimento(new Date());
        filiado.setEmail("tyler@mx.com");
        filiado.setEndereco(endereco);
        filiado.setId(881821L);
        filiado.setNome(entidade.getNome());
        
        List<Entidade> entidades = new ArrayList<>();
        entidades.add(entidade);
        
        professor.setEntidades(entidades);
        professor.setFiliado(filiado);
        
        aluno = new Aluno();
        
        aluno.setEntidade(entidade);
        aluno.setFiliado(filiado);
        aluno.setProfessor(professor);
        
        return aluno;
    }
    
    public static void main(String[] args) {
        Aluno aluno;
        FactoryAlunoPadrao factory = new FactoryAlunoPadrao();
        aluno = factory.criarAluno();

    }
}
