package sg.edu.rp.c346.mobilesoftwaredevelopment;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ModuleAdapter extends ArrayAdapter<Module> {

    private Context context;
    private ArrayList<Module> module;
    private TextView tvModuleCode;
    private ImageView ivProg;

    public ModuleAdapter(Context context, int resource, ArrayList<Module> objects) {
        super(context, resource, objects);

        module = objects;

        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.module, parent, false);

        tvModuleCode = (TextView) rowView.findViewById(R.id.textViewModules);

        ivProg = (ImageView) rowView.findViewById(R.id.imageViewModules);

        Module currentModule = module.get(position);

        tvModuleCode.setText(currentModule.getCode());

        if (currentModule.isProg()) {
            ivProg.setImageResource(R.drawable.prog);
        } else {
            ivProg.setImageResource(R.drawable.nonprog);
        }

        return rowView;
    }
}

