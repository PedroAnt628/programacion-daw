public class ExtraCocheNuevo {
    private CocheNuevo cocheNuevo;
    private Extra extra;

    public ExtraCocheNuevo(CocheNuevo cocheNuevo, Extra extra) {
        this.cocheNuevo = cocheNuevo;
        this.extra = extra;
    }

    public CocheNuevo getCocheNuevo() {
        return cocheNuevo;
    }

    public void setCocheNuevo(CocheNuevo cocheNuevo) {
        this.cocheNuevo = cocheNuevo;
    }

    public Extra getExtra() {
        return extra;
    }

    public void setExtra(Extra extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        return "ExtraCocheNuevo [cocheNuevo=" + cocheNuevo + ", extra=" + extra + "]";
    }
}
