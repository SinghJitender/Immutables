import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableRequestAPI.class)
@JsonDeserialize(as = ImmutableRequestAPI.class)
public interface RequestAPI {

    String name();
    int age();

}
