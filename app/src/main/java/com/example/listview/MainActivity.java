package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private ImageView mImageView;
    private TextView mTextView;
    private  String[] CQU_num={
            "20161707",
            "20161713",
            "20171591",
            "20171592",
            "20171616",
            "20171627",
            "20171641",
            "20171649",
            "20171650",
            "20171653",
            "20171654",
            "20171655",
            "20171656",
            "20171659",
            "20171664",
            "20171666",
            "20171667",
            "20171668",
            "20171669",
            "20171670",
            "20171679",
            "20171688",
            "20171697",
            "20171705",
            "20171707",
            "20171714",
            "20171717",
            "20171731",
            "20171742",
            "20175064",
            "20175980",
            "20175990"
    };

    private int[] icons={
            R.drawable.avatarb1,R.drawable.avatarb2,R.drawable.avatarb3,R.drawable.avatarb4,
            R.drawable.avatarb5,R.drawable.avatarb6,R.drawable.avatarb7,R.drawable.avatarb8,
            R.drawable.avatarb9,R.drawable.avatarb10,R.drawable.avatarb11,R.drawable.avatarb12,
            R.drawable.avatarb13,R.drawable.avatarb14,R.drawable.avatarb15,R.drawable.avatarb16,
            R.drawable.avatarb17,R.drawable.avatarb18,R.drawable.avatarb19,R.drawable.avatarb20,
            R.drawable.avatarb21,R.drawable.avatarb22,R.drawable.avatarb23,R.drawable.avatarb24,
            R.drawable.avatarb25,R.drawable.avatarb26,R.drawable.avatarb27,R.drawable.avatarb28,
            R.drawable.avatarb29,R.drawable.avatarb30,R.drawable.avatarb31,R.drawable.avatarb32,
    };

    private int[] icons1={
            R.drawable.avatar1,R.drawable.avatar2,R.drawable.avatar3,R.drawable.avatar4,
            R.drawable.avatar5,R.drawable.avatar6,R.drawable.avatar7,R.drawable.avatar8,
            R.drawable.avatar9,R.drawable.avatar10,R.drawable.avatar11,R.drawable.avatar12,
            R.drawable.avatar13,R.drawable.avatar14,R.drawable.avatar15,R.drawable.avatar16,
            R.drawable.avatar17,R.drawable.avatar18,R.drawable.avatar19,R.drawable.avatar20,
            R.drawable.avatar21,R.drawable.avatar22,R.drawable.avatar23,R.drawable.avatar24,
            R.drawable.avatar25,R.drawable.avatar26,R.drawable.avatar27,R.drawable.avatar28,
            R.drawable.avatar29,R.drawable.avatar30,R.drawable.avatar31,R.drawable.avatar32,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView=(ListView)findViewById(R.id.lv);
        mImageView=(ImageView)findViewById(R.id.iv_image);
        mListView.setAdapter(new MyBaseAdapter());
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                setContentView(R.layout.information);
                mImageView=(ImageView)findViewById(R.id.iv_image);
                mImageView.setImageResource(icons1[position]);
                mTextView=(TextView)findViewById(R.id.tv_informations);
                String str="I am a student,my CQU_number is "+CQU_num[position];
                mTextView.setText(str);
                Toast.makeText(MainActivity.this,"you"+position,Toast.LENGTH_LONG).show();
            }
        });

    }


    private class MyBaseAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return  CQU_num.length;
        }

        @Override
        public Object getItem(int position) {
            return CQU_num[position];
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        public  long getIteId(int podition){
            return podition;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {//组装数据
            View view=View.inflate(MainActivity.this,R.layout.list_item,null);//在list_item中有两个id,现在要把他们拿过来
            TextView mTextView=(TextView) view.findViewById(R.id.tv_list);
            ImageView imageView=(ImageView)view.findViewById(R.id.image);
            //组件一拿到，开始组装
            mTextView.setText(CQU_num[position]);
            imageView.setBackgroundResource(icons[position]);
            //组装玩开始返回
            return view;
        }
    }


}
