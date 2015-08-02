package entity;

public class Catalog {
    private String id;
    private String name;
    private int image;

    public Catalog() {
    }

    public Catalog(String name, int image) {
        this.name = name;
        this.image = image;
        this.id = generationId();
    }

    private String generationId() {
        StringBuilder sb = new StringBuilder();
        sb.append("00");
        sb.append("_" + getName().length());
        sb.append("_" + getImage() + "_");
        if (getName() != null) {
            String str = this.getName();
            sb.append(str.replace(' ', '_'));
        }
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Catalog catalog = (Catalog) o;

        if (image != catalog.image) return false;
        if (id != null ? !id.equals(catalog.id) : catalog.id != null) return false;
        return !(name != null ? !name.equals(catalog.name) : catalog.name != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + image;
        return result;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", image=" + image +
                '}';
    }
}
