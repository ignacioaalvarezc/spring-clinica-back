package chi.voll.api.domain.attention.validations;

// IMPORTS.
import chi.voll.api.domain.attention.ReserveAttentionData;

/**
 * THIS INTERFACE DEFINES THE CONTRACT FOR VALIDATING ATTENTION RESERVATION DATA.
 * Classes implementing this interface must provide a validation method.
 *
 * @author Ignacio Álvarez
 * @version 1.0
 * @since 2023-11-07
 */
public interface AttentionValidator {

    /**
     * VALIDATES THE PROVIDED ATTENTION RESERVATION DATA.
     *
     * @param data The attention reservation data to be validated.
     */
    public void validate(ReserveAttentionData data);
}
