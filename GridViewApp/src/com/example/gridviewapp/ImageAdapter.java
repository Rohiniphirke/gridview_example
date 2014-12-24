package com.example.gridviewapp;

import android.app.ActionBar.LayoutParams;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
	
	private Context mContext;
	public ImageAdapter(Context context){
		mContext = context;
	}

	@Override
	public int getCount() {
		
		
		return mThumbIds.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView imageView;
		if(convertView == null){
			imageView = new ImageView(mContext);
			imageView.setLayoutParams(new GridView.LayoutParams(150,150));
			imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
			imageView.setPadding(5, 5,5,5);
		}
		else
		{
			imageView = (ImageView) convertView;
		}
		imageView.setImageResource(mThumbIds[position]);
		
		return imageView;
	}
		
	public Integer[] mThumbIds = {
			R.drawable.image1,R.drawable.image2,
			R.drawable.image3,R.drawable.image4,
			R.drawable.image6,R.drawable.image5,
			R.drawable.image7,R.drawable.image1,
			R.drawable.image2,R.drawable.image3,
			R.drawable.image8,R.drawable.image9
			
			
			
	};

}
