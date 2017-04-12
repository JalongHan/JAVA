package jalonghan.com.java;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import jalonghan.com.java.OOP.Cache.CacheImmutale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final String TAG = "MainActivity";
    private Button mCacheImmutale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();




    }

    private void initView() {
        mCacheImmutale = (Button) findViewById(R.id.CacheImmutale);

        mCacheImmutale.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //测试缓存地址是否相同
            case R.id.CacheImmutale:
                CacheImmutale c1 = CacheImmutale.valueOf("hello");
                CacheImmutale c2 = CacheImmutale.valueOf("hello");
                Log.i(TAG, "onCreate: " + (c1 == c2));

                break;
        }
    }
}
