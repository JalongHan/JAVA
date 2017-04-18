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

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final String TAG = "MainActivity";
    private Button mCacheImmutale;
    private Button mAbstracttest;

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

                Shape s1 = new Triangle("黑色",3,4,5);
                Shape s2 = new Circle("黄色",3);
                Log.i(TAG, "abstracttest: "+s1.getType());
                Log.i(TAG, "abstracttest: "+s1.calPerimeter());
                Log.i(TAG, "abstracttest: "+s2.getType());
                Log.i(TAG, "abstracttest: "+s2.calPerimeter());
                s1.


                break;
        }
    }
}
