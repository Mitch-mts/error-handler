package mts.mtech.errorhandling.error;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Mitchell Tawanda Severa
 * 6/27/18
 * 4:10 PM
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@ToString
public class Error {
    private int code;
    private String message;
}
