public non-sealed class RelogioBR extends Relogio {
    @Override
    public Relogio convert(final Relogio relogio) {
        this.segundo = relogio.getSegundo();
        this.minuto = relogio.getMinuto();
        switch (relogio) {
            case RelogioUS
                relogioUS -> this.hora = (relogioUS.getPeriodo().equals("PM")) ? relogioUS.getHora() + 12 : relogioUS.getHora();
            case RelogioBR relogioBR -> this.hora = relogioBR.getHora();
        }
        return this;
    }
}
