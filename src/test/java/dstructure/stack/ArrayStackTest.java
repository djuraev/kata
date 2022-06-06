package dstructure.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayStackTest {
    ArrayStack<Integer> stack;

    @BeforeEach
    void setup() {
        stack = new ArrayStack<>();
    }

    @Test
    @DisplayName("Testing if stack is Empty")
    void isEmpty() {
        //
        stack.push(199);
        stack.pop();
        assert (stack.isEmpty());
    }

    @Test
    @DisplayName("Testing popping element from stack")
    void pop() {
        stack.push(1);
        assertEquals (1, stack.pop());
    }

    @Test
    @DisplayName("Testing pushing element to stack")
    void push() {
        //
        stack.push(100);
        assert (!stack.isEmpty());
    }

    @Test
    @DisplayName("Testing Search element in stack")
    void search() {
        //
        stack.push(250);
        assert (stack.search(250));
    }

    @Test
    @DisplayName("Testing peek method")
    void peek() {
        //
        stack.push(909);
        assert(stack.peek() == 909);
    }

    @Test
    @DisplayName("Testing stack operations step by step")
    void assertSequence() {
        //
        assertAll("Assert Stack usage",
                () -> assertTrue(stack.push(100)),
                () -> assertFalse(stack.isEmpty()),
                () -> assertTrue(stack.push(200)),
                () -> assertEquals(200, (int) stack.pop()),
                () -> assertFalse(stack.isEmpty()),
                () -> assertEquals(100, (int) stack.pop()),
                () -> assertTrue(stack.isEmpty())
        );
    }
}
