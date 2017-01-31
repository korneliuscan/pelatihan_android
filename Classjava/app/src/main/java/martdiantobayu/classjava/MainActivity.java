package martdiantobayu.classjava;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public String showString;
    public TextView showText;
    public barang[] arrbarang = new barang[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showText = (TextView) findViewById(R.id.show_text);


        showString = "Manipulasi Class java Android";
        addSeparator();

        initbarang();
        showString+=arrbarang[1].toString();
        addSeparator();
        showText.setText(showString);
    }

    public void addSeparator() {
        showString += "\n------------------------------\n";
    }

    public void initbarang(){
        arrbarang[0] = new barang("laptop", 1, 700000);
        arrbarang[1] = new barang("Printer", barang.ELEKTRONIK, 700000);
        arrbarang[2] = new barang("kipas", barang.NEW_ELEKTRONIK, 700000);
        arrbarang[3] = new barang("hp", barang.NEW_ELEKTRONIK, 80000000);
    }
}
