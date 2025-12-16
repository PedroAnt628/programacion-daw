public class CocheNuevo {
    private String id;
    private String matricula;
    private Version version;

    public CocheNuevo(String id, String matricula, Version version) {
        this.id = id;
        this.matricula = matricula;
        this.version = version;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "CocheNuevo [id=" + id + ", matricula=" + matricula + ", version=" + version + "]";
    }
}