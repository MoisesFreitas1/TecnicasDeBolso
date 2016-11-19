package losfreitasapps.com.incidenciasradiologicas.ShowActivities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import losfreitasapps.com.incidenciasradiologicas.Incidencias.Tronco;
import losfreitasapps.com.incidenciasradiologicas.Model.Incidencia;
import losfreitasapps.com.incidenciasradiologicas.R;

/**
 * Created by Moises on 30/10/16.
 */

public class ShowTroncoActivity extends AppCompatActivity {
    private Incidencia incidencia;
    private TextView tv_incidenciaTitulo, tv_incidencia, rc, colimar, ch, dfofi;
    private ImageView iv_incidencia, direita, esquerda;
    Integer szList, idList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_incidencia);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView toolbar_title = (TextView) findViewById(R.id.toolbar_title);
        toolbar_title.setText("  Tronco");

        ImageView ic_back = (ImageView) findViewById(R.id.iv_back);
        ic_back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        esquerda = (ImageView) findViewById(R.id.esquerda);
        direita = (ImageView) findViewById(R.id.direita);
        esquerda.setImageResource(R.drawable.nulo);
        direita.setImageResource(R.drawable.ic_direita);

        ImageView voltar = (ImageView) findViewById(R.id.voltar);
        voltar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(idList>0) {
                    idList = idList - 1;
                    incidencia = Tronco.getItronco().get(idList);
                    tv_incidenciaTitulo.setText(incidencia.getTitulo());
                    tv_incidencia.setText(incidencia.getPosicionamento());
                    rc.setText(incidencia.getRc());
                    colimar.setText(incidencia.getColimar());
                    ch.setText(incidencia.getCh());
                    dfofi.setText(incidencia.getDfofi());
                    iv_incidencia.setImageResource(incidencia.getFoto1());
                    esquerda.setImageResource(R.drawable.nulo);
                    direita.setImageResource(R.drawable.ic_direita);
                    Toast.makeText(ShowTroncoActivity.this, (idList+1)+" de " + (szList)+"\n"+incidencia.getTitulo(), Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(ShowTroncoActivity.this, 1 +" de " + (szList)+"\n"+incidencia.getTitulo(), Toast.LENGTH_SHORT).show();
                }
            }
        });
        ImageView avancar = (ImageView) findViewById(R.id.avancar);
        avancar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(idList<(szList-1)) {
                    idList = idList + 1;
                    incidencia = Tronco.getItronco().get(idList);
                    tv_incidenciaTitulo.setText(incidencia.getTitulo());
                    tv_incidencia.setText(incidencia.getPosicionamento());
                    rc.setText(incidencia.getRc());
                    colimar.setText(incidencia.getColimar());
                    ch.setText(incidencia.getCh());
                    dfofi.setText(incidencia.getDfofi());
                    iv_incidencia.setImageResource(incidencia.getFoto1());
                    esquerda.setImageResource(R.drawable.nulo);
                    direita.setImageResource(R.drawable.ic_direita);
                    Toast.makeText(ShowTroncoActivity.this, (idList+1) +" de "+(szList)+"\n"+incidencia.getTitulo(), Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(ShowTroncoActivity.this, (szList) +" de " + (szList)+"\n"+incidencia.getTitulo(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        if (getIntent().hasExtra("id_list")) {
            idList = getIntent().getIntExtra("id_list", 46666);
            if (idList != 46666) {
                incidencia = Tronco.getItronco().get(idList);
            }
        }
        if (getIntent().hasExtra("sz_list")) {
            szList = getIntent().getIntExtra("sz_list", 46666);
        }

        tv_incidenciaTitulo = (TextView) findViewById(R.id.tv_incidenciaTitulo);
        tv_incidencia = (TextView) findViewById(R.id.tv_incidencia);
        rc = (TextView) findViewById(R.id.rc);
        colimar = (TextView) findViewById(R.id.colimar);
        ch = (TextView) findViewById(R.id.ch);
        dfofi = (TextView) findViewById(R.id.dfofi);
        iv_incidencia = (ImageView) findViewById(R.id.iv_incidencia);

        tv_incidenciaTitulo.setText(incidencia.getTitulo());
        tv_incidencia.setText(incidencia.getPosicionamento());
        rc.setText(incidencia.getRc());
        colimar.setText(incidencia.getColimar());
        ch.setText(incidencia.getCh());
        dfofi.setText(incidencia.getDfofi());
        iv_incidencia.setImageResource(incidencia.getFoto1());

        esquerda.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                iv_incidencia.setImageResource(incidencia.getFoto1());
                esquerda.setImageResource(R.drawable.nulo);
                direita.setImageResource(R.drawable.ic_direita);
            }
        });
        direita.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                iv_incidencia.setImageResource(incidencia.getFoto2());
                direita.setImageResource(R.drawable.nulo);
                esquerda.setImageResource(R.drawable.ic_esquerda);
            }
        });
    }
}
