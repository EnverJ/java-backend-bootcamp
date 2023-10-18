package io.javabrains.javabasics;

public record Point(int x, int y) {
    // instead of creating getter and setter, just use record
    // fields are automatically generated as private final
    // constructor is automatically generated to initialize all fields
    // automatically gets methods like 'equals()', 'hasCode()', and 'toString()'
    // derived from _all_of the component fields.
    // not mean to replace to classes
    //

}
