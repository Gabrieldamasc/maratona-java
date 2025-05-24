package academy.devdojo.maratonajava.javacore.ZZIjdbc.domain;

import lombok.Builder;
import lombok.Value;
import lombok.extern.log4j.Log4j2;

import java.util.Objects;
@Value
@Builder

public final class Producer {
    private final Integer id;
    private final String name;

}
