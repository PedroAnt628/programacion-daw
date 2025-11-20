public class Tren {
    private Locomotora locomotora = null;
    private Vagon vagon = null;
    private Maquinistas maquinistas = null;

    public Tren(Locomotora locomotora, Vagon vagon, Maquinistas maquinistas) {
        this.locomotora = locomotora;
        this.vagon = vagon;
        this.maquinistas = maquinistas;
    }

    public Locomotora getLocomotora() {
        return locomotora;
    }

    public void setLocomotora(Locomotora locomotora) {
        this.locomotora = locomotora;
    }

    public Vagon getVagon() {
        return vagon;
    }

    public void setVagon(Vagon vagon) {
        this.vagon = vagon;
    }

    public Maquinistas getMaquinistas() {
        return maquinistas;
    }

    public void setMaquinistas(Maquinistas maquinistas) {
        this.maquinistas = maquinistas;
    }

    @Override
    public String toString() {
        return "Tren [locomotora=" + locomotora + ", vagon=" + vagon + ", maquinistas=" + maquinistas + "]";
    }

    
    
}
