package losfreitasapps.com.incidenciasradiologicas.Incidencias;

import java.util.ArrayList;
import java.util.List;

import losfreitasapps.com.incidenciasradiologicas.Model.Incidencia;
import losfreitasapps.com.incidenciasradiologicas.R;

/**
 * Created by Moises on 29/10/16.
 */

public class Cranio {
    private static List<Incidencia> icranio = new ArrayList<>();

    public static List<Incidencia> getIcranio() {
        if (icranio.isEmpty()) {
            Incidencia incidencia = new Incidencia();
            incidencia.setId(1L);
            incidencia.setTitulo("INCIDÊNCIA DE CRÂNIO AP");
            incidencia.setFoto1(R.drawable.c1l1);
            incidencia.setFoto2(R.drawable.c1l2);
            incidencia.setPosicionamento("Paciente em DD. Apoiar a região posterior do crânio sobre a LCM. Manter a LOM perpendicular ao filme, não podendo haver rotação no crânio.");
            incidencia.setRc("perpendicular, incidindo na glabela e saído no occipital.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("24x30cm, panorâmico, com buck.");
            incidencia.setDfofi("1m");
            icranio.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(2L);
            incidencia.setTitulo("INCIDÊNCIA DE CRÂNIO PERFIL");
            incidencia.setFoto1(R.drawable.c2l1);
            incidencia.setFoto2(R.drawable.c2l2);
            incidencia.setPosicionamento("Paciente em DV, em posição de nadador, com a cabeça em perfil absoluto. Alinhar o PMS paralelo a LCM e a LIP perpendicular ao filme, não podendo haver rotação do crânio.");
            incidencia.setRc("perpendicular, incidindo 5cm acima do MAE");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("24x30cm, panorâmico, com buck.");
            incidencia.setDfofi("1m");
            icranio.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(3L);
            incidencia.setTitulo("INCIDÊNCIA DE CRÂNIO - MÉTODO DE TOWNE");
            incidencia.setFoto1(R.drawable.c3l1);
            incidencia.setFoto2(R.drawable.c3l2);
            incidencia.setPosicionamento("Paciente em DD. Apoiar a região posterior do crânio sobre a LCM. Manter a LOM ou a LIOM de forma perpendicular ao filme. Certificar-se de não haja rotação da cabeça.");
            incidencia.setRc("com uma angulação de 30° caudal para a LOM ou 37° caudal para a LIOM, incidindo aproximadamente 5cm acima da glabela e saindo do forame magno.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("24x30cm, panorâmico, com buck.");
            incidencia.setDfofi("1m");
            icranio.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(4L);
            incidencia.setTitulo("INCIDÊNCIA DE CRÂNIO - MÉTODO DE CALDWELL");
            incidencia.setFoto1(R.drawable.c4l1);
            incidencia.setFoto2(R.drawable.c4l2);
            incidencia.setPosicionamento("Paciente em DV. Apoiar o frontal e o nariz sobre a LCM. Manter a LOM perpendicular ao filme. Alinhar o PMS sobre a LCM, certificando-se de que não haja rotação da cabeça.");
            incidencia.setRc("com uma angulação de 15° caudal saindo no násio. Pode-se alterar o RC de 25° a 30°, conforme a orientação médica.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("24x30cm, panorâmico, com buck.");
            incidencia.setDfofi("1m");
            icranio.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(5L);
            incidencia.setTitulo("INCIDÊNCIA DE CRÂNIO SUBMENTOVÉRTICE - MÉTODO DE HIRTZ");
            incidencia.setFoto1(R.drawable.c5l1);
            incidencia.setFoto2(R.drawable.c5l2);
            incidencia.setPosicionamento("Paciente em decúbito dorsal ou ortostático. Manter o PMS sobre a LCM ou LCE. Hiperestender o pescoço afim de manter a LIOM paralela ao filme. Certificar-se de que não aja rotação da cabeça.");
            incidencia.setRc("perpendicular a LIOM, incidindo a meio caminho entre os ângulos da mandíbula.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("24x30cm, panorâmico, com buck.");
            incidencia.setDfofi("1m");
            icranio.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(6L);
            incidencia.setTitulo("INCIDÊNCIA DE SELA TURCA PERFIL");
            incidencia.setFoto1(R.drawable.c6l1);
            incidencia.setFoto2(R.drawable.c6l2);
            incidencia.setPosicionamento("Paciente em DV e em posição de nadador, com a cabeça em perfil absoluto. Alinhar o PMS paralelo a LCM. Manter a LIP perpendicular ao filme.");
            incidencia.setRc("perpendicular, incidindo 2cm superior e 2 cm anterior ao MAE.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18X24cm, dividido transversalmente, com buck.");
            incidencia.setDfofi("1m");
            icranio.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(7L);
            incidencia.setTitulo("INCIDÊNCIA OSSOS DA FACE (SEIO DA FACE) - MÉTODO DE CALDWELL");
            incidencia.setFoto1(R.drawable.c7l1);
            incidencia.setFoto2(R.drawable.c7l2);
            incidencia.setPosicionamento("Paciente em DV, com o frontal e o nariz sobre a LCM. Manter o PMS sobre LCM. Retrair o queixo para manter a LOM perpendicular ao filme. Certificar-se de que não haja rotação na cabeça.");
            incidencia.setRc("com uma angulação de 15° caudal saindo do násio.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("24x30cm, dividido transversalmente, com buck.");
            incidencia.setDfofi("1m");
            icranio.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(8L);
            incidencia.setTitulo("INCIDÊNCIA DE ARCOS ZIGOMÁTICOS SUBMENTOVÉRTICES (SMV)");
            incidencia.setFoto1(R.drawable.c8l1);
            incidencia.setFoto2(R.drawable.c8l2);
            incidencia.setPosicionamento("Paciente em DD ou ortostático. Hiperestender o pescoço elevando o queixo até que a LIOM fique paralela ao filme. Alinhar o PMS sobre a LCM ou LCE. Certificar-se de que não haja rotação da cabeça.");
            incidencia.setRc("perpendicular incidindo aproximadamente 4cm inferior a sínfise mandibular.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("24x30cm, panorâmico, com buck.");
            incidencia.setDfofi("1m");
            icranio.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(9L);
            incidencia.setTitulo("INCIDÊNCIA DE NASAL PERFIL");
            incidencia.setFoto1(R.drawable.c9l1);
            incidencia.setFoto2(R.drawable.c9l2);
            incidencia.setPosicionamento("Paciente em DV e em posição de nadador, e cabeça em perfil absoluto. PMS paralelo a LCM e a LIP perpendicular ao filme, não podendo haver rotação da cabeça.");
            incidencia.setRc("perpendicular incidindo no meio do násio.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("13x18cm, panorâmico, com ou sem buck.");
            incidencia.setDfofi("1m");
            icranio.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(10L);
            incidencia.setTitulo("INCIDÊNCIA DE MANDÍBULA PA");
            incidencia.setFoto1(R.drawable.c10l1);
            incidencia.setFoto2(R.drawable.c10l2);
            incidencia.setPosicionamento("Paciente em DV. Apoiar o frontal e o nariz sobre a LCM. Fletir o queixo a fim de que a LOM fique perpendicular ao filme. PMS sobre a LCM, certificando-se de que não haja rotação na cabeça.");
            incidencia.setRc("perpendicular projetado para sair na junção dos lábios.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24cm, panorâmico, com buck.");
            incidencia.setDfofi("1m");
            icranio.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(11L);
            incidencia.setTitulo("INCIDÊNCIA DE MANDÍBULA PERFIL AXIAL");
            incidencia.setFoto1(R.drawable.c11l1);
            incidencia.setFoto2(R.drawable.c11l2);
            incidencia.setPosicionamento("Paciente em DD ou ortostático. Manter a cabeça em perfil. Estender o pescoço de forma que não haja superposição das vertebras cervicais. Girar a cabeça em 15°, 30° ou 45° para o lado de interesse. Cada angulação visualiza uma determinada região da mandíbula: 15° para um levantamento geral da mandíbula, 30° para e visualizar o corpo e 45° para o mento.");
            incidencia.setRc("com uma angulação de 25° cranial para sair no centro da mandíbula de interesse.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24cm, panorâmico, com buck.");
            incidencia.setDfofi("1m");
            icranio.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(12L);
            incidencia.setTitulo("INCIDÊNCIA DE FORAMES ÓPTICOS (PARIETO-ORBITAL) - MÉTODO DE RHESE");
            incidencia.setFoto1(R.drawable.c12l1);
            incidencia.setFoto2(R.drawable.c12l2);
            incidencia.setPosicionamento("Paciente em DV. Apoiar o nariz, bochecha e o mento sobre a LCM, girar a cabeça, obtendo, com o PMS um ângulo de 53° com o filme e manter a LAM perpendicular ao filme.");
            incidencia.setRc("perpendicular, incidindo na região parietal saindo na orbita a ser radiografada.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("13x18cm panorâmico ou 18x24cm, dividido transversalmente, com buck.");
            incidencia.setDfofi("1m");
            icranio.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(13L);
            incidencia.setTitulo("INCIDÊNCIA DE ATM PERFIL OBÍQUA - MÉTODO DE LAW MODIFICADO");
            incidencia.setFoto1(R.drawable.c13l1);
            incidencia.setFoto2(R.drawable.c13l2);
            incidencia.setPosicionamento("Paciente em DV, em posição de nadador. Manter a cabeça em perfil, manter a LIP perpendicular ao filme de girar 15° a face em direção ao filme, mantendo a ATM sobre LCM.");
            incidencia.setRc("com uma angulação de 15° caudal, incidindo 4 cm acima do MAE.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24cm, dividido transversalmente, com buck.");
            incidencia.setDfofi("1m");
            icranio.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(14L);
            incidencia.setTitulo("INCIDÊNCIA DE MASTÓIDE PERFIL AXIAL MÉTODO DE SCHULLER");
            incidencia.setFoto1(R.drawable.c14l1);
            incidencia.setFoto2(R.drawable.c14l2);
            incidencia.setPosicionamento("Paciente em DV, em posição de nadador com a cabeça em perfil. Manter a mastóide sobre a LCM e a LIP perpendicular ao filme. ");
            incidencia.setRc("angulado de 25° a 30° caudal, saindo na ponta da mastóide inferior.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24cm, dividido transversalmente, com buck.");
            incidencia.setDfofi("1m");
            icranio.add(incidencia);
        }
        return icranio;
    }
}

