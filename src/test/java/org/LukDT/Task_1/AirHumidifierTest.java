package org.LukDT.Task_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AirHumidifierTest {
    @Test
    void testFunction() {
        AirHumidifier airHumidifier = new AirHumidifier();

        String str =
                """
                10
                2 1
                22 10
                26 17
                29 2
                45 20
                47 32
                72 12
                75 1
                81 31
                97 7
                """;

        Assertions.assertEquals(57, airHumidifier.function(str));
    }
}
