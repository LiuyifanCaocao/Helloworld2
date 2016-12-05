package com.jredu.liuyifan.helloworld.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by DELL on 2016/12/5.
 */
public class SelfView  extends LinearLayout{
    private String Text = "";

    public SelfView(Context context) {
        this(context, null);
        // TODO Auto-generated constructor stub
    }

    public SelfView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
        int resouceId = -1;

        TextView tv = new TextView(context);
        EditText et = new EditText(context);

        resouceId = attrs.getAttributeResourceValue(null, "Text", 0);
        if (resouceId > 0) {
            Text = context.getResources().getText(resouceId).toString();
        } else {
            Text = "";
        }
        tv.setText(Text);

        addView(tv);
        addView(et, new LinearLayout.LayoutParams(LayoutParams.FILL_PARENT,
                LayoutParams.WRAP_CONTENT));
        this.setGravity(LinearLayout.VERTICAL);

    }
}
