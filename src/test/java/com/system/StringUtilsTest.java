package com.system;

import com.system.v1.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("StringUtilsTest")
public class StringUtilsTest {


    @Test
    @DisplayName("IsPositiveNumber")
    public void isPositiveTest(){
        Assertions.assertThrows(NullPointerException.class,()-> StringUtils.isPositiveNumber(null));
        Assertions.assertThrows(NumberFormatException.class,()-> StringUtils.isPositiveNumber("15a-0"));
        Assertions.assertEquals(false, StringUtils.isPositiveNumber("-150"));
        Assertions.assertEquals(true, StringUtils.isPositiveNumber("150"));
    }

}
