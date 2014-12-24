MultiRowsRadioGroup
===================

Android library to put your radio buttons in multiple rows, or any other layout

 ![image](https://github.com/linfaxin/MultiRowsRadioGroup/blob/master/demo/demo.gif)
 
Usage
-----
you can simple use in xml

 ```xml
         <com.linfaxin.multirowsradiogroup.MultiRowsRadioGroup
            android:id="@+id/radioGroup1"
            android:orientation="vertical"
            android:layout_width="match_parent"
            android:layout_height="wrap_content">
            <TextView
                android:id="@android:id/title"
                android:text="radioGroup1"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content" />
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:gravity="center_vertical">
                <RadioButton
                    android:text="text2"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content" />
                <RadioButton
                    android:text="text3"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content" />
            </LinearLayout>
            <RadioButton
                android:text="text4"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content" />
        </com.linfaxin.multirowsradiogroup.MultiRowsRadioGroup>
 ```
