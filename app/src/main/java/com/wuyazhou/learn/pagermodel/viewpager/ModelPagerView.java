package com.wuyazhou.learn.pagermodel.viewpager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import com.wuyazhou.learn.pagermodel.R;
import com.wuyazhou.learn.pagermodel.showlogview.ShowLogUtil;

/**
 * @author 吴亚洲
 * @date 2018.7.7
 * @function
 */
public class ModelPagerView extends FrameLayout implements View.OnClickListener {
    private Context mContext = null;
    private RelativeLayout mLayout;

    public ModelPagerView(Context context) {
        super(context);
        mContext = context;
        initView();
    }

    public ModelPagerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        initView();
    }

    public ModelPagerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
        initView();
    }

    public void initView() {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mLayout = (RelativeLayout) inflater.inflate(R.layout.pager_model_layout, null);

        addView(mLayout);

        View model  = mLayout.findViewById(R.id.model_button);
        model.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.model_button:
                ShowLogUtil.addLog("123");
                break;
            default:
                break;
        }
    }
}
