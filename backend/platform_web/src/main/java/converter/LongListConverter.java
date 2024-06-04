package converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Converter(autoApply = true)
public class LongListConverter implements AttributeConverter<List<Long>, String> {

    private static final String SPLIT_CHAR = ",";

    @Override
    public String convertToDatabaseColumn(List<Long> attribute) {
        if (attribute == null) return null;
        return attribute.stream()
                .map(Object::toString)
                .collect(Collectors.joining(SPLIT_CHAR));
    }

    @Override
    public List<Long> convertToEntityAttribute(String dbData) {
        if (dbData == null) return null;
        return Arrays.stream(dbData.split(SPLIT_CHAR))
                .map(Long::valueOf)
                .collect(Collectors.toList());
    }
}