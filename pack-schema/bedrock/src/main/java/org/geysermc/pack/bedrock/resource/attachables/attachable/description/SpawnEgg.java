package org.geysermc.pack.bedrock.resource.attachables.attachable.description;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;

/**
 * Spawn Egg
 */
public class SpawnEgg {
  @JsonProperty("base_colour")
  public String baseColour;

  @JsonProperty("overlay_color")
  public String overlayColor;

  public String texture;

  @JsonProperty("texture_index")
  public int textureIndex;

  /**
   * @return Base Colour
   */
  public String baseColour() {
    return this.baseColour;
  }

  /**
   * @param baseColour Base Colour
   */
  public void baseColour(String baseColour) {
    this.baseColour = baseColour;
  }

  /**
   * @return Overlay Color
   */
  public String overlayColor() {
    return this.overlayColor;
  }

  /**
   * @param overlayColor Overlay Color
   */
  public void overlayColor(String overlayColor) {
    this.overlayColor = overlayColor;
  }

  /**
   * @return Texture
   */
  public String texture() {
    return this.texture;
  }

  /**
   * @param texture Texture
   */
  public void texture(String texture) {
    this.texture = texture;
  }

  /**
   * @return Texture Index
   */
  public int textureIndex() {
    return this.textureIndex;
  }

  /**
   * @param textureIndex Texture Index
   */
  public void textureIndex(int textureIndex) {
    this.textureIndex = textureIndex;
  }
}
