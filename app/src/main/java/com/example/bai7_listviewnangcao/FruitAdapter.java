package com.example.bai7_listviewnangcao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FruitAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Fruit> listFruit;

    private class ViewHolder{
        ImageView imgHinh;
        TextView txtTen, txtMota;

    }
    public FruitAdapter(Context context, int layout, List<Fruit> listFruit) {
        this.context = context;
        this.layout = layout;
        this.listFruit = listFruit;
    }

    @Override
    public int getCount() {
        return listFruit.size();
    }

    @Override
    public Object getItem(int i) {
        return listFruit.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder = new ViewHolder();
            //ánh xạ

            holder.txtTen = (TextView) view.findViewById(R.id.txtName);
            holder.txtMota = (TextView) view.findViewById(R.id.txtDescription);
            holder.imgHinh = (ImageView) view.findViewById(R.id.imageViewHinh);
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }



        //Gán Giá Trị
        Fruit fruit = listFruit.get(i);
        holder.txtTen.setText(fruit.getName());
        holder.txtMota.setText(fruit.getDescription());
        holder.imgHinh.setImageResource(fruit.getImage());


        return view;
    }
}
