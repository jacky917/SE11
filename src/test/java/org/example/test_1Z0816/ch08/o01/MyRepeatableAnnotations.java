package org.example.test_1Z0816.ch08.o01;

import java.lang.annotation.*;

@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyRepeatableAnnotations {
    MyRepeatableAnnotation[] value();
}
