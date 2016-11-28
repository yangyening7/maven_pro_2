import com.google.common.base.Joiner;

/**
 * Created by yangyening on 2016/11/8.
 */
public class maven_example {
    public  static  void main(String[] args){
        Joiner joiner=Joiner.on(",").skipNulls();
        System.out.print(joiner.join("as",null,"sd"));
    }
}
