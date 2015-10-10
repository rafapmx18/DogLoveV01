package som.pe.edu.ulima.doglovev01;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


class Login extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        Button ingresar = (Button) findViewById(R.id.butIngresar);



        ingresar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String codigo = ((EditText) findViewById(R.id.txtCodigo)).getText().toString();
                String password = ((EditText) findViewById(R.id.txtContraseña)).getText().toString();
                if (codigo.equals("20100543") && password.equals("admin")) {


                    Intent intent = new Intent(Login.this, MenuOpciones.class);
                    Login.this.startActivity(intent);
                    finish();
                }


            }
        });

        Button nuevo=(Button ) findViewById(R.id.butNuevo);
        nuevo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                Intent intent = new Intent(Login.this, RegistroActivity.class);
                Login.this.startActivity(intent);
                finish();


            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
