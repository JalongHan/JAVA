package jalonghan.com.java.OOP.Lambda;

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
 * 时间:17/4/26
 * 功能:
 */


public class LambdaQs {
    private final String TAG = "LambdaQs";

    //调用该方法需要Eatable对象
    public void eat(Eatable e){
        Log.i(TAG, "eat: "+e);
        e.taste();
    }
    //调用该方法需要flyable
    public void drive(Flyable f){
        Log.i(TAG, "drive: 我正在驾驶"+f);
        f.fly("[碧空如洗的晴日]");
    }
    //调用该方法需要addable对象
    public void test(Addable add){
        Log.i(TAG, "test: 5与3的和="+add.add(3,5));
    }

}
