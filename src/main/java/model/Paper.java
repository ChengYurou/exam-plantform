package model;

import lombok.*;

import java.util.List;
import java.util.UUID;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paper {
    private String id;
    private List<BlankQuiz> blankQuizzes;

    public static Paper create(List<BlankQuiz> blankQuizzes) {
        return Paper.builder().id(UUID.randomUUID().toString()).blankQuizzes(blankQuizzes).build();
    }

    public void updateBlankQuizzes(List<BlankQuiz> blankQuizzes) {
        this.blankQuizzes = blankQuizzes;
    }
}
