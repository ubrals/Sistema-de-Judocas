/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.model.validator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31461700
 */
public class ValidatorTest {
    
    public ValidatorTest() {
    }

    @Test
    public void testValidate() {
    }

    public class ValidatorImpl implements Validator {

        public boolean validate(E obj) {
            return false;
        }
    }
    
}
