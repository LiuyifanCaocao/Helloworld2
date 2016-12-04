package com.jredu.liuyifan.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by DELL on 2016/8/26.
 */
public class New1 extends Activity {
    ListView listView;
    List<Map<String,Object>> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);
        /*listView = (ListView) findViewById(R.id.list1);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                New1.this,
                android.R.layout.simple_list_item_1,
                new  String[]{"我是刘逸凡","帅逼","高手","土豪","哈哈"}
        );
        listView.setAdapter(arrayAdapter);*/
        listView = (ListView) findViewById(R.id.list1);
        list = new ArrayList<Map<String, Object>>();
        Map<String,Object> new1 = new HashMap<String, Object>();
        new1.put("title","刘逸凡是帅逼sdf");
        new1.put("content","刘逸凡是高手dgsg1");
        new1.put("img",R.drawable.pig);
        list.add(new1);
        Map<String,Object> new2 = new HashMap<String, Object>();
        new2.put("title","刘逸凡是帅逼sdf");
        new2.put("content","刘逸凡是高手sadf1");
        new2.put("img",R.drawable.pig);
        list.add(new2);
        Map<String,Object> new3 = new HashMap<String, Object>();
        new3.put("title","刘逸凡是帅逼a");
        new3.put("content","刘逸凡是高手sdfg1");
        new3.put("img",R.drawable.pig);
        list.add(new3);
        SimpleAdapter simpleAdapter = new SimpleAdapter(
                New1.this,
                list,
                R.layout.simplenew,
                new String[]{"title","content","img"},
                new int[]{R.id.title,R.id.content,R.id.img}
                );
        listView.setAdapter(simpleAdapter);
    }
}
