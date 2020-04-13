package model;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PaperTest {

    @Test
    public void create() {
        List<BlankQuiz> quizzes = List.of(BlankQuiz.builder().id("quiz-1").build(), BlankQuiz.builder().id("quiz-2").build());
        Paper paper = Paper.create(quizzes);

        assertNotNull(paper.getId());
        assertEquals(paper.getBlankQuizzes(), quizzes);
    }

    @Test
    public void updateBlankQuizzes() {
        Paper paper = new Paper();
        List<BlankQuiz> quizzes = List.of(BlankQuiz.builder().id("quiz-1").build(), BlankQuiz.builder().id("quiz-2").build());
        paper.updateBlankQuizzes(quizzes);

        assertEquals(paper.getBlankQuizzes(), quizzes);
    }

}
