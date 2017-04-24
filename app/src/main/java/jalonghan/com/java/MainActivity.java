package jalonghan.com.java;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import jalonghan.com.java.OOP.Abstract.Circle;
import jalonghan.com.java.OOP.Abstract.Shape;
import jalonghan.com.java.OOP.Abstract.Triangle;
import jalonghan.com.java.OOP.Cache.CacheImmutale;
import jalonghan.com.java.OOP.FunctionOfAbstract.CarSpeedMeter;
import jalonghan.com.java.OOP.Interface.Output;
import jalonghan.com.java.OOP.InterfaceImplemnts.Printer;
import jalonghan.com.java.OOP.InterfaceImplemnts.Product;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final String TAG = "MainActivity";
    private Button mCacheImmutale;
    private Button mAbstracttest;
    private Button mFunctionOfAbstract;
    private Button mInterface;
    private Button mInterfaceUse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }

    private void initView() {
        mCacheImmutale = (Button) findViewById(R.id.CacheImmutale);
        mCacheImmutale.setOnClickListener(this);

        mAbstracttest = (Button) findViewById(R.id.abstracttest);
        mAbstracttest.setOnClickListener(this);

        mFunctionOfAbstract = (Button) findViewById(R.id.FunctionOfAbstract);
        mFunctionOfAbstract.setOnClickListener(this);
        mInterface = (Button) findViewById(R.id.Interface);
        mInterface.setOnClickListener(this);
        mInterfaceUse = (Button) findViewById(R.id.InterfaceUse);
        mInterfaceUse.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //测试缓存地址是否相同
            case R.id.CacheImmutale:
                CacheImmutale c1 = CacheImmutale.valueOf("hello");
                CacheImmutale c2 = CacheImmutale.valueOf("hello");
                Log.i(TAG, "CacheImmutale: " + (c1 == c2));

                break;
            case R.id.abstracttest:

                Shape s1 = new Triangle("黑色", 3, 4, 5);
                Shape s2 = new Circle("黄色", 3);
                Log.i(TAG, "abstracttest: " + s1.getType());
                Log.i(TAG, "abstracttest: " + s1.calPerimeter());
                Log.i(TAG, "abstracttest: " + s2.getType());
                Log.i(TAG, "abstracttest: " + s2.calPerimeter());


                break;
            case R.id.FunctionOfAbstract:

                CarSpeedMeter csm = new CarSpeedMeter();
                csm.setTurnRate(15);

                Log.i(TAG, "FunctionOfAbstract: " + csm.getSpeed());


                break;
            case R.id.Interface:
                //下面语句将引发"为final变量赋值"的编译异常
//                Output.MAX_CACHE_LINE = 20;

                //使用接口来调用类方法
                Log.i(TAG, "onClick: " + Output.staticTest());

                break;
            case R.id.InterfaceUse:

                //创建一个Printer对象,当成Output使用
                Output o = new Printer();

                o.getData("轻量级Java EE企业应用实战");
                o.getData("疯狂Java讲义");
                o.out();


                o.getData("疯狂Android讲义");
                o.getData("疯狂Ajax讲义");
                o.out();

                //调用Output接口中定义的默认方法
                o.print("孙悟空","猪八戒","白骨精");
                o.test();
                //创建一个Printer对象,当成Product使用
                Product p = new Printer();

                Log.i(TAG, "onClick: "+p.getProductTime());

                //所有接口类型的引用变量都可以直接赋给Object类型的亦是
                Object obj = o;
                break;
        }
    }
}
