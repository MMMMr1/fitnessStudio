package it.academy.fitness_studio.core.converter;

import com.fasterxml.jackson.databind.util.StdConverter;
import org.springframework.stereotype.Component;

import javax.persistence.CollectionTable;
import java.time.Instant;

public class CustomInstantConverter {
    public static class Serializer extends StdConverter<Instant, Long> {
        @Override
        public Long convert(Instant value) {
            return value == null ? null : value.toEpochMilli();
        }
    }
}
