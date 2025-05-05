package com.algaworks.algasensors.temperature.processing;


import com.algaworks.algasensors.temperature.processing.common.IdGenerator;
import com.algaworks.algasensors.temperature.processing.common.UUIDv7Utils;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class UUIDv7Test {

    @Test
    void shouldGenerateUUIDv7() {
        UUID uuid = IdGenerator.generateId();
        OffsetDateTime uuidDateTime = UUIDv7Utils.extractOffsetDateTime(uuid).truncatedTo(ChronoUnit.MINUTES);
        OffsetDateTime offsetDateTime = OffsetDateTime.now().truncatedTo(ChronoUnit.MINUTES);
        assertThat(uuidDateTime).isEqualTo(offsetDateTime);
    }

}
