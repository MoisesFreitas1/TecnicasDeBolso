package losfreitasapps.com.incidenciasradiologicas.Fragments;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import losfreitasapps.com.incidenciasradiologicas.Adapter.IncidenciaAdapter;
import losfreitasapps.com.incidenciasradiologicas.Incidencias.MS;
import losfreitasapps.com.incidenciasradiologicas.R;
import losfreitasapps.com.incidenciasradiologicas.ShowActivities.ShowMSActivity;

/**
 * Created by Moises on 30/10/16.
 */

public class FMS extends Fragment {
    ListView incidenciaListview;

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_main,container,false);

        incidenciaListview = (ListView) view.findViewById(R.id.mainActivity_incidenciaList);

        IncidenciaAdapter adapter = new IncidenciaAdapter(MS.getIms(), getActivity());

        incidenciaListview.setAdapter(adapter);

        incidenciaListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                int size = incidenciaListview.getCount();
                Intent intent = new Intent(getActivity(), ShowMSActivity.class);
                intent.putExtra("id_list", position);
                intent.putExtra("sz_list", size);
                startActivity(intent);
            }
        });
        return view;
    }
}
