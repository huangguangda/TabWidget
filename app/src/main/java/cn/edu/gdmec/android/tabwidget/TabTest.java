package cn.edu.gdmec.android.tabwidget;

import android.app.TabActivity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.Toast;

public class TabTest extends TabActivity {
    TabHost tabhost;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_tab_test );
        tabhost = getTabHost();
        tabhost.addTab(tabhost.newTabSpec("tab1").setIndicator("TAB 1",getResources().getDrawable(R.drawable.img1)).setContent(R.id.text1));
        tabhost.addTab(tabhost.newTabSpec("tab2").setIndicator("TAB 2",getResources().getDrawable(R.drawable.img2)).setContent(R.id.text2));
        tabhost.addTab(tabhost.newTabSpec("tab3").setIndicator("TAB 3",getResources().getDrawable(R.drawable.img3)).setContent(R.id.text3));
        //设置TabHost的背景颜色
        tabhost.setBackgroundColor( Color.argb(150,22,70,150));
        //设置TabHost的背景图片资源
        tabhost.setBackgroundResource(R.drawable.bg0);
        //设置当前显示哪个标签
        tabhost.setCurrentTab(0);
        //标签切换事件处理，setOnTabChangedListener
        tabhost.setOnTabChangedListener(new TabHost.OnTabChangeListener ()
        {
            public void onTabChanged(String tabId)
            {
                Toast toast=Toast.makeText(getApplicationContext(), "现在是"+tabId+"标签", Toast.LENGTH_SHORT);
                toast.show ();
            }
        });
    }
}
