package org.fpij.jitakyoei;

import org.junit.Test;
import static org.junit.Assert.*;
import org.fpij.jitakyoei.model.beans.*;


public class CdUE1AdicionarAlunoTest {
    public CdUE1AdicionarAlunoTest (){
    }
    
    @Test
    public void testCriarAluno(){
        Aluno aluno = new Aluno();
        Assert.assertEquals(new Aluno, aluno);
    }
}
