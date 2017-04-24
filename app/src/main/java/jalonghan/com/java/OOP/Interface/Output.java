package jalonghan.com.java.OOP.Interface;

import android.util.Log;

/**
 * ━━━━━━神兽出没━━━━━━
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　　　　　┃
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　　　　　┃
 * 　　┃　　　┻　　　┃
 * 　　┃　　　　　　　┃
 * 　　┗━┓　　　┏━┛Code is far away from bug with the animal protecting
 * 　　　　┃　　　┃    神兽保佑,代码无bug
 * 　　　　┃　　　┃
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫
 * 　　　　　┗┻┛　┗┻┛
 * <p>
 * 作者:jalong Han
 * 邮箱:hjl999@126.com
 * 时间:17/4/24
 * 功能:基本接口定义,接口中定义的内部类,内部接口,内部枚举默认都采用public static两个修饰符.
 * 接口中定义的成员变量自动增加public static final修饰符
 */

public interface Output {

    //接口里定义的成员变量只能是常量
    int MAX_CACHE_LINE = 50;
    //接口里定义的普通方法只能是public的抽象方法
    void out();
    void getData(String msg);
    //接口中定义默认方法需要使用default修饰
    default void print(String... msgs){

        for (String msg : msgs) {
            Log.i("Output", "print: " + msg);
        }

    }
    default void test(){
        Log.i("Output", "test: 默认的test方法");
    }

    //在接口中定义类方法,需要使用static
    static String staticTest(){
        return "接口中的类方法";
    }


}
