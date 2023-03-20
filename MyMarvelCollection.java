package org.example;

import java.util.Arrays;
import java.util.Iterator;

public class MyMarvelCollection implements Iterable<Film> {
    private Film [] films;
    private int size;

    public MyMarvelCollection (Film [] films) {
        this.films = films;
        this.size = 0;
    }

    public void add (Film film) {
        this.films[this.size++] = film;     //añadimos el film en el vector e incrementamos size
    }

    public Film get (int index) {
        return this.films[index];
    }

    @Override
    public Iterator<Film> iterator() {
        return new Iterator<Film>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < size && films[index] != null;        //comprueba si index es menor que size y si el elemento actual en el vector films no es nulo, de cumplirse estas dos condiciones significa que hay elementos por recorrer
            }

            @Override
            public Film next() {
                return films[index++];      // devuelve el elemento actual en el vector films e incrementa el valor de index
            }
        };
    }
}