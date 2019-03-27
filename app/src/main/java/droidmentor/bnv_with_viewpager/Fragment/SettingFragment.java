package droidmentor.bnv_with_viewpager.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.maiml.library.BaseItemLayout;
import com.maiml.library.config.ConfigAttrs;
import com.maiml.library.config.Mode;

import java.util.ArrayList;
import java.util.List;

import droidmentor.bnv_with_viewpager.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SettingFragment extends Fragment {


    public SettingFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onStart() {
        super.onStart();
        itemLayout();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_setting2, container, false);
    }
    protected void itemLayout(){
        BaseItemLayout layout = (BaseItemLayout) getView().findViewById(R.id.layout);
        //
        List<String> valueList = new ArrayList<>();

        valueList.add("反馈");
        valueList.add("分享");
        valueList.add("清除缓存");
        valueList.add("关于");

        List<Integer> resIdList = new ArrayList<>();

        resIdList.add(R.drawable.ic_request);
        resIdList.add(R.drawable.ic_share);
        resIdList.add(R.drawable.ic_delete);
        resIdList.add(R.drawable.ic_about);
        ConfigAttrs attrs = new ConfigAttrs(); // 把全部参数的配置，委托给ConfigAttrs类处理。
        //参数 使用链式方式配置
        attrs.setValueList(valueList)  // 文字 list
                .setResIdList(resIdList) // icon list
                .setIconWidth(24)  //设置icon 的大小
                .setIconHeight(24)
                .setItemMode(Mode.NORMAL);
        layout.setConfigAttrs(attrs)
                .create(); //
    }
}
