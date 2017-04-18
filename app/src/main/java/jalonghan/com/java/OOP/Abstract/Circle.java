package jalonghan.com.java.OOP.Abstract;

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
 * 时间:17/4/14
 * 功能:圆形
 */

public class Circle extends Shape {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        setRadius(radius);
    }

    private void setRadius(double radius) {
        this.radius = radius;
    }


    //重写计算周长的抽象方法
    @Override
   public double calPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String getType() {
        return getColor()+"圆形";
    }
}
