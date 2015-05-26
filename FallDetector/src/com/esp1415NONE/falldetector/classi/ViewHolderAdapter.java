package com.esp1415NONE.falldetector.classi;

import com.esp1415NONE.falldetector.R;


import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


public class ViewHolderAdapter extends ArrayAdapter<MyObj> {

	private static String TAG = "RecycleAdapter";

	private LayoutInflater mInflater;

	public ViewHolderAdapter(Activity context, int textViewResourceId) {
		super(context, textViewResourceId);
		mInflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	static class ViewHolder {
		TextView text1;
		TextView text2;
		TextView text3;
		TextView text4;
		TextView text5;
		TextView text6;
		
	}

	public View getView(int position, View convertView, ViewGroup parent) {

		Log.d(TAG, "position=" + position);

		ViewHolder holder;

		if (convertView == null) {
			convertView = mInflater.inflate(R.layout.list_item, parent, false);
			holder = new ViewHolder();
			holder.text1 = (TextView) convertView.findViewById(R.id.text1);
			holder.text2 = (TextView) convertView.findViewById(R.id.text2);
			holder.text3 = (TextView) convertView.findViewById(R.id.text3);
			holder.text4 = (TextView) convertView.findViewById(R.id.text4);
			holder.text5 = (TextView) convertView.findViewById(R.id.text5);
			holder.text6 = (TextView) convertView.findViewById(R.id.text6);
			
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		MyObj data = getItem(position);
		holder.text1.setText(data.text1);
		holder.text2.setText(data.text2);
		holder.text3.setText(data.text3);
		holder.text4.setText(data.text4);
		holder.text5.setText(data.text5);
		holder.text6.setText(data.text6);
		

		return convertView;

	}

}