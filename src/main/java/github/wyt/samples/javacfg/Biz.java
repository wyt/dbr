package github.wyt.samples.javacfg;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Biz {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(JavaConfig.class);

    UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);

    System.out.println(useFunctionService.sayHello("DI"));

    context.close();
  }
}
