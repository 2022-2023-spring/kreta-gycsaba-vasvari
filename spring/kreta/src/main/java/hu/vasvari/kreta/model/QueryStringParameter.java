package hu.vasvari.kreta.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QueryStringParameter {

    public int numberOfPage;
    public int numberOfItems;
    public int currentPage;
    public int pageSize;
}
