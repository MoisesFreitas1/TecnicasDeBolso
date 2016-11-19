package losfreitasapps.com.incidenciasradiologicas.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import losfreitasapps.com.incidenciasradiologicas.Model.Incidencia;
import losfreitasapps.com.incidenciasradiologicas.R;

/**
 * Created by Moises on 29/10/16.
 */

public class IncidenciaAdapter extends BaseAdapter {

    private List<Incidencia> incidenciaList;
    private Context context;
    private LayoutInflater layoutInflater;

    public IncidenciaAdapter(List<Incidencia> incidenciaList, Context context) {
        this.incidenciaList = incidenciaList;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return incidenciaList.size();
    }

    @Override
    public Object getItem(int position) {
        return incidenciaList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return incidenciaList.get(position).getId();
    }

    @Override
    public View getView(int position, View parent, ViewGroup viewGroup) {
        View item = layoutInflater.inflate(R.layout.item_incidencia_list, viewGroup, false);

        Incidencia incidencia = incidenciaList.get(position);

        TextView titulo = (TextView) item.findViewById(R.id.item_layout_titulo);
        titulo.setText(incidencia.getTitulo());

        return item;
    }
}
