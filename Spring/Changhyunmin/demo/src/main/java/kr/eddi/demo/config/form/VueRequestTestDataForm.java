package kr.eddi.demo.config.form;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@RequiredArgsConstructor
public class VueRequestTestDataForm {

    final private String studentName;
    final private String studentMajor;
    final private Integer studentAge;
}
