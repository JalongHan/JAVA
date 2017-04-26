package jalonghan.com.java.OOP.InterfaceImplemnts;

import android.util.Log;

import jalonghan.com.java.OOP.Interface.Output;

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
 * 时间:17/4/25
 * 功能:本类也实现了Output接口,因此也可当成Output对象使用,于是只要把OutputFactory工厂类的getOutput()方法中粗体部分改成
 * return new BetterPrinter()
 *
 */

public class BetterPrinter implements Output {

    private String[] printData = new String[MAX_CACHE_LINE];
    //用以记录当前需打印的作业数
    private int dataNum = 0;

    @Override
    public void out() {
        while (dataNum>0){
            Log.i("BetterPrinter", "out: "+printData[dataNum]);

            //把作业队列整体前移一位,并将剩下的作业数减1

            System.arraycopy(printData,0,printData,1,--dataNum);

        }

    }

    @Override
    public void getData(String msg) {
        if (dataNum>=MAX_CACHE_LINE*2){
            Log.i("BetterPrinter", "getData: 输出队列已满,添加失败");
        }else {
            //把打印数据添加到队列里,已保存数据的数量加1
            printData[dataNum++] = msg;
        }

    }
}
