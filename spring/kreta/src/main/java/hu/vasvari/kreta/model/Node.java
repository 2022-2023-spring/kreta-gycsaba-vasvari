package hu.vasvari.kreta.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Node<T> {
    private T data;
    private Node<T> next;
}
