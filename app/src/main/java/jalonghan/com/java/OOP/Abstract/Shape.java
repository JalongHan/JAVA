package jalonghan.com.java.OOP.Abstract;

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
 * 时间:17/4/12
 * 功能:Shape抽像类
 */

public abstract class Shape {

    private final String TAG = "Shape";
    
    {
        Log.i(TAG, "Shape: 执行shape的初始化块");
    }

    private String color;
    //定义一个计算周长的抽象方法.
    public abstract double calPerimeter();
    //定义一个返回形状的抽象方法
    public abstract String getType();

    public Shape() {
    }

    public Shape(String color) {
        Log.i(TAG, "Shape: 执行shape的构造器");
        this.color = color;
    }

    public String getTAG() {
        return TAG;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
