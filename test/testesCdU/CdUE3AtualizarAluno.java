package testesCdU;



import junit.framework.Assert;

import org.fpij.jitakyoei.model.beans.Aluno;

import org.junit.Test;



public class CdUE3AtualizarAluno {

    @Test

    public void TesteAtualizarAluno(){

        FactoryAlunoPadrao factory = new FactoryAlunoPadrao();

        Aluno aluno = factory.criarAluno();

        

        String ruaAntiga = aluno.getEntidade().getEndereco().getRua();

        String numAntigo = aluno.getEntidade().getEndereco().getNumero();

                

        aluno.getEntidade().getEndereco().setRua("Rua Piauí");

        aluno.getEntidade().getEndereco().setNumero("61");

        

        Assert.assertNotSame(ruaAntiga, aluno.getEntidade().getEndereco().getRua());

    }

    

}
