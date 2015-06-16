package hello;

import org.junit.Test;
import org.junit.Before;

import static org.assertj.core.api.Assertions.*;

public class RomanNumberConverterTest{
    RomanNumberConverter romanNumberConverter;
   
    @Before
    public void setup() {
        romanNumberConverter = new RomanNumberConverter();
    }
   
    @Test
    public void check() {
        assertThat(romanNumberConverter.convert("M"))
          .isEqualTo(1000);
    }
   
    @Test
    public void check_soustra(){
        assertThat(romanNumberConverter.convert("IV"))
            .isEqualTo(5);
        assertThat(romanNumberConverter.convert("IX"))
            .isEqualTo(9);
        assertThat(romanNumberConverter.convert("IM"))
            .isEqualTo(999);
        assertThat(romanNumberConverter.convert("VX"))
            .isEqualTo(5);
    }
    
}
