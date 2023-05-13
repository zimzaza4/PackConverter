package org.geysermc.pack.bedrock.resource.manifest;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;

/**
 * Subpacks
 * <p>
 * A single definition of a subpack.
 */
public class Subpacks {
  @JsonProperty("folder_name")
  public String folderName;

  public String name;

  @JsonProperty("memory_tier")
  public float memoryTier;

  /**
   * This represents the folder name located in "subpacks" folder. When user select this resolution Minecraft loads the content inside the folder.
   *
   * @return Folder Name
   */
  public String folderName() {
    return this.folderName;
  }

  /**
   * This represents the folder name located in "subpacks" folder. When user select this resolution Minecraft loads the content inside the folder.
   *
   * @param folderName Folder Name
   */
  public void folderName(String folderName) {
    this.folderName = folderName;
  }

  /**
   * This is the name of the pack resolution. This lets user know what resolution they are choosing.
   *
   * @return Name
   */
  public String name() {
    return this.name;
  }

  /**
   * This is the name of the pack resolution. This lets user know what resolution they are choosing.
   *
   * @param name Name
   */
  public void name(String name) {
    this.name = name;
  }

  /**
   * This creates a requirement on the capacity of memory needed to select the resolution. Each tier increases memory requirement by 256 MB.
   *
   * @return Memory Tier
   */
  public float memoryTier() {
    return this.memoryTier;
  }

  /**
   * This creates a requirement on the capacity of memory needed to select the resolution. Each tier increases memory requirement by 256 MB.
   *
   * @param memoryTier Memory Tier
   */
  public void memoryTier(float memoryTier) {
    this.memoryTier = memoryTier;
  }
}
