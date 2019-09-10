package com.example.student.myapplication;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SpinerAdapter extends BaseAdapter {
    private List<Spiner> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public SpinerAdapter(Context aContext, List<Spiner>listData){
        this.context=aContext;
        this.listData = listData;
        layoutInflater = LayoutInflater.from(aContext);
    }
    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    static class ViewHolder {
        ImageView flagView;
        ImageView imgView;
        TextView nameView;
        TextView namsinhView;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){
            convertView = layoutInflater.inflate(R.layout.list_item_layout,null);
            holder = new ViewHolder();
            holder.imgView = (ImageView) convertView.findViewById(R.id.img1);
            holder.flagView = (ImageView) convertView.findViewById(R.id.img12);
            holder.nameView = (TextView) convertView.findViewById(R.id.tv1);
            holder.namsinhView = (TextView) convertView.findViewById(R.id.tv12);
        }
        else{holder = (ViewHolder)convertView.getTag();}
        Spiner spiner = this.listData.get(position);
        holder.nameView.setText(spiner.getNamSinh());
        holder.namsinhView.setText("NamSinh : " + spiner.getNamSinh());
        int imgID = this.getMipmapResIdbyName(spiner.getImgName());
        holder.flagView.setImageResource(imgID);
        int flagID = this.getMipmapResIdbyName(spiner.getFlagName());
        holder.flagView.setImageResource(flagID);
        return null;
    }
    public int getMipmapResIdbyName(String resName){
        String pkgName = context.getPackageName();
        int resID = context.getResources().getIdentifier(resName,"mipmap",pkgName);
        Log.i("myapplication","Res Name"+resName+"==>Res ID ="+ resID);
        return resID;
    }
}
