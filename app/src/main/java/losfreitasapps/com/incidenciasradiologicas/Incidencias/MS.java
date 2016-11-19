package losfreitasapps.com.incidenciasradiologicas.Incidencias;

import java.util.ArrayList;
import java.util.List;

import losfreitasapps.com.incidenciasradiologicas.Model.Incidencia;
import losfreitasapps.com.incidenciasradiologicas.R;

/**
 * Created by Moises on 29/10/16.
 */

public class MS {
    private static List<Incidencia> ims = new ArrayList<>();

    public static List<Incidencia> getIms() {
        if (ims.isEmpty()) {
            Incidencia incidencia = new Incidencia();
            incidencia.setId(1L);
            incidencia.setTitulo("INCIDÊNCIA DE DEDOS DA MÃO PA");
            incidencia.setFoto1(R.drawable.ms1l1);
            incidencia.setFoto2(R.drawable.ms1l2);
            incidencia.setPosicionamento("Paciente sentado na extremidade da mesa, de forma confortável, fazendo uma angulação de 90° com o cúbito, mantendo a articulação do ombro, cúbito e punho no mesmo plano para não haver rotação nos dedos a serem radiografados.");
            incidencia.setRc("perpendicular, incidindo o centro da articulação interfalangiana proximal.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("13x18 ou 18x24 cm, dividido longitudinalmente, sem buck.");
            incidencia.setDfofi("1m");
            ims.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(2L);
            incidencia.setTitulo("INCIDÊNCIA DE DEDOS DA MÃO OBLIQUA");
            incidencia.setFoto1(R.drawable.ms2l1);
            incidencia.setFoto2(R.drawable.ms2l2);
            incidencia.setPosicionamento("Paciente sentado na extremidade da mesa, de forma confortável, fazendo uma angulação de 90° com o cúbito, mantendo a articulação do ombro, cúbito e punho no mesmo plano, fazendo com que a mão e o punho estejam em uma angulação de 45°.");
            incidencia.setRc("perpendicular, incidindo o centro da articulação interfalangiana proximal.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("13x18 ou 18x24 cm, dividido longitudinalmente, sem buck.");
            incidencia.setDfofi("1m");
            ims.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(3L);
            incidencia.setTitulo("INCIDÊNCIA DE DEDOS DA MÃO PERFIL");
            incidencia.setFoto1(R.drawable.ms3l1);
            incidencia.setFoto2(R.drawable.ms3l2);
            incidencia.setPosicionamento("Paciente sentado na extremidade da mesa, de forma confortável, fazendo uma angulação de 90° com o cúbito mantendo a articulação do ombro e do cúbito no mesmo plano, deixando o dedo a ser radiografado em perfil absoluto.");
            incidencia.setRc("perpendicular, incidindo o meio da articulação interfalangiana proximal.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("13x18 ou 18x24 cm dividido longitudinalmente, sem buck.");
            incidencia.setDfofi("1m");
            ims.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(4L);
            incidencia.setTitulo("INCIDÊNCIA DE POLEGAR PA");
            incidencia.setFoto1(R.drawable.ms4l1);
            incidencia.setFoto2(R.drawable.ms4l2);
            incidencia.setPosicionamento("Paciente sentado na extremidade da mesa, de forma confortável, fazendo uma angulação de 90° com o cúbito mantendo a articulação do ombro, cúbito e do punho no mesmo plano. Manter a mão em perfil absoluto para o polegar ficar em PA junto a mão.");
            incidencia.setRc("perpendicular, incidindo na 1º articulação metacarpo falangiana.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("13x18 ou 18x24 cm dividido longitudinalmente, sem buck.");
            incidencia.setDfofi("1m");
            ims.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(5L);
            incidencia.setTitulo("INCIDÊNCIA DE POLEGAR AP");
            incidencia.setFoto1(R.drawable.ms5l1);
            incidencia.setFoto2(R.drawable.ms5l2);
            incidencia.setPosicionamento("Paciente de melhor modo possível, na extremidade da mesa, demonstre a posição ao paciente, pois e de difícil entendimento. Rodar a mão internamente, com os dedos estendidos, de modo que a face posterior do polegar fique encostada paralelamente ao filme. Caso necessário, peça ao paciente para segurar os outros dedos para trás. ");
            incidencia.setRc("perpendicular na vertical, entrando na 1°articulação metacarpofalangiana.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("13x18 dividido transversalmente, sem buck.");
            incidencia.setDfofi("1m");
            ims.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(6L);
            incidencia.setTitulo("INCIDÊNCIA DE POLEGAR OBLIQUA");
            incidencia.setFoto1(R.drawable.ms6l1);
            incidencia.setFoto2(R.drawable.ms6l2);
            incidencia.setPosicionamento("Paciente sentado na extremidade da mesa, de forma confortável, com o membro estendido, fazendo uma angulação com o cotovelo  de 90°, deixando articulação do ombro, cotovelo e punho no mesmo plano. Manter a palma da mão sobre o chassi para que o polegar fique em uma obliqua de 45°.");
            incidencia.setRc("perpendicular, incluindo na  1°articulação metacarpofalangiana.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("13x18 ou 18x24 cm dividido longitudinalmente, sem buck.");
            incidencia.setDfofi("1m");
            ims.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(7L);
            incidencia.setTitulo("INCIDÊNCIA DE POLEGAR PERFIL");
            incidencia.setFoto1(R.drawable.ms7l1);
            incidencia.setFoto2(R.drawable.ms7l2);
            incidencia.setPosicionamento("Paciente de melhor modo possível, na extremidade da mesa, colocar a mão pronada, com, com os dedos totalmente fechados, de modo que a face lateral do polegar fique encostada no centro da metade do chassi. Articulações e cotovelo devem estar no mesmo plano de filme.");
            incidencia.setRc("perpendicular na vertical, entrando na  1°articulação metacarpofalangiana.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("13x18 cm, dividido transversalmente, sem buck.");
            incidencia.setDfofi("1m");
            ims.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(8L);
            incidencia.setTitulo("INCIDÊNCIA DE MÃO PA");
            incidencia.setFoto1(R.drawable.ms8l1);
            incidencia.setFoto2(R.drawable.ms8l2);
            incidencia.setPosicionamento("Paciente sentado na extremidade da mesa, de forma confortável, fazendo uma angulação de 90° com o cúbito, mantendo a articulação do ombro, cúbito e punho no mesmo plano para não haver rotação nos dedos a serem radiografados.");
            incidencia.setRc("perpendicular, incidindo na 3°articulação metacarpofalangiana do 3° dedo.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("24x30 cm, dividido longitudinalmente, sem buck.");
            incidencia.setDfofi("1m");
            ims.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(9L);
            incidencia.setTitulo("INCIDÊNCIA DE MÃO OBLIQUA");
            incidencia.setFoto1(R.drawable.ms9l1);
            incidencia.setFoto2(R.drawable.ms9l2);
            incidencia.setPosicionamento("Paciente sentado na extremidade da mesa, de forma confortável, com o cotovelo fletido a 90° e a articulação do ombro, cotovelo e punho no mesmo plano, com a mão em forma de leque.");
            incidencia.setRc("centralizado na 3°articulação metacarpofalangiana.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("24x30 cm, dividido longitudinalmente, sem buck.");
            incidencia.setDfofi("1m");
            ims.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(10L);
            incidencia.setTitulo("INCIDÊNCIA DE MÃOS E PUNHOS PA PARA IDADE ÓSSEA");
            incidencia.setFoto1(R.drawable.ms10l1);
            incidencia.setFoto2(R.drawable.ms10l2);
            incidencia.setPosicionamento("Paciente sentado na extremidade da mesa, de forma confortável, com os MMSS estendidos e alinhados, com a palma das mãos sobre o chassi e com os dedos levemente separados.");
            incidencia.setRc("perpendicular, entrando no centro do filme.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("24x30 cm, panorâmico, sem buck.");
            incidencia.setDfofi("1m");
            ims.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(11L);
            incidencia.setTitulo("INCIDÊNCIA PUNHO PA");
            incidencia.setFoto1(R.drawable.ms11l1);
            incidencia.setFoto2(R.drawable.ms11l2);
            incidencia.setPosicionamento("Paciente sentado na extremidade da mesa, de forma confortável, com o cotovelo a 90° e a articulação do ombro, cotovelo e punho no mesmo plano, com os dedos ligeiramente fletidos sobre o chassi.");
            incidencia.setRc("perpendicular, incidindo no meio da articulação do punho (osso capitato).");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24 cm, dividido longitudinalmente, sem buck.");
            incidencia.setDfofi("1m");
            ims.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(12L);
            incidencia.setTitulo("INCIDÊNCIA PUNHO PERFIL");
            incidencia.setFoto1(R.drawable.ms12l1);
            incidencia.setFoto2(R.drawable.ms12l2);
            incidencia.setPosicionamento("Paciente sentado na extremidade da mesa, de forma confortável, com o cotovelo fletido a 90°. Manter a articulações do ombro, cotovelo e punho no mesmo plano. Punho em perfil absoluto para que não haja rotação.");
            incidencia.setRc("perpendicular, incidindo no meio da articulação do punho (osso escafóide).");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24 cm, dividido longitudinalmente, sem buck.");
            incidencia.setDfofi("1m");
            ims.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(13L);
            incidencia.setTitulo("INCIDÊNCIA DE ESCAFÓIDE DESVIO ULNAR");
            incidencia.setFoto1(R.drawable.ms13l1);
            incidencia.setFoto2(R.drawable.ms13l2);
            incidencia.setPosicionamento("Paciente sentado na extremidade da mesa, de forma confortável, com membro estendido. A mão deverá fazer um desvio ulnar.");
            incidencia.setRc("com angulação cranial de 10° a 20° entrando no escafóide aproximadamente 2 cm distal ao processo estilóide do rádio. ");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24 cm, dividido em 4 partes ou 24x30cm, dividido em 6 partes, sem buck.");
            incidencia.setDfofi("1m");
            ims.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(14L);
            incidencia.setTitulo("INCIDÊNCIA DE ESCAFÓIDE PA FLEXÃO RADIAL");
            incidencia.setFoto1(R.drawable.ms14l1);
            incidencia.setFoto2(R.drawable.ms14l2);
            incidencia.setPosicionamento("Paciente sentado na extremidade da mesa, de forma confortável, com membro estendido para que não haja rotação do punho. A mão deverá fazer um desvio radial.");
            incidencia.setRc("perpendicular incidindo o no centro do escafóide.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24 cm, dividido em 4 partes ou 24x30 cm, dividido em 6 partes, sem buck.");
            incidencia.setDfofi("1m");
            ims.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(15L);
            incidencia.setTitulo("INCIDÊNCIA DE TÚNEL DO CARPO INFERO-SUPERIOR");
            incidencia.setFoto1(R.drawable.ms15l1);
            incidencia.setFoto2(R.drawable.ms15l2);
            incidencia.setPosicionamento("Paciente sentado na extremidade da mesa, de forma confortável, com membro estendido fazendo uma angulação de 90° com a mão e o punho, não podendo haver rotação do mesmo.");
            incidencia.setRc("com angulação de 25° a 30°, incidindo no centro da palma da mão.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24 cm, dividido transversalmente, sem buck.");
            incidencia.setDfofi("1m");
            ims.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(16L);
            incidencia.setTitulo("INCIDÊNCIA ANTEBRAÇO AP");
            incidencia.setFoto1(R.drawable.ms16l1);
            incidencia.setFoto2(R.drawable.ms16l2);
            incidencia.setPosicionamento("Paciente sentado na extremidade da mesa, de forma confortável, com membro estendido em supinação, mantendo a articulação do ombro, cotovelo e punho no mesmo plano.");
            incidencia.setRc("perpendicular, incidindo o no centro do antebraço.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("24x30 cm, dividido longitudinalmente, sem buck.");
            incidencia.setDfofi("1m");
            ims.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(17L);
            incidencia.setTitulo("INCIDÊNCIA COTOVELO AP");
            incidencia.setFoto1(R.drawable.ms17l1);
            incidencia.setFoto2(R.drawable.ms17l2);
            incidencia.setPosicionamento("Paciente sentado na extremidade da mesa, de forma confortável, com membro estendido, e mantendo a articulação do ombro cotovelo e punho no mesmo plano.");
            incidencia.setRc("perpendicular, incidindo o no centro do cotovelo.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24 cm, dividido longitudinalmente, sem buck.");
            incidencia.setDfofi("1m");
            ims.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(18L);
            incidencia.setTitulo("INCIDÊNCIA COTOVELO PERFIL");
            incidencia.setFoto1(R.drawable.ms18l1);
            incidencia.setFoto2(R.drawable.ms18l2);
            incidencia.setPosicionamento("Paciente sentado na extremidade da mesa, de forma confortável, fazendo uma angulação de 90°, com o cotovelo e mantendo a articulação do ombro, cotovelo e punho no esmo plano.");
            incidencia.setRc("perpendicular, incidindo o no centro da articulação do cúbito.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24 cm, dividido transversalmente, sem buck.");
            incidencia.setDfofi("1m");
            ims.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(19L);
            incidencia.setTitulo("INCIDÊNCIA ÚMERO AP");
            incidencia.setFoto1(R.drawable.ms19l1);
            incidencia.setFoto2(R.drawable.ms19l2);
            incidencia.setPosicionamento("Paciente em DD ou ortostático. Rodar o corpo em direção ao úmero afetado, de forma que a região posterior do ombro e do cotovelo esteja em contato com a mesa ou estativa.");
            incidencia.setRc("perpendicular, incidindo na região média do úmero.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("24x30cm ou 30x40cm. Avaliar estrutura.");
            incidencia.setDfofi("1m");
            ims.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(20L);
            incidencia.setTitulo("INCIDÊNCIA ÚMERO PERFIL");
            incidencia.setFoto1(R.drawable.ms20l1);
            incidencia.setFoto2(R.drawable.ms20l2);
            incidencia.setPosicionamento("Paciente em ortostático com o cotovelo parcialmente fletido. Rodar o úmero medialmente, de forma que os epicôndilos fiquem perpendiculares ao filme.");
            incidencia.setRc("perpendicular, incidindo na região medial do úmero.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("24x30cm ou 30x40cm.");
            incidencia.setDfofi("1m");
            ims.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(21L);
            incidencia.setTitulo("INCIDÊNCIA ÚMERO TRANSTORÁCICO");
            incidencia.setFoto1(R.drawable.ms21l1);
            incidencia.setFoto2(R.drawable.ms21l2);
            incidencia.setPosicionamento("Paciente em decúbito lateral com o chassi no lado de interesse. Abaixar um pouco o ombro do lado a ser radiografado. Apoiar a mão do lado oposto sobre a cabeça e assegurar que o paciente esteja em posição de perfil absoluto.");
            incidencia.setRc("perpendicular, incidindo na região média do úmero a ser radiografado.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("24x30cm ou 30x40cm, dividido longitudinalmente.");
            incidencia.setDfofi("1m");
            ims.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(22L);
            incidencia.setTitulo("INCIDÊNCIA OMBRO AP ROTAÇÃO NEUTRA");
            incidencia.setFoto1(R.drawable.ms22l1);
            incidencia.setFoto2(R.drawable.ms22l2);
            incidencia.setPosicionamento("Paciente em DD ou ortostático. Rodar o corpo levemente para o lado afetado. Colocar o úmero do paciente em rotação neutra formando com os epicôndilos uma angulação de 45° com a estativa.");
            incidencia.setRc("perpendicular, incidindo na articulação escápulo-umeral.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24 cm, panorâmico, com buck.");
            incidencia.setDfofi("1m");
            ims.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(23L);
            incidencia.setTitulo("INCIDÊNCIA OMBRO AP ROTAÇÃO EXTERNA (RE)");
            incidencia.setFoto1(R.drawable.ms23l1);
            incidencia.setFoto2(R.drawable.ms23l2);
            incidencia.setPosicionamento("Paciente em DD ou ortostático. Rodar o corpo levemente para o lado afetado, até apoiar o ombro na mesa ou estativa. Manter a articulação escápulo-umeral centralizada na LCM ou LCE. Abduzir uma pouco o antebraço e rodá-lo lateralmente. A mão deve estar em supinação e os epicôndilos do úmero em paralelo com a mesa ou estativa.");
            incidencia.setRc("perpendicular, incidindo na articulação escápulo-umeral mais ou menos 2cm abaixo do processo coracóide.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24 cm, panorâmico, com buck.");
            incidencia.setDfofi("1m");
            ims.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(24L);
            incidencia.setTitulo("INCIDÊNCIA OMBRO AP ROTAÇÃO INTERNA (RI)");
            incidencia.setFoto1(R.drawable.ms24l1);
            incidencia.setFoto2(R.drawable.ms24l2);
            incidencia.setPosicionamento("Paciente em DD ou ortostático. Rodar o corpo levemente para o lado afetado, até apoiar o ombro na mesa ou estativa. Manter a articulação escápulo-umeral centralizada na LCM ou LCE. Abduzir uma pouco o antebraço e rodá-lo internamente de forma que a mão fique em pronação e os epicôndilos fiquem perpendiculares a estativa ou mesa.");
            incidencia.setRc("perpendicular, incidindo na articulação escápulo-umeral mais ou menos 2cm abaixo do processo coracóide.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24 cm, panorâmico, com buck.");
            incidencia.setDfofi("1m");
            ims.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(25L);
            incidencia.setTitulo("INCIDÊNCIA OMBRO OBLIQUA POSTERIOR - MÉTODO DE GRASHEY");
            incidencia.setFoto1(R.drawable.ms25l1);
            incidencia.setFoto2(R.drawable.ms25l2);
            incidencia.setPosicionamento("Paciente em DD ou ortostático. Rodar o corpo da paciente aproximadamente de 35° a 45° para o lado afetado. Manter a articulação escápulo-umeral sobre a LCE e LCM. Abduzir um pouco o braço de forma que fique rotação neutra.");
            incidencia.setRc("perpendicular, incidindo na articulação escápulo-umeral.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24 cm, panorâmico, com buck.");
            incidencia.setDfofi("1m");
            ims.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(26L);
            incidencia.setTitulo("INCIDÊNCIA OMBRO AXIAL ÍNFERO-SUPERIOR - METODO DE LAWRENCE");
            incidencia.setFoto1(R.drawable.ms26l1);
            incidencia.setFoto2(R.drawable.ms26l2);
            incidencia.setPosicionamento("Paciente em DD, com o ombro elevado mais ou menos 8cm, usando um suporte de isopor abaixo do ombro e úmero. Deslocar o paciente na extremidade da mesa. Manter um suporte para o braço ficar abduzido. Girar a cabeça para o lado oposto e colocar o chassi na posição vertical, o mais próximo possível do pescoço, apoiando com outro suporte. Manter o braço a 90° em relação ao corpo e em rotação externa.");
            incidencia.setRc("perpendicular ao filme, incidindo na axila (cabeça do úmero).");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24 cm, panorâmico, sem buck.");
            incidencia.setDfofi("1m");
            ims.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(27L);
            incidencia.setTitulo("INCIDÊNCIA OMBRO AXIAL OBLIQUA APICAL - MÉTODO DE GARTH");
            incidencia.setFoto1(R.drawable.ms27l1);
            incidencia.setFoto2(R.drawable.ms27l2);
            incidencia.setPosicionamento("Paciente em ortostático de costas para estativa. Rodá-lo de forma que o ombro afetado fique em posição obliqua posterior, de 45°. Centralizar a articulação escápulo-umeral na LCE.");
            incidencia.setRc("incidindo na articulação escápulo-umeral, com uma angulação de 45° caudal.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24 cm, panorâmico, com buck.");
            incidencia.setDfofi("1m");
            ims.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(28L);
            incidencia.setTitulo("INCIDÊNCIA OMBRO AP - MÉTODO DE ZANCA");
            incidencia.setFoto1(R.drawable.ms28l1);
            incidencia.setFoto2(R.drawable.ms28l2);
            incidencia.setPosicionamento("Paciente em decúbito dorsal ou ortostático, com região posterior do ombro apoiada na LCM ou LCE. O braço deverá estar em rotação neutra.");
            incidencia.setRc("angulação 20°cranial, entrando na articulação acromioclavicular.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24 cm, panorâmico, com buck.");
            incidencia.setDfofi("1m");
            ims.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(29L);
            incidencia.setTitulo("INCIDÊNCIA OMBRO AP - MÉTODO DE STRIKER");
            incidencia.setFoto1(R.drawable.ms29l1);
            incidencia.setFoto2(R.drawable.ms29l2);
            incidencia.setPosicionamento("Paciente em decúbito dorsal ou ortostático, com o ombro a ser radiografado sobre LCM, LCE. Elevar a mão acima da cabeça com o cotovelo apontado para o colimador e o braço em rotação interna; o outro membro superior estendido ao longo do corpo.");
            incidencia.setRc("perpendicular, entrando na articulação escápulo-umeral.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24 cm, panorâmico longitudinal, com buck.");
            incidencia.setDfofi("1m");
            ims.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(30L);
            incidencia.setTitulo("INCIDÊNCIA OMBRO PERFIL EM “Y” ESCAPULAR POSIÇÃO OBLIQUA ANTERIOR");
            incidencia.setFoto1(R.drawable.ms30l1);
            incidencia.setFoto2(R.drawable.ms30l2);
            incidencia.setPosicionamento("Paciente em ortostático e de frente para estativa. Rodá-lo até que fique em uma posição obliqua anterior, entre 45° e 60°. Palpar as bordas escapulares para determinar a rotação correta. Manter a articulação escápulo-umeral sobre a LCE. Elevar o braço para frente e apoiar a mão no ombro não radiografado.");
            incidencia.setRc("perpendicular, incidindo na articulação escápulo-umeral.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24 cm, panorâmico, com buck.");
            incidencia.setDfofi("1m");
            ims.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(31L);
            incidencia.setTitulo("INCIDÊNCIA DA ARTICULAÇÃO ACROMIOCLAVICULAR CAMPARATIVA COM E SEM PESO");
            incidencia.setFoto1(R.drawable.ms31l1);
            incidencia.setFoto2(R.drawable.ms31l2);
            incidencia.setPosicionamento("Paciente em ortostático e em AP, não podendo haver rotação nos ombros e quadris, e com o peso do corpo distribuído igualmente pelos MMII. Sem movimentar o paciente, serão realizadas 2 radiografias, uma com peso e outra sem peso.");
            incidencia.setRc("perpendicular, incidindo em um ponto médio entre as articulações esternoclaviculares.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("30x40 cm ou 35x43 cm, panorâmico, com buck.");
            incidencia.setDfofi("1,80m");
            ims.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(32L);
            incidencia.setTitulo("INCIDÊNCIA CLAVÍCULA AP");
            incidencia.setFoto1(R.drawable.ms32l1);
            incidencia.setFoto2(R.drawable.ms32l2);
            incidencia.setPosicionamento("Paciente em DD ou ortostático, com braço ao lado do corpo e sem rotação. Manter o queixo elevado e olhando horizonte. O ombro deve estar em contato com a estativa ou mesa. Centralizar clavícula sobre a LCE ou LCM");
            incidencia.setRc("perpendicular no meio da clavícula.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24 cm ou 24x30 cm, panorâmico, com buck.");
            incidencia.setDfofi("1m");
            ims.add(incidencia);

            incidencia = new Incidencia();
            incidencia.setId(33L);
            incidencia.setTitulo("INCIDÊNCIA ESCÁPULA AP");
            incidencia.setFoto1(R.drawable.ms33l1);
            incidencia.setFoto2(R.drawable.ms33l2);
            incidencia.setPosicionamento("Paciente em DD ou ortostático. Manter região posterior do ombro em contato com a estativa ou mesa, não podendo haver rotação no tórax. Manter a escápula na LCE ou LCM. Abduzir levemente o braço a 90° e manter o dorso dos dedos sobre a cabeça (frontal).");
            incidencia.setRc("perpendicular incidindo no meio da escápula.");
            incidencia.setColimar("Colimar área de interesse.");
            incidencia.setCh("18x24 cm ou 24x30 cm, panorâmico, com buck.");
            incidencia.setDfofi("1m");
            ims.add(incidencia);
        }
        return ims;
    }
}

