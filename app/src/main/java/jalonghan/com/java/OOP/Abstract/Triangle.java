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
 * 功能:
 */

public class Triangle extends Shape {

    private final String TAG = "Triangle";

    //定义三角形的三边
    private double a;
    private double b;
    private double c;


    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.setSides(a,b,c);

    }

    private void setSides(double a, double b, double c) {
        if (a>=b+c || b>=a+c || c>= a+b){
            Log.i(TAG, "setSides: 三角形两边之合必须大于第三边");
            return;
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calPerimeter() {
        return a+b+c;
    }

    @Override
    public String getType() {
        return "三角形";
    }
}
