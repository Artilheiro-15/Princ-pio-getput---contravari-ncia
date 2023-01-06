import java.util.ArrayList;
import java.util.List;

public class App {

  public static void main(String[] args) throws Exception {
    System.out.println("=======================================");

    //Na contravariancia quando defini um tipo que pode ser um tipo ou qualquer super tipo dele
    //ai vai ter um erro se tentar obter um objeto porem pode adicionar

    List<Object> myObjs = new ArrayList<Object>();
    myObjs.add("Maria");
    myObjs.add("Alex");
    List<? super Number> myNums = myObjs;
    myNums.add(10);
    myNums.add(3.14);
    Number x = myNums.get(0); // erro de compilacao
  }
}
