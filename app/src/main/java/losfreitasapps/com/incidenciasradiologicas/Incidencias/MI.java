package losfreitasapps.com.incidenciasradiologicas.Incidencias;

import java.util.ArrayList;
import java.util.List;

import losfreitasapps.com.incidenciasradiologicas.Model.Incidencia;
import losfreitasapps.com.incidenciasradiologicas.R;

/**
 * Created by Moises on 29/10/16.
 */

public class MI {
    private static List<Incidencia> imi = new ArrayList<>();

    public static List<Incidencia> getImi() {
        if (imi.isEmpty()) {
            Incidencia incidencia = new Incidencia();
            incidencia.setId(1L);
            incidencia.setTitulo("INCIDÊNCIA DE DEDOS AP (ARTELHOS)");
            incidencia.setFoto1(R.drawable.mi1l1);
            incidencia.setFoto2(R.drawable.mi1l2);
            incidencia.setPosicionamento("Paciente em DD ou sentado sobre a mesa, de forma confortável, com o joelho fletido e o dedo de interesse apoiado sobre o chassi.");
            incidencia.setRc("com angulação de 10° a  15°em direção do calcâneo, incidindo na 2º articulação metatarsofalangiana.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("13x18 cm ou 18x24 cm, dividido transversalmente, sem buck.");
            incidencia.setDfofi("1m");
            imi.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(2L);
            incidencia.setTitulo("INCIDÊNCIA DE DEDOS OBLIQUA (ARTELHOS)");
            incidencia.setFoto1(R.drawable.mi2l1);
            incidencia.setFoto2(R.drawable.mi2l2);
            incidencia.setPosicionamento("Paciente em DD ou sentado sobre a mesa, de forma confortável, com o joelho fletido. Rodar o membro medialmente para o 1º, 2º e 3º dedos e lateralmente para o 4º e 5º dedos cerca de 45°.");
            incidencia.setRc("perpendicular, incidindo na articulação metatarsofalangiana.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("13x18 cm ou 18x24 cm, dividido transversalmente, sem buck.");
            incidencia.setDfofi("1m");
            imi.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(3L);
            incidencia.setTitulo("INCIDÊNCIA DE SESAMÓIDES - MÉTODO LEWIS");
            incidencia.setFoto1(R.drawable.mi3l1);
            incidencia.setFoto2(R.drawable.mi3l2);
            incidencia.setPosicionamento("Paciente em DV, de forma confortável. Dorsifletir o pé, de forma que a região plantar forme um ângulo de aproximadamente 15°A 20°. Assegurar que não haja rotação no pé, para uma melhor visualização dos sesamóides. ");
            incidencia.setRc("perpendicular, incidindo na face posterior da cabeça do hálux. Se o paciente não conseguir uma dorsiflexão adequada, será necessária uma pequena angulação no raio central para compensar.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("13x18 cm, panorâmico, sem buck.");
            incidencia.setDfofi("1m");
            imi.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(4L);
            incidencia.setTitulo("INCIDÊNCIA DE PÉ AP (DORSOPLANAR)");
            incidencia.setFoto1(R.drawable.mi4l1);
            incidencia.setFoto2(R.drawable.mi4l2);
            incidencia.setPosicionamento("Paciente em DD ou sentado sobre a mesa de forma confortável, com o joelho fletido e a região plantar sobre o chassi. Assegurar para que não haja rotação do pé.");
            incidencia.setRc("com angulação de 10° direcionado para o calcâneo, incidindo na base do 3º metatarso.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("24x30 cm, dividido longitudinalmente, sem buck.");
            incidencia.setDfofi("1m");
            imi.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(5L);
            incidencia.setTitulo("INCIDÊNCIA DE PÉ OBLÍQUA (ROTAÇÃO MEDIAL)");
            incidencia.setFoto1(R.drawable.mi5l1);
            incidencia.setFoto2(R.drawable.mi5l2);
            incidencia.setPosicionamento("Paciente em DD ou sentado sobre a mesa, de forma confortável. Fletir o joelho e rodar o membro medialmente até que o pé forme o ângulo de 30°a 40° em relação ao chassi.");
            incidencia.setRc("perpendicular, incidindo na base do 3° metatarso. ");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("24x30 cm, dividido longitudinalmente, sem buck.");
            incidencia.setDfofi("1m");
            imi.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(6L);
            incidencia.setTitulo("INCIDÊNCIA DE PÉ AP COM CARGA");
            incidencia.setFoto1(R.drawable.mi6l1);
            incidencia.setFoto2(R.drawable.mi6l2);
            incidencia.setPosicionamento("Paciente em ortostático sobre a mesa. Com os pés em AP sobre o chassi, distribuindo o peso sobre os mesmos; a perna do paciente deverá esta justaposta.");
            incidencia.setRc("Angulação de 15° no sentido dos ossos do tarso, entrando no centro dos mesmos.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("24x30 cm, panorâmico longitudinal, sem buck.");
            incidencia.setDfofi("1m");
            imi.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(7L);
            incidencia.setTitulo("INCIDÊNCIA DE CALCÂNEO AXIAL(PLANTODORSAL)");
            incidencia.setFoto1(R.drawable.mi7l1);
            incidencia.setFoto2(R.drawable.mi7l2);
            incidencia.setPosicionamento("Paciente em DD ou sentado sobre a mesa, de forma confortável e com membro totalmente estendido. Centralizar e alinhar articulação do tornozelo para que não haja rotação do calcâneo. Com uma fita fixada no pé, solicitar para o paciente tracionar, para manter a planta perpendicular ao chassi.");
            incidencia.setRc("entrando com uma angulação de 40° cranial, incidindo na base do 3° metatarso. ");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24 cm, dividido transversalmente, sem buck.");
            incidencia.setDfofi("1m");
            imi.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(8L);
            incidencia.setTitulo("INCIDÊNCIA DE CALCÂNEO PERFIL (MÉDIO LATERAL)");
            incidencia.setFoto1(R.drawable.mi8l1);
            incidencia.setFoto2(R.drawable.mi8l2);
            incidencia.setPosicionamento("Paciente em DL de forma confortável. Fletir o joelho afetado cerca de 40° para manter um perfil absoluto do calcâneo. Manter a perna oposta atrás do membro a ser radiografado, para melhor estabilidade do paciente. Se houve necessidade, colocar um suporte no joelho do paciente. Manter o tornozelo e o pé em um perfil verdadeiro, colocando o maléolo lateral cerca de 1cm posterior ao maléolo medial.");
            incidencia.setRc("peperdincular, incidindo em um ponto 2,5cm inferior ao maléolo medial.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24 cm, dividido transversalmente, sem buck.");
            incidencia.setDfofi("1m");
            imi.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(9L);
            incidencia.setTitulo("INCIDÊNCIA DE TORNOZELO AP");
            incidencia.setFoto1(R.drawable.mi9l1);
            incidencia.setFoto2(R.drawable.mi9l2);
            incidencia.setPosicionamento("Paciente em DD ou sentado sobre a mesa. Manter o membro estendido e alinhado. Ajusta o pé e o tornozelo para um AP verdadeiro, não podendo haver rotação. Para isso alinha intermaleolar não estará paralela ao chassi.");
            incidencia.setRc("peperdincular, incidindo para um ponto médio do tálus. ");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24 cm, dividido transversalmente, sem buck.");
            incidencia.setDfofi("1m");
            imi.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(10L);
            incidencia.setTitulo("INCIDÊNCIA DE TORNOZELO PERFIL (MÉDIO- LATERAL)");
            incidencia.setFoto1(R.drawable.mi10l1);
            incidencia.setFoto2(R.drawable.mi10l2);
            incidencia.setPosicionamento("Paciente em DL, de forma confortável e com o lado de interesse para baixo. Fletir o joelho do membro afetado a 40° e manter a perna oposta atrás da que irá ser radiografada, para melhor estabilidade para evitar super-rotação. Tracionar o pé dorsalmente de forma que superfície plantar esteja em um ângulo reto com a perna.");
            incidencia.setRc("peperdincular, incidindo no maléolo medial. ");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24 cm, dividido transversalmente, sem buck.");
            incidencia.setDfofi("1m");
            imi.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(11L);
            incidencia.setTitulo("INCIDÊNCIA DE TORNOZELO OBLÍQUA (ROTAÇÃO MEDIAL DE 45°)");
            incidencia.setFoto1(R.drawable.mi11l1);
            incidencia.setFoto2(R.drawable.mi11l2);
            incidencia.setPosicionamento("Paciente em DD ou sentado sobre a mesa, de forma confortável. Manter o membro estendido e se, necessário, com um calço sob o joelho, para melhor estabilidade.  Rodar medialmente todo o membro a 45°, simulando a incidência de encaixe do tornozelo AP.");
            incidencia.setRc("perpedincular, incidindo em um ponto medial entre os maléolos. ");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24 cm, dividido transversalmente, sem buck.");
            incidencia.setDfofi("1m");
            imi.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(12L);
            incidencia.setTitulo("INCIDÊNCIA DE PERNA AP ");
            incidencia.setFoto1(R.drawable.mi12l1);
            incidencia.setFoto2(R.drawable.mi12l2);
            incidencia.setPosicionamento("Paciente em DD ou sentado sobre a mesa, de forma confortável. Manter o membro estendido sem rotação. Para isso, é melhor alinhar a pelve, joelho e perna do paciente.");
            incidencia.setRc("perpedincular incidindo para um ponto médio da tíbia.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("30x40 cm ou 35x43 cm, dividido transversalmente, sem buck.");
            incidencia.setDfofi("1m");
            imi.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(13L);
            incidencia.setTitulo("INCIDÊNCIA DE PERNA PERFIL MÉDIO LATERAL");
            incidencia.setFoto1(R.drawable.mi13l1);
            incidencia.setFoto2(R.drawable.mi13l2);
            incidencia.setPosicionamento("Paciente em DL, com o membro a ser radiografado para baixo. O membro oposto deverá estar atrás do membro afetado. Flexionar o joelho cerca de 40° e manter a perna em perfil absoluto. Para isso a patela deverá estar perpendicular ao filme.");
            incidencia.setRc("perpedincular incidindo para um ponto médio da tíbia.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("30x40 cm ou 35x43 cm, dividido longitudinalmente, sem buck.");
            incidencia.setDfofi("1m");
            imi.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(14L);
            incidencia.setTitulo("INCIDÊNCIA DE JOELHO AP");
            incidencia.setFoto1(R.drawable.mi14l1);
            incidencia.setFoto2(R.drawable.mi14l2);
            incidencia.setPosicionamento("Paciente em DD, e com joelho a ser radiografado sobre a LCM, não podendo haver rotação na pelve, e com os membros estendidos. Rodar a perna medialmente de 3° a 5° , para manter a linha inte-repicondiliana paralela ao filme, deixando o joelho em um AP verdadeiro.");
            incidencia.setRc("perpedincular para uma paciente de coxas e nádegas medias, entre 19 e 24 cm, incidindo a 2cm distal ao ápice da patela. Se o paciente for < 19cm, 3° a 5° caudal coxas e nádegas pequenas; se for> 24cm, 3° a 5° cranial coxas e nádegas grandes.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("24x30 cm, dividido transversalmente, com ou sem buck.");
            incidencia.setDfofi("1m");
            imi.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(15L);
            incidencia.setTitulo("INCIDÊNCIA DE JOELHO PERFIL");
            incidencia.setFoto1(R.drawable.mi15l1);
            incidencia.setFoto2(R.drawable.mi15l2);
            incidencia.setPosicionamento("Paciente em DL, de forma confortável, com joelho a ser radiografado sobre a LCM, com o lado de interesse para baixo. O membro do lado oposto deverá está atrás do que está sendo radiografado. Para obter um perfil verdadeiro do joelho, verificar se os epicôndilos do fêmur estão sobrepostos. A patela deverá estar perpendicular ao plano do filme.");
            incidencia.setRc("com angulação de 5° a 7° cranial incidindo 2,5 cm distal do epicôndilo medial.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("24x30 cm, dividido transversalmente, com ou sem buck.");
            incidencia.setDfofi("1m");
            imi.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(16L);
            incidencia.setTitulo("INCIDÊNCIA DE JOELHO OBLIQUA ROTAÇÃO LATERAL");
            incidencia.setFoto1(R.drawable.mi16l1);
            incidencia.setFoto2(R.drawable.mi16l2);
            incidencia.setPosicionamento("Paciente em DD, com joelho a ser radiografado sobre a LCM, de forma confortável. Rodar o corpo e perna lateralmente a 45°.");
            incidencia.setRc("perpendicular  incidindo para um ponto médio 2 cm distal ao ápice da patela.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("24x30 cm, dividido transversalmente, com ou sem buck.");
            incidencia.setDfofi("1m");
            imi.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(17L);
            incidencia.setTitulo("INCIDÊNCIA DE JOELHO COM CARGA");
            incidencia.setFoto1(R.drawable.mi17l1);
            incidencia.setFoto2(R.drawable.mi17l2);
            incidencia.setPosicionamento("Paciente em ortostático, utilizando uma banqueta ou escadinha e descalço. Colocar os joelhos na posição de AP, com as articulações no centro do filme, tendo o peso do corpo distribuído igualmente nos MMII.");
            incidencia.setRc("perpendicular na vertical, entrando 2 cm abaixo do ápice da patela.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("24x30 cm ou 30x40 cm, panorâmico longitudinal, com buck.");
            incidencia.setDfofi("1m");
            imi.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(18L);
            incidencia.setTitulo("INCIDÊNCIA DE TÚNEL DO JOELHO PA - MÉTODO DE CAMP COVENTRY");
            incidencia.setFoto1(R.drawable.mi18l1);
            incidencia.setFoto2(R.drawable.mi18l2);
            incidencia.setPosicionamento("Paciente em DV, de forma confortável. Flexionar o joelho de 40° a 50°, elevando o pé. O paciente deverá estar alinhado com a mesa.");
            incidencia.setRc("com uma angulação de 40° a 50° caudal para que fique perpendicular a perna, incidindo na prega poplítea.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24 cm, panorâmico com ou sem buck.");
            incidencia.setDfofi("1m");
            imi.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(19L);
            incidencia.setTitulo("INCIDÊNCIA DE PATELA PA");
            incidencia.setFoto1(R.drawable.mi19l1);
            incidencia.setFoto2(R.drawable.mi19l2);
            incidencia.setPosicionamento("Paciente em DV e de forma confortável. Manter o joelho sobre a LCM e alinhado com a mesa. Usar um calço sob o tornozelo, e para um PA verdadeiro, solicitar uma rotação medial de 5° com o joelho.");
            incidencia.setRc("perpendicular, incidindo no meio da patela.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24 cm, dividido transversalmente, com buck.");
            incidencia.setDfofi("1m");
            imi.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(20L);
            incidencia.setTitulo("INCIDÊNCIA DE PATELA PERFIL");
            incidencia.setFoto1(R.drawable.mi20l1);
            incidencia.setFoto2(R.drawable.mi20l2);
            incidencia.setPosicionamento("Paciente em DL de forma confortável, com o lado de interesse para baixo. Fornecer o apoio para o joelho oposto, que estará atrás do joelho a ser radiografado. Alinhar o joelho com LCM de forma que não haja rotação, e fletir o joelho cerca de 5°a 10°.");
            incidencia.setRc("perpendicular, incidindo na articulação patelofemoral.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24 cm, dividido transversalmente, com buck.");
            incidencia.setDfofi("1m");
            imi.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(21L);
            incidencia.setTitulo("INCIDÊNCIA DE PATELA AXIAL - MÉTODO DE HUGHSTON");
            incidencia.setFoto1(R.drawable.mi21l1);
            incidencia.setFoto2(R.drawable.mi21l2);
            incidencia.setPosicionamento("Paciente em DV e de forma confortável. Fletir o joelho a 45°. Apoiar o pé do paciente sobre o colimador. Certificar-se de que não haja rotação do membro.");
            incidencia.setRc("com uma angulação de 15° a 20° cranial, incidindo na articulação patelofemoral.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24 cm, dividido transversalmente, com ou sem buck.");
            incidencia.setDfofi("1m");
            imi.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(22L);
            incidencia.setTitulo("INCIDÊNCIA DE PATELA AXIAL - MÉTODO DE SETTEGAST");
            incidencia.setFoto1(R.drawable.mi22l1);
            incidencia.setFoto2(R.drawable.mi22l2);
            incidencia.setPosicionamento("Paciente em DV e de forma confortável. Fletir o joelho a 90° e manter esta posição com uma faixa. Certificar-se de que não haja rotação do membro.");
            incidencia.setRc("com uma angulação de 15° a 20° cranial, incidindo na articulação patelofemoral.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24 cm, dividido transversalmente, com ou sem buck.");
            incidencia.setDfofi("1m");
            imi.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(23L);
            incidencia.setTitulo("INCIDÊNCIA DE FÊMUR AP ");
            incidencia.setFoto1(R.drawable.mi23l1);
            incidencia.setFoto2(R.drawable.mi23l2);
            incidencia.setPosicionamento("Paciente em DD, de forma confortável. O membro deverá estar centralizado a LCM. Rodar a perna medialmente 5° para que o fêmur fique em posição de AP verdadeiro.");
            incidencia.setRc("perpendicular, incidindo para um ponto médio do fêmur.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("30x40 cm ou 35x43 cm, dividido longitudinalmente, com buck.");
            incidencia.setDfofi("1m");
            imi.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(24L);
            incidencia.setTitulo("INCIDÊNCIA DE FÊMUR PERFIL");
            incidencia.setFoto1(R.drawable.mi24l1);
            incidencia.setFoto2(R.drawable.mi24l2);
            incidencia.setPosicionamento("Paciente em DL, de forma confortável. Fletir o joelho a aproximadamente 45° e alinhar o fêmur com a LCM. Manter o membro oposto estendido e com um calço sobre a perna.");
            incidencia.setRc("perpendicular, incidindo para um ponto médio do fêmur.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("30x40 cm ou 35x43 cm, dividido longitudinalmente, com buck.");
            incidencia.setDfofi("1m");
            imi.add(incidencia);
        }
        return imi;
    }
}

