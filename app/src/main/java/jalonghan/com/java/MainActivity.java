package jalonghan.com.java;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import jalonghan.com.java.OOP.Abstract.Circle;
import jalonghan.com.java.OOP.Abstract.Shape;
import jalonghan.com.java.OOP.Abstract.Triangle;
import jalonghan.com.java.OOP.Cache.CacheImmutale;
import jalonghan.com.java.OOP.FunctionOfAbstract.CarSpeedMeter;
import jalonghan.com.java.OOP.Interface.Output;
import jalonghan.com.java.OOP.InterfaceImplemnts.Computer;
import jalonghan.com.java.OOP.InterfaceImplemnts.OutputFactory;
import jalonghan.com.java.OOP.InterfaceImplemnts.Printer;
import jalonghan.com.java.OOP.InterfaceImplemnts.Product;
import jalonghan.com.java.OOP.Lambda.LambdaQs;
import jalonghan.com.java.OOP.MinglingMoshi.AddCommand;
import jalonghan.com.java.OOP.MinglingMoshi.PrintCommand;
import jalonghan.com.java.OOP.MinglingMoshi.ProcessArray;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final String TAG = "MainActivity";
    private Button mCacheImmutale;
    private Button mAbstracttest;
    private Button mFunctionOfAbstract;
    private Button mInterface;
    private Button mInterfaceUse;
    private Button mInterfaceFactory;
    private Button mMinglingMoshi;
    private Button mLamBda;
    private Button mSystemLei;

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
        mInterfaceFactory = (Button) findViewById(R.id.InterfaceFactory);
        mInterfaceFactory.setOnClickListener(this);
        mMinglingMoshi = (Button) findViewById(R.id.MinglingMoshi);
        mMinglingMoshi.setOnClickListener(this);
        mLamBda = (Button) findViewById(R.id.LamBda);
        mLamBda.setOnClickListener(this);
        mSystemLei = (Button) findViewById(R.id.SystemLei);
        mSystemLei.setOnClickListener(this);
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
                o.print("孙悟空", "猪八戒", "白骨精");
                o.test();
                //创建一个Printer对象,当成Product使用
                Product p = new Printer();

                Log.i(TAG, "onClick: " + p.getProductTime());

                //所有接口类型的引用变量都可以直接赋给Object类型的亦是
                Object obj = o;
                break;
            case R.id.InterfaceFactory:
                //工厂模式
                OutputFactory of = new OutputFactory();

                Computer c = new Computer(of.getOutput());

                c.keyIn("轻量级Java EE企业应用实践");
                c.keyIn("疯狂java讲义");
                c.print();


                break;
            case R.id.MinglingMoshi:

                ProcessArray pa = new ProcessArray();

                int[] target = {3, -4, 6, 4};

                //第一次处理数据,具体处理行为取决 于PrintCommand
                pa.process(target, new PrintCommand());
                Log.i(TAG, "onClick: ---------------------------");
                //第二次处理数据,具体处理行为取决于AddCommand
                pa.process(target, new AddCommand());


                break;
            case R.id.LamBda:


                ProcessArray pa1 = new ProcessArray();

                int[] t = {3, -4, 6, 4};

//                pa1.process(t, new Command() {
//                    @Override
//                    public void process(int[] target) {
//                        int num = 0;
//                        for (int tmp :
//                                target) {
//                            num += tmp;
//                        }
//                        Toast.makeText(MainActivity.this, "数组元素总合是" + num, Toast.LENGTH_SHORT).show();
//                    }
//                });

                pa1.process(t, (int[] array) -> {
                    int num = 0;
                    for (int tmp : array) {
                        num += tmp;
                    }
                    Toast.makeText(MainActivity.this, "数组元素总合是" + num, Toast.LENGTH_SHORT).show();
                });


                LambdaQs lq = new LambdaQs();
                //Lambda表达式的代码块只有一条语句,可以省略花括号
                lq.eat(() -> Log.i(TAG, "onClick: 苹果的味道不错!"));
                //Lambda表达式的形参列表只有一个形参,可以省略圆括号
                lq.drive(Weather -> {
                    Log.i(TAG, "onClick: 今天的天气是:" + Weather);
                    Log.i(TAG, "onClick: 直升机飞行平稳");
                });
                //Lambda表达式的代码块只有一条语句,可以省略花括号
                //代码块中只有一条语句,即使该表达式需要返回值,也可以省略return关键字
                lq.test(((a, b) -> a + b));
                break;
            case R.id.SystemLei:

                Map<String,String> env = System.getenv();

                for (String name :
                        env.keySet()) {
                    Log.i(TAG, "onClick:"+name+"name ---->"+env.get(name));
                }

                //获取指定的环境变量的值
                System.out.println(System.getenv("JAVA_HOME"));
                //获取所有的系统属性
                Properties props = System.getProperties();
                //将所有的系统属性保存到props.txt文件中
                try {
                    props.store(new FileOutputStream("props.txt"),"System Properties");
                } catch (IOException e) {
                    e.printStackTrace();
                }

                //输出特定的系统属性
                Log.i(TAG, "onClick: "+System.getProperty("os.name"));
                //该方法返回指定对象的精确hashCode值
                System.identityHashCode("String");
                Objects.requireNonNull(env);
                break;
        }
    }
}
