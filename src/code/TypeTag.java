package bug.code;

import static bug.code.TypeTag.NumericClasses.*;

public enum TypeTag {

    INT(INTEGER),
    LONG(INTEGER),
    FLOAT(FLOATING),
    DOUBLE(FLOATING);

    final int numericClass;

    TypeTag(int numericClass) {
        this.numericClass = numericClass;
    }

    public static class NumericClasses {
        public static final int INTEGER = 1;
        public static final int FLOATING = 2;
    }
}