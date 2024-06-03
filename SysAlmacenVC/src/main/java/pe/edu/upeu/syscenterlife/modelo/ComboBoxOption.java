package pe.edu.upeu.syscenterlife.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ComboBoxOption {

    String key;
    String value;

    @Override
    public String toString() {
        return value;
    }
}
