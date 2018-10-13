package signos.studio.com.signos;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private ListView listaSignos;
    private String [] signos = {
            "Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra",
            "Escorpião", "Sagitário", "Capricórnio", "Áquário", "Peixes"
    };

    private String[] perfis = {
            "Os arianos tem prazer em conquistar as coisas isso é um fato. Para eles, é muito comum que depois de cumprir uma missão, perder completamente a graça.",
            "Os taurinos são mais práticos do que intelectuais, adoram uma rotina e aproveitam muito bem a vida. Quando precisam mudar algo, essa mudança demora um bom tempo para acontecer.",
            "Geminianos costumam ser carinhosos e generosos, e como o próprio nome do signo diz, eles se sentem seguros quando encontram pessoas que as tem as mesmas ideias.",
            "Cancerianos são emotivos, tem espírito protetor e são simpáticos, mas eles podem mudar de humor de uma hora para outra.",
            "Generosidade e lealdade são características de pessoas desse signo. Além disso, eles são grandes líderes e não tem medo de enfrentar obstáculos.",
            "Sempre perfeccionistas e muito precisos. Um virginiano geralmente são muito inteligentes e modestos ao mesmo tempo.",
            "Pessoas de libra são pacíficos e sociáveis, as vezes eles preferem escolher a imparcialidade, e por isso costumam ser indecisos.",
            "Uma escorpiano quer estar sempre presente nas horas das decisões. Adora se envolver em causas e influenciar os demais.",
            "Sagitarianos são pessoas muito positivas, sempre buscam novos desafios e novas ideias, o único problema é que eles costumam ser exagerados.",
            "Disciplinados, ambiciosos, bom senso de humor e reservados. Os capricornianos são perfeccionistas com suas tarefas.",
            "Para pessoas de Aquário as vezes é difícil perceber o lado emotivo das coisas, por isso podem parecer indiferentes em momentos de emoção.",
            "Muito sensíveis e com uma imaginação fértil, os piscianos são amáveis e adoram compaixão, mas odeia ser criticado."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaSignos = findViewById(R.id.listViewId);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signos
        );

        listaSignos.setAdapter(adaptador);

        listaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int codigoPosicao = position;
                Toast.makeText(getApplicationContext(), perfis[codigoPosicao] ,Toast.LENGTH_LONG).show();
            }
        });

    }
}
