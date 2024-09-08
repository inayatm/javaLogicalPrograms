package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("CheckBalancedParanthesisInAString Should check")
class CheckBalancedParanthesisInAStringTest {

    @Test
    void hasBalacedParanthesis() {
        String paranthesis = "({[]})";
        assertTrue(CheckBalancedParanthesisInAString.hasBalacedParanthesis(paranthesis));
    }

    @Test
    void doesNotHasBalacedParanthesis() {
        String paranthesis = "({}}}})";
        assertFalse(CheckBalancedParanthesisInAString.hasBalacedParanthesis(paranthesis));
    }


    @Test
    void doesNotHasBalacedParanthesisWithEmprtyString() {
        String paranthesis = "";
        assertFalse(CheckBalancedParanthesisInAString.hasBalacedParanthesis(paranthesis));
    }


}