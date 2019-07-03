package github.wyt.samples.javacfg;

import lombok.Setter;

@Setter
public class UseFunctionService {

  FunctionService functionService;

  public String sayHello(String word) {
    return functionService.sayHello(word);
  }
}
