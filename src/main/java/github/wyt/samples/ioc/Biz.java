package github.wyt.samples.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Biz {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(DIConfig.class);

    UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);

    System.out.println(useFunctionService.sayHello("DI"));

    context.close();
  }
}
