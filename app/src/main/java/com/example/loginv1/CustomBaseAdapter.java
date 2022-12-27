package com.example.loginv1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomBaseAdapter extends BaseAdapter {
    Context context;
    String booklsit[];
    int ListImages[];
    LayoutInflater inflater;

    public CustomBaseAdapter(Context ctx, String[] booklsit,int[] images){
        this.context= ctx;
        this.booklsit= booklsit;
        this.ListImages= images;
        inflater= LayoutInflater.from(ctx);
    }


    @Override
    public int getCount() {
        return booklsit.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = inflater.inflate(R.layout.activity_customlistview,null);
        TextView book_name = (TextView) view.findViewById(R.id.book_name);
        ImageView book_pic =(ImageView) view.findViewById(R.id.book_pic);
        book_name.setText(booklsit[i]);
        book_pic.setImageResource(ListImages[i]);
        return  view;

    }
}
