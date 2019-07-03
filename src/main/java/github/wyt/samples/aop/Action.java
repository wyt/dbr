package github.wyt.samples.aop;

import java.lang.annotation.Documented;

@Documented
public @interface Action {

  String name();
}
