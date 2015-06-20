package com.online.market.adapter;

import java.util.List;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.online.market.R;
import com.online.market.adapter.base.MyBaseAdapter;
import com.online.market.adapter.base.ViewHolder;
import com.online.market.beans.CommodityBean;

public class CommodityAdapter extends MyBaseAdapter {

	private List<CommodityBean> beans;
	
	public CommodityAdapter(Context context, List<CommodityBean> beans) {
		super(context);
		this.beans = beans;
	}

	@Override
	public int getCount() {
		return beans.size();
	}

	@Override
	public Object getItem(int arg0) {
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		return arg0;
	}

	@Override
	public View getView(int arg0, View convertView, ViewGroup arg2) {
		if (convertView == null) {
			convertView = mInflater.inflate(R.layout.commodity_item, null);
		}
		ImageView commodityPic =ViewHolder.get(convertView, R.id.commodity_pic);
		TextView commodityName =ViewHolder.get(convertView,R.id.commodity_name);
		TextView commoditySold =ViewHolder.get(convertView,R.id.commodity_sold);
		TextView commodityPrice = ViewHolder.get(convertView,R.id.commodity_price);
		final CommodityBean bean=beans.get(arg0);
		commodityName.setText(bean.getName());
		commoditySold.setText("已售"+bean.getSold());
		commodityPrice.setText(""+bean.getPrice());

		return convertView;
	}
	

}
