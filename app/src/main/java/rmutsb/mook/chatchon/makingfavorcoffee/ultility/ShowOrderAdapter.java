package rmutsb.mook.chatchon.makingfavorcoffee.ultility;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import rmutsb.mook.chatchon.makingfavorcoffee.R;

/**
 * Created by masterung on 4/1/2018 AD.
 */

public class ShowOrderAdapter extends BaseAdapter {

    private Context context;
    private String[] nameStrings, typeStrings, esppsoStrings,
            cocoStrings, milkStrings, ferStrings;

    public ShowOrderAdapter(Context context,
                            String[] nameStrings,
                            String[] typeStrings,
                            String[] esppsoStrings,
                            String[] cocoStrings,
                            String[] milkStrings,
                            String[] ferStrings) {
        this.context = context;
        this.nameStrings = nameStrings;
        this.typeStrings = typeStrings;
        this.esppsoStrings = esppsoStrings;
        this.cocoStrings = cocoStrings;
        this.milkStrings = milkStrings;
        this.ferStrings = ferStrings;
    }

    @Override
    public int getCount() {
        return nameStrings.length;
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

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.listview_order, viewGroup, false);

        TextView nameTextView = view1.findViewById(R.id.txtName);
        TextView typeTextView = view1.findViewById(R.id.txttype);
        TextView espressoTextView = view1.findViewById(R.id.txtEspresso);
        TextView cocoTextView = view1.findViewById(R.id.txtcoco);
        TextView milkTextView = view1.findViewById(R.id.txtMilk);
        TextView ferTextView = view1.findViewById(R.id.txtFar);

        nameTextView.setText(nameStrings[i]);
        typeTextView.setText(typeStrings[i]);
        espressoTextView.setText(esppsoStrings[i]);
        cocoTextView.setText(cocoStrings[i]);
        milkTextView.setText(milkStrings[i]);
        ferTextView.setText(ferStrings[i]);


        return view1;
    }
}
