package Basic_Utilities;

import com.google.common.base.Optional;
import jdk.internal.cmm.SystemResourcePressureImpl;

import java.util.Set;

/**
 * Created by yangyening on 2016/12/3.
 * 介绍：使用和避免null,null是模棱两可的，
 * 会引起令人困惑的错误，有些时候它让人很不舒服。
 * 很多Guava工具类用快速失败拒绝null值，而不是盲
 * 目地接受。
 *
 *OPtion<T>工具的使用
 * Guava用Optional<T>表示可能为null的T类型引用。
 * 一个Optional实例可能包含非null的引用（我们称之为引用存在），
 * 也可能什么也不包括（称之为引用缺失）。它从不说包含的是null值，
 * 而是用存在或缺失来表示
 */
public class Basic_Optional {
    public  static void main(String[] args){
        //静态方法，创建指定引用的Optional实例，若引用为null则快速失败
        Optional<Integer> possible=Optional.of(5);
       // 创建引用缺失的Optional实例
        Optional<Integer> pos= Optional.absent();
        //创建指定引用的Optional实例，若引用为null则表示缺失
        Optional<Integer> posi=Optional.fromNullable(4);
      /*  System.out.println(posi.isPresent());*/
       /* System.out.println(posi.get());*/
      /*  System.out.println(posi.or(1));*/
        //都是非静态方法
        //如果Optional包含非null的引用（引用存在），返回true
         boolean a= possible.isPresent();
        //返回Optional所包含的引用，若引用缺失，则抛出java.lang.IllegalStateException
        Integer b=possible.get();
        //返回Optional所包含的引用，若引用缺失，返回指定的值
        Integer c=possible.or(4);
        //返回Optional所包含的引用，若引用缺失，返回null
        Integer d=possible.orNull();
       // 返回Optional所包含引用的单例不可变集，如果引用存在，返回一个只有单一元素的集合，如果引用缺失，返回一个空集合。
        Set<Integer> e=possible.asSet();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
