package losfreitasapps.com.incidenciasradiologicas.Fragments;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import losfreitasapps.com.incidenciasradiologicas.R;

/**
 * Created by Moises on 17/11/16.
 */

public class FReferencias extends Fragment {
    private TextView bontrager, leal;

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.referencias,container,false);

        bontrager = (TextView) view.findViewById(R.id.bontrager);
        bontrager.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Uri uri = Uri.parse("http://www.loja.elsevier.com.br/site/produtos/Detalhe-Produto.aspx?tid=94114&seg=2&isbn=9788535273045&origem=Destaque%20-%20Mais%20Comprado%20Medicina&evp=&tit=Tratado%20de%20Posicionamento%20Radiografico%20e%20Anatomia%20Associada%20-%208%20EDI%C3%87%C3%83O");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);
                    }
                });
        leal = (TextView) view.findViewById(R.id.leal);
        leal.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Uri uri = Uri.parse("http://www.outmed.com.br/posicionamento-e-imaginologia-manual-do-estagiario");
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);
                    }
                });
        return view;
    }
}
