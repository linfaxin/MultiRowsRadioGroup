package com.linfaxin.multirowsradiogroup.demo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class DemoActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);
        radioGroup1.setOnCheckedChangeListener(onCheckedChangeListener);

        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.radioGroup2);
        radioGroup2.setOnCheckedChangeListener(onCheckedChangeListener);

        RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.radioGroup3);
        radioGroup3.setOnCheckedChangeListener(onCheckedChangeListener);

    }
    RadioGroup.OnCheckedChangeListener onCheckedChangeListener = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            CompoundButton cb = (CompoundButton) group.findViewById(checkedId);
            if(cb!=null && cb.isChecked()){
                TextView titleTv = ((TextView)group.findViewById(android.R.id.title));
                if(titleTv!=null){
                    titleTv.setText("selected:"+cb.getText());
                }
            }
        }
    };

}
