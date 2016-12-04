package Basic_Utilities;

import com.google.common.base.Objects;

/**
 * Created by yangyening on 2016/12/3.
 */
public class Basic_Object {
    public  static  void  main(String[] args){
    boolean equal_flag= Objects.equal("as","a");
    boolean equal_flag1=Objects.equal(null,null);


    System.out.print(equal_flag);
        System.out.print(equal_flag1);
    System.out.print(Objects.toStringHelper("Basic_Objects").add("x",1).toString());
    }
}
