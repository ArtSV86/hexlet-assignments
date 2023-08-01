package exercise;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void takeTestForRight() {
        List<Integer> elements = new ArrayList<>(Arrays.asList(1, 3, 7, 5, 2));
        List<Integer> list = App.take(elements, 4);
        assertThat(list.get(0)).isEqualTo(1);
        assertThat(list.get(1)).isEqualTo(3);
        assertThat(list.get(2)).isEqualTo(7);
        assertThat(list.get(3)).isEqualTo(5);
        assertThat(list.size()).isEqualTo(4);
    }

    @Test
    void takeTestForWrong1() {
        List<Integer> elements = new ArrayList<>(Arrays.asList());
        List<Integer> list = Implementations.wrong1(elements, 4);
        assertThat(list.size()).isEqualTo(0);
    }

    @Test
    void takeTestForWrong2() {
        List<Integer> elements = new ArrayList<>(Arrays.asList(1, 3, 7, 5, 2));
        List<Integer> list = Implementations.wrong2(elements, 8);
        assertThat(list.get(0)).isEqualTo(1);
        assertThat(list.get(1)).isEqualTo(3);
        assertThat(list.get(2)).isEqualTo(7);
        assertThat(list.get(3)).isEqualTo(5);
        assertThat(list.get(4)).isEqualTo(2);
        assertThat(list.size()).isEqualTo(5);

    }

    @Test
    void takeTest1ForWrong3() {
        List<Integer> elements = new ArrayList<>(Arrays.asList(1, 3, 7, 5, 2));
        List<Integer> list = Implementations.wrong3(elements, 5);
        assertThat(list.get(0)).isEqualTo(1);
        assertThat(list.get(1)).isEqualTo(3);
        assertThat(list.get(2)).isEqualTo(7);
        assertThat(list.get(3)).isEqualTo(5);
        assertThat(list.get(4)).isEqualTo(2);
        assertThat(list.size()).isEqualTo(5);
    }

    @Test
    void takeTest2ForWrong3() {
        List<Integer> elements = new ArrayList<>(Arrays.asList(1, 3, 7, 5, 2));
        List<Integer> list = Implementations.wrong3(elements, 4);
        assertThat(list.get(0)).isEqualTo(1);
        assertThat(list.get(1)).isEqualTo(3);
        assertThat(list.get(2)).isEqualTo(7);
        assertThat(list.get(3)).isEqualTo(5);
        assertThat(list.size()).isEqualTo(4);
    }
}