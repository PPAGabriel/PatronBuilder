package org.example;

public class Pizzas {
    private int tipoMasa;
    private int size;
    private boolean rellena;
    private boolean cebolla;
    private  boolean sinGluten;
    private int recogida;

    //tipo masa
    public static final int FINA = 0;
    public static final int NORMAL = 1;

    //size
    public static final int SMALL = 0;
    public static final int MEDIANA = 1;
    public static final int GRANDE = 2;

    //recogida
    public static final int TIENDA = 0;
    public static final int PARALLEVAR = 1;

    public Pizzas() {
        this.cebolla = true;
        this.recogida = TIENDA;
        this.rellena = false;
        this.sinGluten = false;
        this.size = MEDIANA;
        this.tipoMasa = FINA;
    }
    /**
     * Constructor con todos los parametros
     * @param tipoMasa espesor de la masa
     * @param size tamaño de la pizza
     * @param rellena si el borde esta relleno de queso
     * @param cebolla lleva o no lleva cebolla
     * @param sinGluten para celíacos
     * @param recogida como lo va a recoger el cliente
     */
    public Pizzas(int tipoMasa, int size, boolean rellena, boolean cebolla,boolean sinGluten, int recogida) {
        this.tipoMasa = tipoMasa;
        this.size = size;
        this.rellena = rellena;
        this.cebolla = cebolla;
        this.sinGluten = sinGluten;
        this.recogida = recogida;
    }

    public int getTipoMasa() {
        return tipoMasa;
    }

    public void setTipoMasa(int tipoMasa) {
        this.tipoMasa = tipoMasa;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isRellena() {
        return rellena;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public void setRellena(boolean rellena) {
        this.rellena = rellena;
    }

    public boolean isSinGluten() {
        return sinGluten;
    }

    public void setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
    }

    public int getRecogida() {
        return recogida;
    }

    public void setRecogida(int recogida) {
        this.recogida = recogida;
    }

    @Override
    public String toString() {
        return
                "Tipo de masa:" + tipoMasa +
                        "\nSize:" + size +
                        "\nRellena:" + rellena +
                        "\nCebolla:" + cebolla +
                        "\nSin Gluten:" + sinGluten +
                        "\nRecogida:" + recogida;
    }
}
