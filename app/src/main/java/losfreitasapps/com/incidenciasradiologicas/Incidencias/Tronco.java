package losfreitasapps.com.incidenciasradiologicas.Incidencias;

import java.util.ArrayList;
import java.util.List;

import losfreitasapps.com.incidenciasradiologicas.Model.Incidencia;
import losfreitasapps.com.incidenciasradiologicas.R;

/**
 * Created by Moises on 29/10/16.
 */

public class Tronco {
    private static List<Incidencia> itronco = new ArrayList<>();

    public static List<Incidencia> getItronco() {
        if (itronco.isEmpty()) {
            Incidencia incidencia = new Incidencia();
            incidencia.setId(1L);
            incidencia.setTitulo("INCIDÊNCIA DE PELVE AP");
            incidencia.setFoto1(R.drawable.maiorq);
            incidencia.setFoto2(R.drawable.maiorq);
            incidencia.setPosicionamento("Paciente em DD e com os braços sobre o tórax, de forma confortável, com o plano mediossagital sobre a LCM, membros estendidos e com uma pequena separação para rodá-los internamente cerca de 15° a 20°, para melhor alinhamento da pelve.");
            incidencia.setRc("perpendicular, incidindo para um ponto médio do fêmur.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("30x40, 35x35, ou 35x43 cm, panorâmico, com buck.");
            incidencia.setDfofi("1m");
            itronco.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(2L);
            incidencia.setTitulo("INCIDÊNCIA DE PELVE AP (POSIÇÃO DE RÃ) MÉDOTO DE CLEAVES MODIFICADO");
            incidencia.setFoto1(R.drawable.maiorq);
            incidencia.setFoto2(R.drawable.maiorq);
            incidencia.setPosicionamento("Paciente em DD e com os braços sobre o tórax, de forma confortável, com o plano mediossagital sobre a LCM. Fletir ambos os membros a 90°, unir a região plantar dos pés e abduzir por igual cera de 40° a 45°, certificando-se de que não haja rotação na pelve.");
            incidencia.setRc("perpendicular, incidindo a 7,5 cm abaixo da eias.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("30x40, 35x35, ou 35x43 cm, panorâmico, com buck.");
            incidencia.setDfofi("1m");
            itronco.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(3L);
            incidencia.setTitulo("INCIDÊNCIA DE PELVE AP AXIAL (ENTRADA)");
            incidencia.setFoto1(R.drawable.maiorq);
            incidencia.setFoto2(R.drawable.maiorq);
            incidencia.setPosicionamento("Paciente em DD, membros estendidos e braços sobre o tórax, de forma confortável. Manter o plano mediossagital sobre a LCM, não podendo haver rotação na pelve.");
            incidencia.setRc("com uma angulação de 40° caudal, incidindo para um ponto médio a nível das eias.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("30x40, 35x35, ou 35x43 cm, panorâmico, com buck.");
            incidencia.setDfofi("1m");
            itronco.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(4L);
            incidencia.setTitulo("INCIDÊNCIA DE QUADRIL AP (HEMIPELVE)");
            incidencia.setFoto1(R.drawable.maiorq);
            incidencia.setFoto2(R.drawable.maiorq);
            incidencia.setPosicionamento("Paciente em DD, membros estendidos e braços sobre o tórax, de forma confortável. Alinha com a LCM o quadril a ser radiografado. Fazer uma rotação medial com a perna de 15° a 20°.");
            incidencia.setRc("perpendicular, incidindo para a cabeça do fêmur.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24, ou 24x30 cm, panorâmico, com buck.");
            incidencia.setDfofi("1m");
            itronco.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(5L);
            incidencia.setTitulo("INCIDÊNCIA DE ARTICULAÇÃO SACROILÍACAS AXIAL AP");
            incidencia.setFoto1(R.drawable.maiorq);
            incidencia.setFoto2(R.drawable.maiorq);
            incidencia.setPosicionamento("Paciente em DD, membros estendidos e braços sobre o tórax, de forma confortável. Alinha o plano mediossagital com a LCM, não podendo haver rotação na pelve. ");
            incidencia.setRc("com uma angulação de 30° a 45° cranial, incidindo 5cm abaixo do nível das eias.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("24x30 cm, panorâmico, com buck.");
            incidencia.setDfofi("1m");
            itronco.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(6L);
            incidencia.setTitulo("INCIDÊNCIA DE COLUNA CERVICAL AP");
            incidencia.setFoto1(R.drawable.maiorq);
            incidencia.setFoto2(R.drawable.maiorq);
            incidencia.setPosicionamento("Paciente em ortostático e de forma confortável. Alinhar o PMS com o LCE. Traçar uma linha entre o mento e occipital, para mantê-los no mesmo plano.");
            incidencia.setRc("com uma angulação de 15° a 20° cranial, incidindo na 4º vertebra cervical (C4).");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24 cm, panorâmico, com buck.");
            incidencia.setDfofi("1m");
            itronco.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(7L);
            incidencia.setTitulo("INCIDÊNCIA DE COLUNA CERVICAL AP TRANSORAL (BOCA ABERTA)");
            incidencia.setFoto1(R.drawable.maiorq);
            incidencia.setFoto2(R.drawable.maiorq);
            incidencia.setPosicionamento("Paciente em DD ou ortostático, de forma confortável, com os braços ao longo do corpo. Alinhar PMS com a LCM ou LCE. Alinhar a cabeça com a boca aberta, traçando uma linha perpendicular do maxilar até a tuberosidade das mastoides, em um plano perpendicular, não podendo haver rotação no crânio e no tórax. Manter a boca bem aberta durante a exposição.");
            incidencia.setRc("perpendicular, incidindo na C2.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("13x18 ou 18x24 cm, panorâmico, com buck.");
            incidencia.setDfofi("1m");
            itronco.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(8L);
            incidencia.setTitulo("INCIDÊNCIA DE COLUNA CERVICAL PERFIL");
            incidencia.setFoto1(R.drawable.maiorq);
            incidencia.setFoto2(R.drawable.maiorq);
            incidencia.setPosicionamento("Paciente em ortostático, de forma confortável, com o ombro apoiado no buck, vertical e em perfil absoluto. Dar pesos por igual para o paciente segurar a fim de se visualizar C7 e T1. Solicitar para que eleve o queixo.");
            incidencia.setRc("perpendicular, ao nível de C4.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24 cm, panorâmico, com buck.");
            incidencia.setDfofi("1,80m");
            itronco.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(9L);
            incidencia.setTitulo("INCIDÊNCIA DE COLUNA CERVICAL OBLIQUA ANTERIOR");
            incidencia.setFoto1(R.drawable.maiorq);
            incidencia.setFoto2(R.drawable.maiorq);
            incidencia.setPosicionamento("Paciente em ortostático, de forma confortável e obliquando a 45° anterior, com os braços ao longo do corpo e o queixo ereto para se evitar que se sobreponham as vertebras cervicais.");
            incidencia.setRc("angulação de 15° a 20° caudal, incidindo ao nível da C4.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24 cm, panorâmico, com buck.");
            incidencia.setDfofi("1,80m");
            itronco.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(10L);
            incidencia.setTitulo("INCIDÊNCIA DE COLUNA CERVICAL OBLIQUA POSTERIOR");
            incidencia.setFoto1(R.drawable.maiorq);
            incidencia.setFoto2(R.drawable.maiorq);
            incidencia.setPosicionamento("Paciente em ortostático, de forma confortável e obliquando a 45° posterior, com os braços ao longo do corpo e o queixo ereto para se evitar que se sobreponham as vertebras cervicais.");
            incidencia.setRc("angulação de 15° a 20° cranial, incidindo ao nível da C4.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24 cm, panorâmico, com buck.");
            incidencia.setDfofi("1,80m");
            itronco.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(11L);
            incidencia.setTitulo("INCIDÊNCIA DE COLUNA TORÁCICA AP");
            incidencia.setFoto1(R.drawable.maiorq);
            incidencia.setFoto2(R.drawable.maiorq);
            incidencia.setPosicionamento("Paciente em DD ou ortostático, de forma confortável com os membros ao longo do corpo. Alinhar o PMS sobre a LCM ou LCE. Certificar-se de que não haja rotação na cintura pélvica.");
            incidencia.setRc("perpendicular incidindo ao nível de T7.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("30x40 cm, dividido longitudinalmente, com buck.");
            incidencia.setDfofi("1m");
            itronco.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(12L);
            incidencia.setTitulo("INCIDÊNCIA DE COLUNA TORÁCICA PERFIL");
            incidencia.setFoto1(R.drawable.maiorq);
            incidencia.setFoto2(R.drawable.maiorq);
            incidencia.setPosicionamento("Paciente em DL deitado ou ortostático, com os braços elevados acima da cabeça ou sobre as orelhas, de forma confortável. Fletir os joelhos e calçá-los para melhor estabilidade se for deitado.");
            incidencia.setRc("perpendicular incidindo ao nível de T7.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("30x40 cm, dividido longitudinalmente, com buck.");
            incidencia.setDfofi("1m");
            itronco.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(13L);
            incidencia.setTitulo("INCIDÊNCIA DE COLUNA LOMBAR AP");
            incidencia.setFoto1(R.drawable.maiorq);
            incidencia.setFoto2(R.drawable.maiorq);
            incidencia.setPosicionamento("Paciente em DD ou ortostático, de forma confortável, com os joelhos levemente fletidos. Alinhar o PMS sobre a LCM. Certificar-se de que não haja rotação na cintura pélvica.");
            incidencia.setRc("perpendicular incidindo 3cm acima da crista ilíaca.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("30x40 cm, dividido longitudinalmente, com buck.");
            incidencia.setDfofi("1m");
            itronco.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(14L);
            incidencia.setTitulo("INCIDÊNCIA DE COLUNA LOMBAR PERFIL");
            incidencia.setFoto1(R.drawable.maiorq);
            incidencia.setFoto2(R.drawable.maiorq);
            incidencia.setPosicionamento("Paciente em DL, com os braços elevados e as mãos sob a orelha. Fletir os joelhos para melhor estabilidade. Alinhar a coluna sobre a LCM. Certificar-se de que não haja rotação na pelve e tronco do paciente.");
            incidencia.setRc("perpendicular incidindo ao nível de L3.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("30x40 cm, dividido longitudinalmente, com buck.");
            incidencia.setDfofi("1m");
            itronco.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(15L);
            incidencia.setTitulo("INCIDÊNCIA DE COLUNA LOMBAR OBLIQUA POSTERIOR E ANTERIOR.");
            incidencia.setFoto1(R.drawable.maiorq);
            incidencia.setFoto2(R.drawable.maiorq);
            incidencia.setPosicionamento("Paciente em semi-DD ou DV, de forma confortável. Alinhar a coluna vertebral sobre a LCM. Fletir o joelho para melhor estabilidade. Manter 45° de obliquidade em relação a mesa tanto na anterior quanto na posterior.");
            incidencia.setRc("perpendicular ao nível de L3.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("30x40 cm, dividido longitudinalmente, com buck.");
            incidencia.setDfofi("1m");
            itronco.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(16L);
            incidencia.setTitulo("INCIDÊNCIA DE COLUNA LOMBAR PERFIL L5-S1 (LOCALIZADA)");
            incidencia.setFoto1(R.drawable.maiorq);
            incidencia.setFoto2(R.drawable.maiorq);
            incidencia.setPosicionamento("Paciente em DL, com o terço posterior das cristas ilíacas na LCM, os braços elevados, com as mãos na altura das orelhas, os cotovelos erguidos, as pernas fletidas e justapostas. Certificar-se de que não haja rotação no tronco e na pelve.");
            incidencia.setRc("perpendicular na vertical, entrando de 5 a 10 cm posterior da eias.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24 cm, longitudinal panorâmico, com buck.");
            incidencia.setDfofi("1m");
            itronco.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(17L);
            incidencia.setTitulo("INCIDÊNCIA DE SACRO AXIAL AP");
            incidencia.setFoto1(R.drawable.maiorq);
            incidencia.setFoto2(R.drawable.maiorq);
            incidencia.setPosicionamento("Paciente em DD. Alinhar a coluna sobre a LCM, de forma confortável. Certificar-se de que não haja rotação no tronco e pelve.");
            incidencia.setRc("angulação de 15° cranial, incidindo nas eias.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("24x30cm, panorâmico, com buck.");
            incidencia.setDfofi("1m");
            itronco.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(18L);
            incidencia.setTitulo("INCIDÊNCIA DE SACRO E CÓCCIX PERFIL");
            incidencia.setFoto1(R.drawable.maiorq);
            incidencia.setFoto2(R.drawable.maiorq);
            incidencia.setPosicionamento("Paciente em DL, com os joelhos fletidos e os braços acima da cabeça, de forma confortável. Alinhar o sacro sobre a LCM e certificar-se de que não haja rotação no tronco e pelve do paciente.");
            incidencia.setRc("perpendicular incidindo no centro do sacro.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("24x30cm, panorâmico, com buck.");
            incidencia.setDfofi("1m");
            itronco.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(19L);
            incidencia.setTitulo("INCIDÊNCIA DE ESTERNO PERFIL");
            incidencia.setFoto1(R.drawable.maiorq);
            incidencia.setFoto2(R.drawable.maiorq);
            incidencia.setPosicionamento("Paciente em ortostático em perfil. Manter as mãos para atrás da cabeça. Alinhar o esterno sobre a LCE. Certificar-se de que não haja rotação do tronco e pelve.");
            incidencia.setRc("perpendicular, incidindo no meio do esterno.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("24x30cm, panorâmico, com buck.");
            incidencia.setDfofi("1,80m");
            itronco.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(20L);
            incidencia.setTitulo("INCIDÊNCIA DE ESTERNO OAD");
            incidencia.setFoto1(R.drawable.maiorq);
            incidencia.setFoto2(R.drawable.maiorq);
            incidencia.setPosicionamento("Paciente em ortostático, com PMS sobre a LCE, angulado a 45° em relação ao plano da estativa, encostando a parte anterior do tórax na mesma.");
            incidencia.setRc("perpendicular na horizontal, entrando na altura do centro do esterno.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("24x30cm, panorâmico longitudinal, com buck.");
            incidencia.setDfofi("1m");
            itronco.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(21L);
            incidencia.setTitulo("INCIDÊNCIA DA ATICULAÇÃO ESTERNOCLAVICULAR PA");
            incidencia.setFoto1(R.drawable.maiorq);
            incidencia.setFoto2(R.drawable.maiorq);
            incidencia.setPosicionamento("Paciente em DV, com os braços acima da cabeça e a articulação esternoclavicular alinhada sobre a LCM. Certificar-se de que não haja rotação na pelve e tronco do paciente.");
            incidencia.setRc("perpendicular, incidindo ao nível da T2.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24cm, panorâmico, com buck.");
            incidencia.setDfofi("1m");
            itronco.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(22L);
            incidencia.setTitulo("INCIDÊNCIA DE COSTELAS ANTERIORES PA");
            incidencia.setFoto1(R.drawable.maiorq);
            incidencia.setFoto2(R.drawable.maiorq);
            incidencia.setPosicionamento("Paciente em ortostático, com o tórax encostado na estativa. Alinhar o PMS sobre a LCE. Elevar o queixo para evitar superposição e elevar os braços para a frente. Certificar-se de que não haja rotação na pelve e no tórax.");
            incidencia.setRc("perpendicular, incidindo ao nível da T7.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("35x35cm, panorâmico, com buck.");
            incidencia.setDfofi("1m");
            itronco.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(23L);
            incidencia.setTitulo("INCIDÊNCIA DE COSTELAS OBLÍQUAS ANTERIOR E POSTERIOR ");
            incidencia.setFoto1(R.drawable.maiorq);
            incidencia.setFoto2(R.drawable.maiorq);
            incidencia.setPosicionamento("Paciente em ortostático ou em DD. Fazer uma obliquidade de 45° com o paciente, anterior e posterior. Elevar o queixo para evitar superposição e alinhar o PMS sobre a LCE, LCM.");
            incidencia.setRc("perpendicular, incidindo ao nível da T7.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("35x35cm ou 30x40cm, panorâmico, com buck.");
            incidencia.setDfofi("1m");
            itronco.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(24L);
            incidencia.setTitulo("INCIDÊNCIA DE TÓRAX PA");
            incidencia.setFoto1(R.drawable.maiorq);
            incidencia.setFoto2(R.drawable.maiorq);
            incidencia.setPosicionamento("Paciente em ortostático, com o peito encostado na estativa, queixo elevado, pernas levemente afastadas para melhor estabilidade, com o dorso das mãos sobre a cintura pélvica e ombros elevados para frente. Alinhar o PMS sobre a LCE e certificar-se de que não haja rotação no tronco e pelve do paciente.");
            incidencia.setRc("perpendicular, incidindo ao nível da T7.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("35x35cm ou 35x43cm, panorâmico, com buck.");
            incidencia.setDfofi("1,80m");
            itronco.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(25L);
            incidencia.setTitulo("INCIDÊNCIA DE TÓRAX PERFIL");
            incidencia.setFoto1(R.drawable.maiorq);
            incidencia.setFoto2(R.drawable.maiorq);
            incidencia.setPosicionamento("Paciente em ortostático em perfil, com o lado de interesse apoiado na estativa, com as mãos sobre as orelhas, queixo elevado e pernas afastadas, para melhor estabilidade. Certificar-se de que não haja rotação no tronco e pelve. Alinhar o PMS sobre a LCE.");
            incidencia.setRc("perpendicular, incidindo ao nível da T7.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("35x35cm ou 30x40cm, panorâmico, com buck.");
            incidencia.setDfofi("1,80m");
            itronco.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(26L);
            incidencia.setTitulo("INCIDÊNCIA DE TÓRAX DECÚBITO LATERAL - MÉTODO DE LAURELL");
            incidencia.setFoto1(R.drawable.maiorq);
            incidencia.setFoto2(R.drawable.maiorq);
            incidencia.setPosicionamento("Paciente em DL, em uma maca, apoiado na estativa, com os braços sobre a cabeça, da melhor maneira possível. Certificar-se de que não haja rotação no tronco e na pelve. Alinhar o PMS sobre a LCE.");
            incidencia.setRc("perpendicular na horizontal, incidindo ao nível da T7.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("35x43cm, panorâmico, com buck.");
            incidencia.setDfofi("1,80m");
            itronco.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(27L);
            incidencia.setTitulo("INCIDÊNCIA DE ABDOME AP DECÚBITO DORSAL");
            incidencia.setFoto1(R.drawable.maiorq);
            incidencia.setFoto2(R.drawable.maiorq);
            incidencia.setPosicionamento("Paciente em DD e de forma confortável. Braços ao longo do corpo. Alinhar o PMS sobre a LCM. Certificar-se de que não haja rotação no tronco e na pelve.");
            incidencia.setRc("perpendicular, incidindo ao nível do umbigo, ou das eias.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("35x43cm, panorâmico, com buck.");
            incidencia.setDfofi("1m");
            itronco.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(28L);
            incidencia.setTitulo("INCIDÊNCIA DE ABDOME AP ORTOSTÁTICO");
            incidencia.setFoto1(R.drawable.maiorq);
            incidencia.setFoto2(R.drawable.maiorq);
            incidencia.setPosicionamento("Paciente em ortostático, de costas para estativa, com o queixo elevado e as pernas ligeiramente afastadas para melhor estabilidade. Certificar-se de que não haja rotação do tronco e pelve. Alinhar o PMS sobre a LCE.");
            incidencia.setRc("perpendicular, incidindo no centro do filme.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("35x43cm, panorâmico, com buck.");
            incidencia.setDfofi("1m");
            itronco.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(29L);
            incidencia.setTitulo("INCIDÊNCIA DE CÚPULAS DIAFRAGMÁTICAS AP");
            incidencia.setFoto1(R.drawable.maiorq);
            incidencia.setFoto2(R.drawable.maiorq);
            incidencia.setPosicionamento("Paciente em ortostático, com as costas apoiadas na estativa, e as pernas levemente afastadas, para melhor estabilidade e com os braços abduzidos. Certificar-se de que não haja rotação no tronco.");
            incidencia.setRc("perpendicular, incidindo ao nível do apêndice xifóide.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("30x40cm, panorâmico, com buck.");
            incidencia.setDfofi("1,80m");
            itronco.add(incidencia);
        }
        return itronco;
    }
}

