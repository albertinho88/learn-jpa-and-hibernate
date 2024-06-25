package ec.clicka.springboot.learnjpaandhibernate.course;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Course {
    private long id;
    private String name;
    private String author;
}
