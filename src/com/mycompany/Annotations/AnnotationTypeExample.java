package com.mycompany.Annotations;

import java.lang.annotation.Documented;

@Documented //to make the information in MyAnnotation appear in JavaDoc-generated documentation
@interface MyAnnotation {
    String author();

    String date();

    int currentRevision() default 1;

    String[] reviewers();
}


@MyAnnotation(
        author = "Aathil",
        date = "12-08-2021",
        currentRevision = 1,
        reviewers = {"Aathil", "Shihab"}
)
public class AnnotationTypeExample {
    int a;
}
