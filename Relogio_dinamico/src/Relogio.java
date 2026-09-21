public sealed abstract class Relogio permits RelogioBR, RelogioUS {
    protected int hora;
    protected int minuto;
    protected int segundo;

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora > 24) {
            this.hora = 24;
            return;
        }
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto > 60) {
            this.minuto = 60;
            return;
        }
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo > 60) {
            this.segundo = 60;
            return;
        }
        this.segundo = segundo;
    }
    public String getTime(){
        return hora + ":" + minuto + ":" + segundo;
    };

    abstract Relogio convert(Relogio relogio);
}
