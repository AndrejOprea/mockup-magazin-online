package ro.mycodescool.model;

import lombok.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Options {


    private int id;
    private String option_name;


    public Options(String option_name) {
        this.option_name = option_name;
    }
}
