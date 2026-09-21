public non-sealed class RelogioUS extends Relogio{

    private String periodo;

    public String getPeriodo() {
        return periodo;
    }

    public void setPosMeioDia(){
        this.periodo = "PM";
    };

    public void setAntesMeioDia(){
        this.periodo = "AM";
    };

    @Override
    public Relogio convert(final Relogio relogio) {
        this.segundo = relogio.getSegundo();
        this.minuto = relogio.getMinuto();
        switch (relogio) {
            case RelogioUS relogioUS -> {
                this.hora = getHora();
                this.periodo = relogioUS.getPeriodo();
            }

            case RelogioBR relogioBR -> this.setHora(relogioBR.getHora());
        }
        return this;
    }

    public void setHora(int hora) {
       if (hora > 12 && hora <= 23) {
           this.hora = hora - 12;
          setPosMeioDia();
       }
       else if (hora >= 24){
           this.hora = 0;
           setAntesMeioDia();
       }
       else {
           this.hora = hora;
       }
    }

    @Override
    public String getTime() {
        return super.getTime() + " " + this.periodo;
    }
}
