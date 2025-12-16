public class VersionExtra {
    private Version version;
    private Extra extra;
    private String precio;

    public VersionExtra(Version version, Extra extra, String precio) {
        this.version = version;
        this.extra = extra;
        this.precio = precio;
    }

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    public Extra getExtra() {
        return extra;
    }

    public void setExtra(Extra extra) {
        this.extra = extra;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() { 
        return "VersionExtra [version=" + version + ", extra=" + extra + ", precio=" + precio + "]";
    }
}
