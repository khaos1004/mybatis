package org.project.vo;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Todo {
    private Integer id;
    private String content;
    private String isCompleted;

    public Todo(String content) {
        this.content = content;
    }
}
