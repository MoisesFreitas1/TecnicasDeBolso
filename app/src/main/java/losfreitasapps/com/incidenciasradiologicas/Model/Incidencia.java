package losfreitasapps.com.incidenciasradiologicas.Model;

/**
 * Created by Moises on 29/10/16.
 */

public class Incidencia {

    private Long id;
    private String titulo;
    private String posicionamento;
    private String rc;
    private String colimar;
    private String ch;
    private String dfofi;
    private int foto1;
    private int foto2;

    public Incidencia() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPosicionamento() {
        return posicionamento;
    }

    public void setPosicionamento(String posicionamento) {
        this.posicionamento = posicionamento;
    }

    public String getRc() {
        return rc;
    }

    public void setRc(String rc) {
        this.rc = rc;
    }

    public String getColimar() {
        return colimar;
    }

    public void setColimar(String colimar) {
        this.colimar = colimar;
    }

    public String getCh() {
        return ch;
    }

    public void setCh(String ch) {
        this.ch = ch;
    }

    public String getDfofi() {
        return dfofi;
    }

    public void setDfofi(String dfofi) {
        this.dfofi = dfofi;
    }

    public int getFoto1() {
        return foto1;
    }

    public void setFoto1(int foto1) {
        this.foto1 = foto1;
    }

    public int getFoto2() {
        return foto2;
    }

    public void setFoto2(int foto2) {
        this.foto2 = foto2;
    }

}
