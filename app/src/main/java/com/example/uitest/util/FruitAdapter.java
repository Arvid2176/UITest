package com.example.uitest.util;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.PluralsRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.uitest.R;
import com.example.uitest.entity.Fruit;

import java.util.List;

/**
 * Created by 安维 on 2017/4/25.
 */

public class FruitAdapter extends ArrayAdapter<Fruit> {
    private int resourceId;
    public FruitAdapter(Context context, int textResoutceID, List<Fruit> objects){
        super(context,textResoutceID,objects);
        resourceId=textResoutceID;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Fruit fruit=getItem(position);
        View view;
        ViewHolder viewHolder;
        if(convertView==null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.imageView = (ImageView) view.findViewById(R.id.fruit_img);
            viewHolder.textView=(TextView) view.findViewById(R.id.fruit_name);
            view.setTag(viewHolder);
        }
        else {
            view = convertView;
            viewHolder=(ViewHolder)view.getTag();
        }

        viewHolder.imageView.setImageResource(fruit.getImgID());
        viewHolder.textView.setText(fruit.getName());
        return view;
    }
    class ViewHolder{
        ImageView imageView;
        TextView textView;
    }
}
