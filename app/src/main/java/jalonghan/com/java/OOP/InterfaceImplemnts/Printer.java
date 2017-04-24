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
 * 时间:17/4/24
 * 功能:实现接口方法时必须使用public,因为接口里的方法都是public,子类重写父类时必须大或者相等,所以只能用public
 */

public class Printer implements Output,Product {

    private final String TAG = "Printer";

    private String[] printData = new String[MAX_CACHE_LINE];

    private int dataNum = 0;

    @Override
    public int getProductTime() {
        return 45;
    }

    @Override
    public void out() {
        //只要还有作业 就继续打印
        while (dataNum>0){
            Log.i(TAG, "out: "+printData[0]);

            //把作业整体向前移一位,并将剩下的作业数减1
            System.arraycopy(printData,1,printData,0,--dataNum);

        }
    }

    @Override
    public void getData(String msg) {
        if (dataNum >= MAX_CACHE_LINE){
            Log.i(TAG, "getData: 输出队列已满,添加失败");
        }else {
            //把打印数据添加到队列里,已保存数据的数量加1
            printData[dataNum++] = msg;
        }

    }
}
