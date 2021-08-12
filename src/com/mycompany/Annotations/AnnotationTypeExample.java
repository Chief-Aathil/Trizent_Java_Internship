package com.mycompany.Annotations;

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
