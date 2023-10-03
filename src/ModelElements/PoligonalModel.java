package ModelElements;

import java.util.List;

public class PoligonalModel {
    List<Poligon> poligons;
    List<Texture> textures;

    public PoligonalModel(List<Texture> textures, List<Poligon> poligons) {
        this.poligons = poligons;
        this.textures = textures;

    }
}
