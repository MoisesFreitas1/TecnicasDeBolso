package losfreitasapps.com.incidenciasradiologicas.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import losfreitasapps.com.incidenciasradiologicas.R;

/**
 * Created by Moises on 18/11/16.
 */

public class Abreviaturas extends Fragment {

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.abreviaturas,container,false);
        return view;
    }
}
