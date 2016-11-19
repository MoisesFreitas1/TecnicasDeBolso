package losfreitasapps.com.incidenciasradiologicas.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import losfreitasapps.com.incidenciasradiologicas.R;

public class HomeActivity extends AppCompatActivity {
    private TextView cranio;
    private TextView tronco;
    private TextView ms;
    private TextView mi;
    private String tecnicas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        cranio = (TextView) findViewById(R.id.cranio);
        cranio.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick (View v){
                        Intent i = new Intent(v.getContext(), MainActivity.class);
                        i.putExtra("cranio", tecnicas);
                        startActivity(i);
                    }
                });
        tronco = (TextView) findViewById(R.id.tronco);
        tronco.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick (View v){
                        Intent i = new Intent(v.getContext(), MainActivity.class);
                        i.putExtra("tronco", tecnicas);
                        startActivity(i);
                    }
                });
        ms = (TextView) findViewById(R.id.ms);
        ms.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick (View v){
                        Intent i = new Intent(v.getContext(), MainActivity.class);
                        i.putExtra("ms", tecnicas);
                        startActivity(i);
                    }
                });
        mi = (TextView) findViewById(R.id.mi);
        mi.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick (View v){
                        Intent i = new Intent(v.getContext(), MainActivity.class);
                        i.putExtra("mi", tecnicas);
                        startActivity(i);
                    }
                });
    }
}
